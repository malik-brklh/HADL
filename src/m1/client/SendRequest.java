package m1.client;

import m2.ElementArchitecturale;
import m2.Message;
import m2.composant.Composant;
import m2.composant.PortCptFourni;

public class SendRequest extends PortCptFourni {

	public SendRequest() {
		super("SendRequest", null);
	}
//	
//	public SendRequest(Composant parent) {
//		super("SendRequest", parent);
//	}
//
//	@Override
//	public void sendMessage(ElementArchitecturale sender, Message m) {
//		m.addTrace("Passage par "+this.getName());
//		if(sender == getParent()){
//			this.setChanged();
//			this.notifyObservers(m);
//		}else{
//			getParent().sendMessage(this, m);
//		}
//	}

}
