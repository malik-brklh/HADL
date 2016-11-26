package m2.connecteur;

import java.util.ArrayList;

import m2.ElementArchitecturale;
import m2.Message;

public class Connecteur extends ElementArchitecturale {

	private ArrayList<Glue> glues;
	private ArrayList<InterfaceCnt> interfaceCnts;

	public Connecteur(String name, ElementArchitecturale parent) {
		super(name, parent);
		interfaceCnts = new ArrayList<InterfaceCnt>();
		setGlues(new ArrayList<Glue>());
	}

	public void addRole(InterfaceCnt r) {
		if (!interfaceCnts.contains(r)){
			r.setParent(this);
			this.interfaceCnts.add(r);
		}
	}

	public void addGlue(InterfaceCnt called, InterfaceCnt caller) {
		addRole(caller);
		addRole(called);
		this.glues.add(new Glue(this, called, caller));
	}

	public ArrayList<InterfaceCnt> getInterfaceCnts() {
		return interfaceCnts;
	}

	public void setInterfaceCnts(ArrayList<InterfaceCnt> interfaceCpts) {
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

	@Override
	public void sendMessage(Object sender, Message m) {
		m.addTrace("Passage par " + getName());
		for (Glue g : glues) {
			if (g.getRoleCntFournis() == sender) {
				g.getRoleCntRequis().sendMessage(this, m);
				break;
			} else if (g.getRoleCntRequis() == sender) {
				g.getRoleCntFournis().sendMessage(this, m);
				break;
			}
		}
	}
}
