package m2.composant;

import java.util.Observable;

import m2.ElementArchitecturale;
import m2.Message;

public abstract class InterfaceCpt extends Observable {
	
	private String name;
	private Composant parent;

	
	public InterfaceCpt(String name, Composant parent) {
		super();
		this.name = name;
		setParent(parent);
	}
	
	public Composant getParent() {
		return parent;
	}

	public void setParent(Composant parent) {
		this.parent = parent;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	/*
	 * on implémente cette méthode dans M1 et chaque element il connait s'il va envoyé vers son parent le composant
	 * ou s'il doit notifier les observateur
	 */
	public void sendMessage(ElementArchitecturale sender, Message m){
		m.addTrace("Passage par "+getParent().getName()+" - "+this.getName());
		if(sender == getParent()){
			this.setChanged();
			this.notifyObservers(m);
		}else{
			getParent().sendMessage(this, m);
		}	
	}
   
	
}
