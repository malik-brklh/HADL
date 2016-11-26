package m1.serveur.detail.database;

import m1.serveur.detail.connectionmanager.DbQuery;
import m1.serveur.detail.connectionmanager.ExternalSocket;
import m1.serveur.detail.connectionmanager.SecurityCheck;
import m2.ElementArchitecturale;
import m2.Message;
import m2.composant.Composant;
import m2.composant.InterfaceCpt;

public class DataBase extends Composant {

	public DataBase(String name) {
		super(name, null);
	}

	/**
	 * pour que la database fournie le msg pour le username spécifié, il doit
	 * être bien authentifié
	 */
	@Override
	public void sendMessage(Object sender, Message m) {
		m.addTrace("Passage par " + this.getName());
		// requise
		// on doit s'assurer que les donnée de l'utilisateur sont correcte et ne
		// sont pas falcifié
		if (sender.getClass() == QueryManager.class) {
			m.addLog("test authentification... ");
			for (InterfaceCpt i : getInterfaceCpts()) {
				if (i.getClass() == SecurityDbCheck.class) {
					i.sendMessage(this, m);
					break;
				}
			}
			// fournies
		} else if (sender.getClass() == SecurityDbCheck.class) {
			if (m.isAuth()) {
				m.addLog("test authentification validé. ");
				traitement(m);
				for (InterfaceCpt i : getInterfaceCpts()) {
					if (i.getClass() == QueryManager.class) {
						i.sendMessage(this, m);
						break;
					}
				}
			}
		}

	}

	private void traitement(Message m) {
		m.setValue("voici ma valeur finale");
	}

}
