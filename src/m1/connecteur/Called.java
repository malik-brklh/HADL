package m1.connecteur;

import m2.ElementArchitecturale;
import m2.Message;
import m2.connecteur.Connecteur;
import m2.connecteur.RoleCntFourni;

public class Called extends RoleCntFourni {

	public Called() {
		super("Called", null);
	}
//
//	@Override
//	public void sendMessage(ElementArchitecturale sender, Message m) {
//		m.addTrace("Passage par "+getName());
//		if(sender == getParent()){
//			setChanged();
//			notifyObservers(m);
//		}else{
//			getParent().sendMessage(this, m);
//		}
//	}

}
