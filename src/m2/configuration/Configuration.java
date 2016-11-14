package m2.configuration;

import java.util.ArrayList;

import m2.ElementArchitecturale;
import m2.composant.Composant;
import m2.composant.PortCpt;
import m2.connecteur.Connecteur;
import m2.connecteur.RoleCnt;
import m2.lien.Attachement;
import m2.lien.Binding;

public class Configuration extends ElementArchitecturale{
	

	private ArrayList<Composant> composants;
	private ArrayList<Connecteur> connecteurs;
	private ArrayList<Binding> bindings;
	private ArrayList<Attachement> attachements;
	
	public Configuration(String name) {
		super(name);
		setAttachements(new ArrayList<Attachement>());
		setBindings(new ArrayList<Binding>());
		setComposants(new ArrayList<Composant>());
		setConnecteurs(new ArrayList<Connecteur>());
	}

	public ArrayList<Composant> getComposants() {
		return composants;
	}

	public void setComposants(ArrayList<Composant> composants) {
		this.composants = composants;
	}

	public ArrayList<Connecteur> getConnecteurs() {
		return connecteurs;
	}

	public void setConnecteurs(ArrayList<Connecteur> connecteurs) {
		this.connecteurs = connecteurs;
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
	
	public void addComposant(Composant c){
		this.composants.add(c);
	}
	
	public void addConnecteur(Connecteur c){
		this.connecteurs.add(c);
	}
	
	public void addBinding(){
		this.bindings.add(b);
	}
//	
//	public void addAttachement(Attachement a, ){
//		this.attachements.add(a);
//	}
	
	public void addAttachement(PortCpt comp, RoleCnt con,String nom){
		
		this.attachements.add(new Attachement(comp, con,nom));
	}
	
}
