package m2.lien;

import m2.composant.InterfaceCpt;
import m2.composant.PortCpt;
import m2.connecteur.InterfaceCnt;
import m2.connecteur.RoleCnt;

public class Attachement {

	private PortCpt portCpt;
	private RoleCnt roleCnt;
	
	
	public Attachement(InterfaceCpt sendRequest, InterfaceCnt caller) {
		super();
		this.portCpt = (PortCpt) sendRequest;
		this.roleCnt = (RoleCnt) caller;
		
	}
	public PortCpt getPortCpt() {
		return portCpt;
	}
	public void setPortCpt(PortCpt portCpt) {
		this.portCpt = portCpt;
	}
	public RoleCnt getRoleCnt() {
		return roleCnt;
	}
	public void setRoleCnt(RoleCnt roleCnt) {
		this.roleCnt = roleCnt;
	}
}
