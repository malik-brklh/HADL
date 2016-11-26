package m1.serveur.detail;

import m2.Message;
import m2.configuration.Configuration;
import m2.configuration.InterfaceCfg;

public class ServeurDetail extends Configuration {

	public ServeurDetail(String name) {
		super(name, null);
	}
	
	@Override
	public void sendMessage(Object sender, Message m) {
		m.addTrace("Passage par " + this.getName());
		if (sender.getClass() == ReceiveRequest.class) {
			for (InterfaceCfg i : getInterfaceCfgs()) {
				if (i.getClass() == SendResponse.class) {
					i.sendMessage(this, m);
					break;
				}
			}
		} else if (sender.getClass() == SendResponse.class) {
			for (InterfaceCfg i : getInterfaceCfgs()) {
				if (i.getClass() == ReceiveRequest.class) {
					i.sendMessage(this, m);
					break;
				}
			}
		}
	}

}
