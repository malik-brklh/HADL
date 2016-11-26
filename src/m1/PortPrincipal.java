package m1;

import m2.ElementArchitecturale;
import m2.Message;
import m2.configuration.PortCfg;

public class PortPrincipal extends PortCfg {

	private static boolean waitingForResponse= false;
	
	public PortPrincipal() {
		super("Port Principal");
	}

	@Override
	public void sendMessage(ElementArchitecturale sender, Message m) {
		m.addTrace("Passage par "+getParent().getName()+" - "+this.getName());
		if (countObservers()==0)
			addObserver(getParent());

		if(sender == getParent() && waitingForResponse==false){
			waitingForResponse=true;
			this.setChanged();
			this.notifyObservers(m);
		}else{
			getParent().sendMessage(this, m);
		}	
	}
}
