package m2.configuration;

import java.util.ArrayList;

import m2.lien.Binding;
import m2.lien.BindingFourni;

public class PortCfgFourni extends PortCfg {
    private BindingFourni bindingFourni;

    public PortCfgFourni(ArrayList<PortCfg> portConfig, String nom, Binding binding, BindingFourni bindingFourni) {
        super(portConfig, nom, binding);
        this.bindingFourni = bindingFourni;
    }
}
