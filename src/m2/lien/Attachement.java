package m2.lien;

import m2.composant.PortCpt;
import m2.connecteur.RoleCnt;

public class Attachement {

	private PortCpt portCpt;
	private RoleCnt roleCnt;
	private String name;
	
	
	public Attachement(PortCpt portCpt, RoleCnt roleCnt, String name) {
		super();
		this.portCpt = portCpt;
		this.roleCnt = roleCnt;
		this.name = name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
