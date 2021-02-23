package View;

import Controller.ControllerAfficher;
import Model.Client;
import Model.LocationManager;
import Model.Moto;
import Model.Voiture;
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
    private Button btnRetour;
    private ArrayList<Text> listVoiture;
    private ArrayList<Text> listMoto;




    public ViewAfficher(Group root,ViewHandler vh) {

        this.root = root;
        this.locationManager = new LocationManager();
        this.controllerAfficher = new ControllerAfficher(vh,this,locationManager);
        initTitre();
        initBoutton();

    }

    public void initTitre(){
        titre = new Text(20,50,"Locar");
        titre.setFont(new Font(50));

    }
    public void initBoutton(){

        btnRetour = new Button("Retour");
        btnRetour.setTranslateX(20);
        btnRetour.setTranslateY(100);
        btnRetour.setOnMouseClicked(controllerAfficher);

    }

    public void afficherViewAfficher() {
        root.getChildren().clear();
        root.getChildren().add(titre);
        root.getChildren().add(btnRetour);

    }

    public Button getBtnRetour() {
        return btnRetour;
    }

}
