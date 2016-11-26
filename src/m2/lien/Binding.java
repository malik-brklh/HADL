package m2.lien;

import m2.composant.InterfaceCpt;
import m2.composant.PortCpt;
import m2.configuration.InterfaceCfg;
import m2.configuration.PortCfg;

public  class Binding {

	private PortCpt portCpt;
	private PortCfg portCfg;
	public Binding(InterfaceCpt sendResponse, InterfaceCfg receiveReqConf) {
		super();
		this.portCpt = (PortCpt) sendResponse;
		this.portCfg = (PortCfg) receiveReqConf;
	}
	public PortCpt getPortCpt() {
		return portCpt;
	}
	public void setPortCpt(PortCpt portCpt) {
		this.portCpt = portCpt;
	}
	public PortCfg getPortCfg() {
		return portCfg;
	}
	public void setPortCfg(PortCfg portCfg) {
		this.portCfg = portCfg;
	}
	
}
