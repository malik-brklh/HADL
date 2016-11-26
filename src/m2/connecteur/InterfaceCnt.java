package m2.connecteur;

import java.util.Observable;

import m2.ElementArchitecturale;
import m2.Message;

public abstract class InterfaceCnt extends Observable{
	private String name;
	private Connecteur parent;
	
	public Connecteur getParent() {
		return parent;
	}

	public void setParent(Connecteur parent) {
		this.parent = parent;
	}

	public InterfaceCnt(String name, Connecteur parent) {
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
	
	public void sendMessage(ElementArchitecturale sender, Message m){
		m.addTrace("Passage par "+getName());
		if(sender == getParent()){
			setChanged();
			notifyObservers(m);
		}else{
			getParent().sendMessage(this, m);
		}
	}
	   
	   
}
