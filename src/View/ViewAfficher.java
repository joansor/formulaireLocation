package View;

import Controller.ControllerAfficher;
import Model.LocationManager;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class ViewAfficher {
    private ControllerAfficher controllerAfficher;
    private LocationManager locationManager;
    private Group root;
    private Text titre;
    private Text titreListVoiture;
    private Text titreListMoto;
    private Button btnRetour;
    private ArrayList<Text> listVoiture  = new ArrayList<>();
    private ArrayList<Text> listMoto = new ArrayList<>();


    public ViewAfficher(Group root, ViewHandler vh) {

        this.root = root;
        this.locationManager = new LocationManager();
        this.controllerAfficher = new ControllerAfficher(vh, this, locationManager);
        initTitre();
        initBoutton();
        afficherList();
    }

    public void afficherList() {

        if (!locationManager.getListVoiture().isEmpty()) {
            for (int i = 0; i < locationManager.getListVoiture().size(); i++) {
                if (locationManager.getListVoiture().get(i).isEstLouee() == false) {

                    listVoiture.add(new Text(locationManager.getListVoiture().get(i).toString()));

                }
            }
        }
        if (!locationManager.getListMoto().isEmpty()) {
            for (int i = 0; i < locationManager.getListMoto().size(); i++) {
                if (locationManager.getListMoto().get(i).isEstLouee() == false) {
                    listMoto.add(new Text(locationManager.getListMoto().get(i).toString()));
                }
            }
        }
    }
    public void initTitre() {
        titre = new Text(20, 50, "Véhicules Disponibles :");
        titre.setFont(new Font(50));
        titreListVoiture = new Text(20, 180, "Voitures  :");
        titreListVoiture.setFont(new Font(25));
        titreListMoto = new Text(20, 280, "Motos :");
        titreListMoto.setFont(new Font(25));
    }

    public void initBoutton() {
        btnRetour = new Button("Retour");
        btnRetour.setTranslateX(20);
        btnRetour.setTranslateY(100);
        btnRetour.setOnMouseClicked(controllerAfficher);
    }
    public void afficherViewAfficher() {
        root.getChildren().clear();
        root.getChildren().add(titre);
        root.getChildren().add(btnRetour);
        root.getChildren().add(titreListVoiture);
        root.getChildren().add(titreListMoto);
        if (listVoiture.isEmpty()) {
            System.out.println("vide");
        } else {
            for (int i = 0; i < listVoiture.size(); i++) {

                root.getChildren().add(listVoiture.get(i));
                listVoiture.get(i).setTranslateY(200+i*15);
            }
        }
        if (listMoto.isEmpty()) {
            System.out.println("vide");
        } else {
            for (int i = 0; i < listMoto.size(); i++) {

                root.getChildren().add(listMoto.get(i));
                listMoto.get(i).setTranslateY(300+i*15);
            }
        }
    }

    public Button getBtnRetour() {
        return btnRetour;
    }

}
