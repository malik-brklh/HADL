package m2.configuration;

import java.util.ArrayList;

import m2.lien.Binding;

public class PortCfg extends InterfaceCfg {

    private String nom;
    private Binding binding;

    public PortCfg(ArrayList<PortCfg> portConfig, String nom, Binding binding) {
        super(portConfig);
        this.nom = nom;
        this.binding = binding;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Binding getBinding() {
        return binding;
    }

    public void setBinding(Binding binding) {
        this.binding = binding;
    }


}
