package m2.lien;

import m2.composant.InterfaceCpt;
import m2.composant.PortCpt;
import m2.connecteur.InterfaceCnt;
import m2.connecteur.RoleCnt;

public class Attachement {

	private InterfaceCpt portCpt;
	private InterfaceCnt roleCnt;
	
	
	public Attachement(InterfaceCpt sendRequest, InterfaceCnt caller) {
		super();
		this.portCpt = (PortCpt) sendRequest;
		this.roleCnt = (RoleCnt) caller;
		
	}
	public InterfaceCpt getPortCpt() {
		return portCpt;
	}
	public void setPortCpt(InterfaceCpt portCpt) {
		this.portCpt = portCpt;
	}
	public InterfaceCnt getRoleCnt() {
		return roleCnt;
	}
	public void InterfaceCnt(RoleCnt roleCnt) {
		this.roleCnt = roleCnt;
	}
}
