package m1.serveur;

import m2.Message;
import m2.composant.Composant;
import m2.composant.InterfaceCpt;

public class Serveur extends Composant {

	public Serveur(String name) {
		super(name, null);
	}

	@Override
	public void sendMessage(Object sender, Message m) {
		m.addTrace("Passage par " + this.getName());
		if (sender.getClass() == ReceiveRequest.class) {
			for (InterfaceCpt i : getInterfaceCpts()) {
				if (i.getClass() == SendResponse.class) {
					i.sendMessage(this, m);
					break;
				}
			}
		} else if (sender.getClass() == SendResponse.class) {
			for (InterfaceCpt i : getInterfaceCpts()) {
				if (i.getClass() == ReceiveRequest.class) {
					i.sendMessage(this, m);
					break;
				}
			}
		}

	}

}
