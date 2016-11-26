package m1.client;

import m2.ElementArchitecturale;
import m2.Message;
import m2.composant.Composant;
import m2.composant.PortCptRequis;

public class ReceiveResponse extends PortCptRequis {


	public ReceiveResponse() {
		super("ReceiveResponse", null);
	}

//	@Override
//	public void sendMessage(ElementArchitecturale sender, Message m) {
//		if (sender!=getParent()){
//			m.addTrace("Passage par "+this.getName());
//			getParent().sendMessage(this,m);	
//		}else{
//			setChanged();
//			notifyObservers(m);
//		}
//		
//		
//	}

}
