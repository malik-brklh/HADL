package m2.lien;

import m2.composant.PortCpt;
import m2.composant.PortCptRequis;
import m2.configuration.PortCfg;
import m2.configuration.PortCfgRequis;

public class BindingRequis extends Binding {

    public BindingRequis(PortCpt portCpt, PortCfg portCfg) {
		super(portCpt, portCfg);
		// TODO Auto-generated constructor stub
	}

	private PortCfgRequis portCfgRequis;
    private PortCptRequis portCptRequis;
    private String name;
    


	public PortCfgRequis getPortCfgRequis() {
        return portCfgRequis;
    }

    public void setPortCfgRequis(PortCfgRequis portCfgRequis) {
        this.portCfgRequis = portCfgRequis;
    }

	public PortCptRequis getPortCptRequis() {
		return portCptRequis;
	}

	public void setPortCptRequis(PortCptRequis portCptRequis) {
		this.portCptRequis = portCptRequis;
	}

	public String getName() {
		return name;
	}

	
}
