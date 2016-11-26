package m2.lien;

import m2.composant.PortCpt;
import m2.composant.PortCptFourni;
import m2.configuration.PortCfg;
import m2.configuration.PortCfgFourni;

public class BindingFourni extends Binding {
	public BindingFourni(PortCpt portCpt, PortCfg portCfg) {
		super(portCpt, portCfg);
		// TODO Auto-generated constructor stub
	}
	private PortCptFourni portCptFourni;
	private PortCfgFourni portCfgFourni;
	private String name;
	
	
	

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
