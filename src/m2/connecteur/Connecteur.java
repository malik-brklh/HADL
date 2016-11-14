package m2.connecteur;

import java.util.ArrayList;

import m2.ElementArchitecturale;

public class Connecteur extends ElementArchitecturale{
	
	private ArrayList<Glue> glues ;
	private ArrayList<InterfaceCnt> interfaceCnts;

	public Connecteur(String name) {
		super(name);
		interfaceCnts = new ArrayList<InterfaceCnt>();
		setGlues(new ArrayList<Glue>());
	}


	public ArrayList<InterfaceCnt> getInterfaceCpts() {
		return interfaceCnts;
	}

	public void setInterfaceCpts(ArrayList<InterfaceCnt> interfaceCpts) {
		this.interfaceCnts = interfaceCpts;
	}


	public ArrayList<Glue> getGlues() {
		return glues;
	}


	public void setGlues(ArrayList<Glue> glues) {
		this.glues = glues;
	}
	/**
	 * on ajoute 2 roles + 1 glue, la glue va relier entre ces 2 role
	 */
	public void addConnection(RoleCntFourni rf, RoleCntRequis rr, Glue g){
		g.setRoleCntFournis(rf);
		g.setRoleCntRequis(rr);
		this.glues.add(g);
		this.interfaceCnts.add(rf);
		this.interfaceCnts.add(rr);
	}
}
