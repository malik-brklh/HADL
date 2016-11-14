package m2.composant;

import java.util.ArrayList;

import m2.ElementArchitecturale;

public class Composant extends ElementArchitecturale{

	private ArrayList<InterfaceCpt> interfaceCpt;
	
	public Composant(String name) {
		super(name);
	}

	public ArrayList<InterfaceCpt> getInterfaceCpt() {
		return interfaceCpt;
	}

	public void setInterfaceCpt(ArrayList<InterfaceCpt> interfaceCpt) {
		this.interfaceCpt = interfaceCpt;
	}
	
	
}
