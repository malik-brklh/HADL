package m2.lien;

import m2.composant.PortCptFourni;
import m2.configuration.PortCfgFourni;

public class BindingFourni extends Binding {
	private PortCptFourni portCptFourni;
	private PortCfgFourni portCfgFourni;
	private String name;
	
	
	
	public BindingFourni(PortCptFourni portCptFourni, PortCfgFourni portCfgFourni, String name) {
		super();
		this.portCptFourni = portCptFourni;
		this.portCfgFourni = portCfgFourni;
		this.name = name;
	}
	public PortCptFourni getPortCptFourni() {
		return portCptFourni;
	}
	public void setPortCptFourni(PortCptFourni portCptFourni) {
		this.portCptFourni = portCptFourni;
	}
	public PortCfgFourni getPortCfgFourni() {
		return portCfgFourni;
	}
	public void setPortCfgFourni(PortCfgFourni portCfgFourni) {
		this.portCfgFourni = portCfgFourni;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
