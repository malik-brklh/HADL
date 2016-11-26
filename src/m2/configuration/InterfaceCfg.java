package m2.configuration;

import java.util.Observable;

import m2.ElementArchitecturale;
import m2.Message;
import m2.composant.Composant;

public abstract class InterfaceCfg  extends Observable{

	private String name;
	private Configuration parent;
	public InterfaceCfg(String name) {
		super();
		//this.deleteObservers();
		this.name = name;
	}
	public InterfaceCfg(String name, Configuration parent) {
		super();
		this.name = name;
		this.parent = parent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Configuration getParent() {
		return parent;
	}
	public void setParent(Configuration parent) {
		this.parent = parent;
	}
	
	public void sendMessage(ElementArchitecturale sender, Message m){
		m.addTrace("Passage par "+getParent().getName()+" - "+this.getName());
		if (countObservers()==0)
			addObserver(getParent());

		if(sender == getParent()){
			this.setChanged();
			this.notifyObservers(m);
		}else{
			getParent().sendMessage(this, m);
		}	
	}
	
	
}
