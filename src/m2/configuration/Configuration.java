package m2.configuration;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import m2.ElementArchitecturale;
import m2.Message;
import m2.composant.Composant;
import m2.composant.InterfaceCpt;
import m2.connecteur.Connecteur;
import m2.connecteur.InterfaceCnt;
import m2.lien.Attachement;
import m2.lien.Binding;

public abstract class Configuration extends ElementArchitecturale implements Observer {

	private ArrayList<InterfaceCfg> interfaceCfgs;
	private ArrayList<ElementArchitecturale> elements;
	private ArrayList<Binding> bindings;
	private ArrayList<Attachement> attachements;

	public Configuration(String name, ElementArchitecturale parent) {
		super(name, parent);
		setInterfaceCfgs(new ArrayList<InterfaceCfg>());
		setAttachements(new ArrayList<Attachement>());
		setBindings(new ArrayList<Binding>());
		setElements(new ArrayList<ElementArchitecturale>());
	}

	public void addInterface(InterfaceCfg i) {
		i.setParent(this);
		this.interfaceCfgs.add(i);
	}

	public ArrayList<InterfaceCfg> getInterfaceCfgs() {
		return interfaceCfgs;
	}

	public void setInterfaceCfgs(ArrayList<InterfaceCfg> interfaceCfgs) {
		this.interfaceCfgs = interfaceCfgs;
	}

	public ArrayList<ElementArchitecturale> getElements() {
		return elements;
	}

	public void setElements(ArrayList<ElementArchitecturale> elements) {
		this.elements = elements;
	}

	public ArrayList<Binding> getBindings() {
		return bindings;
	}

	public void setBindings(ArrayList<Binding> bindings) {
		this.bindings = bindings;
	}

	public ArrayList<Attachement> getAttachements() {
		return attachements;
	}

	public void setAttachements(ArrayList<Attachement> attachements) {
		this.attachements = attachements;
	}

	/*
	 * pour que la configuration observe les msg de ses éléments, elle observe leurs ports ou roles (s'ajoute à leurs liste d'observateur 
	 */
	public void addElement(ElementArchitecturale e) {
		e.setParent(this);
		if (e instanceof Connecteur) {
			for (InterfaceCnt i : ((Connecteur) e).getInterfaceCnts())
				i.addObserver(this);
		} else if (e instanceof Composant) {
			for (InterfaceCpt i : ((Composant) e).getInterfaceCpts())
				i.addObserver(this);
		} else if (e instanceof Configuration) {
			for (InterfaceCfg i : ((Configuration) e).getInterfaceCfgs())
				i.addObserver(this);
		}
		elements.add(e);
	}

	public void addBinding(InterfaceCpt cpt, InterfaceCfg cfg) {
		Binding b = new Binding(cpt, cfg);
		this.bindings.add(b);
		cpt.addObserver(this);
		cfg.addObserver(this);

	}

	public void addAttachement(InterfaceCpt sendRequest, InterfaceCnt caller) {
		this.attachements.add(new Attachement(sendRequest, caller));
	}

	/*
	 * 
	 */
	@Override
	public void update(Observable o, Object arg) {
		Message m = (Message) arg;
		for (Attachement a : attachements) {
			if (a.getPortCpt() == o) {
				a.getRoleCnt().sendMessage(this, m);
				return;
			} else if (a.getRoleCnt() == o) {
				a.getPortCpt().sendMessage(this, m);
				return;
			}
		}
		// c'est un message à envoyé vers l'extérieur donc à travers un
		// binding
		for (Binding b : bindings) {
			if (b.getPortCfg() == o) {
				// on va envoyé la réponse au composant en dehors de cette
				// config
				b.getPortCpt().sendMessage(this, m);
				// sent = true;
				return;
			} else if (b.getPortCpt() == o) {
				b.getPortCfg().sendMessage(this, m);
				// sent = true;
				return;
			}
		}
	}

	public abstract void sendMessage(Object sender, Message m);

}
