package Controller;

import Model.LocationManager;
import View.ViewAfficher;
import View.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ControllerAfficher implements EventHandler<MouseEvent> {

    private ViewHandler vh;
    private ViewAfficher va;
    private LocationManager locationManager;

    public ControllerAfficher(ViewHandler vh, ViewAfficher va,LocationManager locationManager) {

        this.va = va;
        this.vh = vh;
        this.locationManager = locationManager;
    }
    @Override
    public void handle(MouseEvent event) {

        if(event.getSource().equals(va.getBtnRetour())){

            vh.afficherViewPartie();
        }
    }
}
