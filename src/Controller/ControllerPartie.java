package Controller;

import Model.Client;
import Model.LocationManager;
import View.ViewHandler;
import View.ViewPartie;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class ControllerPartie implements EventHandler<MouseEvent> {

    private ViewPartie viewPartie;
    private ViewHandler vh;
    private LocationManager locationManager;
    private Client client;
    private ArrayList<Client> listClient;

    public ControllerPartie(ViewPartie viewPartie, ViewHandler vh,LocationManager locationManager) {

        this.viewPartie = viewPartie;
        this.vh = vh;
        this.locationManager = locationManager;

    }

    @Override
    public void handle(MouseEvent event) {

        if(event.getSource().equals(viewPartie.getBtnValide())){

           locationManager.ajouterDansListClient(viewPartie.getInputNom().getText(),viewPartie.getInputNom().getText(),Integer.parseInt(viewPartie.getInputAge().getText()));
           listClient = locationManager.getListClient();
            for (int i = 0; i < listClient.size(); i++) {
                client = listClient.get(i);
            }
           String itemMoto = viewPartie.getComboBoxMoto().getSelectionModel().getSelectedItem();
           String itemVoiture = viewPartie.getComboBoxVoiture().getSelectionModel().getSelectedItem();
           locationManager.location(itemVoiture,itemMoto,client);

        }else if(event.getSource().equals(viewPartie.getBtnAffiche())){

            vh.afficherViewAfficher();

        }
    }
}
