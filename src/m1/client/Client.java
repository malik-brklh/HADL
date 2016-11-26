package m1.client;

import m2.Message;
import m2.composant.Composant;
import m2.composant.InterfaceCpt;

public class Client extends Composant {

	public Client(String name) {
		super(name, null);
	}

	@Override
	public void sendMessage(Object sender, Message m) {
		m.addTrace("Passage par " + this.getName());
		if (sender.getClass() == SendRequest.class) {
			for (InterfaceCpt i : getInterfaceCpts()) {
				if (i.getClass() == ReceiveResponse.class) {
					i.sendMessage(this, m);
					break;
				}
			}
		} else if (sender.getClass() == ReceiveResponse.class) {
			for (InterfaceCpt i : getInterfaceCpts()) {
				if (i.getClass() == SendRequest.class) {
					i.sendMessage(this, m);
					break;
				}
			}
		}
	}

}
