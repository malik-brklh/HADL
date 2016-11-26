package m1.serveur.detail;

import m2.ElementArchitecturale;
import m2.Message;
import m2.configuration.PortCfgRequis;

public class ReceiveRequest extends PortCfgRequis {

	public ReceiveRequest() {
		super("ReceiveRequest");
	}
	
	@Override
	public void sendMessage(ElementArchitecturale sender, Message m) {
		
	}

}
