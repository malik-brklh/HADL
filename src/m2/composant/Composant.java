package m2.composant;

import java.util.ArrayList;

import m2.ElementArchitecturale;

public abstract class Composant extends ElementArchitecturale  {

	public Composant(String name, ElementArchitecturale parent) {
		super(name, parent);
		setInterfaceCpts(new ArrayList<InterfaceCpt>());
		
	}


	private ArrayList<InterfaceCpt> interfaceCpts;
	

	public ArrayList<InterfaceCpt> getInterfaceCpts() {
		return interfaceCpts;
	}

	public void setInterfaceCpts(ArrayList<InterfaceCpt> interfaceCpts) {
		this.interfaceCpts = interfaceCpts;
	}


	public void addInterface(InterfaceCpt i){
		i.setParent(this);
		getInterfaceCpts().add(i);
	}
	//public abstract void sendMessage (InterfaceCpt sender, Message m);
}
