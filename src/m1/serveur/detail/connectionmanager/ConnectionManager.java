package m1.serveur.detail.connectionmanager;

import m2.Message;
import m2.composant.Composant;
import m2.composant.InterfaceCpt;

public class ConnectionManager extends Composant {

	public ConnectionManager(String name) {
		super(name, null);
	}

	@Override
	public void sendMessage(Object sender, Message m) {
		m.addTrace("Passage par " + this.getName());
		// requise
		if (sender.getClass() == ExternalSocket.class) {
			m.addLog("Going to Authentification... ");
			for (InterfaceCpt i : getInterfaceCpts()) {
				if (i.getClass() == SecurityCheck.class) {
					i.sendMessage(this, m);
					break;
				}
			}
			// fournies
		} else if (sender.getClass() == SecurityCheck.class) {
			// si l'utilisateur est bien authentifié, envoyé le message vers la
			// BD
			if (m.isAuth()) {
				m.addLog("Bien authentifié. ");
				for (InterfaceCpt i : getInterfaceCpts()) {
					if (i.getClass() == DbQuery.class) {
						i.sendMessage(this, m);
						break;
					}
				}
			} else { // l'utilisateur n'est pas authentifié
				m.addLog("Authentification échoué... ");
				for (InterfaceCpt i : getInterfaceCpts()) {
					if (i.getClass() == ExternalSocket.class) {
						i.sendMessage(this, m);
						break;
					}
				}
			}
		} else if (sender.getClass() == DbQuery.class) {
			for (InterfaceCpt i : getInterfaceCpts()) {
				if (i.getClass() == ExternalSocket.class) {
					i.sendMessage(this, m);
					break;
				}
			}
		}
	}

}
