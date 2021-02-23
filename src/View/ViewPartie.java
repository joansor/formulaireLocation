package View;

import Controller.ControllerPartie;
import Model.LocationManager;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ViewPartie {
    private ControllerPartie controllerPartie;
    private LocationManager locationManager;
    private Group root;
    private Text titre;
    private ComboBox<String> comboBoxVoiture;
    private ComboBox<String> comboBoxMoto;
    private Label labelNom;
    private Label labelPrenom;
    private Label labelAge;
    private Label labelVoitureDispo;
    private Label labelMotoDispo;
    private TextField inputNom;
    private TextField inputAge;
    private TextField inputPrenom;
    private Button btnValide;
    private Button btnAffiche;

    public ViewPartie(Group root, ViewHandler vh) {
        this.root = root;
        this.locationManager = new LocationManager();
        this.controllerPartie = new ControllerPartie(this,vh,locationManager);
        initTitre();
        initComboBox();
        initInput();
        initLabel();
        initBoutton();
    }
    public void initTitre(){
        titre = new Text(20,50,"Locar");
        titre.setFont(new Font(50));
    }
    public void initLabel(){

        labelNom = new Label("Nom :");
        labelNom.setTranslateX(50);
        labelNom.setTranslateY(100);
        labelPrenom = new Label("Prenom :");
        labelPrenom.setTranslateX(50);
        labelPrenom.setTranslateY(130);
        labelAge = new Label("Age :");
        labelAge.setTranslateX(50);
        labelAge.setTranslateY(160);
        labelVoitureDispo = new Label("Voitures dispo :");
        labelVoitureDispo.setTranslateX(50);
        labelVoitureDispo.setTranslateY(190);
        labelMotoDispo = new Label("Motos dispo :");
        labelMotoDispo.setTranslateX(50);
        labelMotoDispo.setTranslateY(230);

    }
    public void initInput(){

        inputNom = new TextField();
        inputNom.setTranslateX(150);
        inputNom.setTranslateY(100);
        inputPrenom = new TextField();
        inputPrenom.setTranslateX(150);
        inputPrenom.setTranslateY(130);
        inputAge = new TextField();
        inputAge.setTranslateX(150);
        inputAge.setTranslateY(160);

    }
    public void initComboBox(){

        comboBoxVoiture = new ComboBox<>();
        comboBoxVoiture.setTranslateX(150);
        comboBoxVoiture.setTranslateY(190);
        comboBoxMoto = new ComboBox<>();
        comboBoxMoto.setTranslateX(150);
        comboBoxMoto.setTranslateY(230);
        comboBoxVoiture.getItems().add("PEUGEOT");
        comboBoxVoiture.getItems().add("OPEL");
        comboBoxVoiture.getItems().add("MERCEDES");
        comboBoxMoto.getItems().add("SUZUKI");
        comboBoxMoto.getItems().add("TRIUMPH");
        comboBoxMoto.getItems().add("Harley DAVIDSON");

    }
    public void initBoutton(){

        btnValide = new Button("Valider");
        btnValide.setTranslateX(150);
        btnValide.setTranslateY(280);
        btnValide.setOnMouseClicked(controllerPartie);
        btnAffiche = new Button("Afficher");
        btnAffiche.setTranslateX(250);
        btnAffiche.setTranslateY(280);
        btnAffiche.setOnMouseClicked(controllerPartie);

    }
    public void afficherViewPartie() {
        root.getChildren().clear();
        root.getChildren().add(titre);
        root.getChildren().add(labelNom);
        root.getChildren().add(labelPrenom);
        root.getChildren().add(labelAge);
        root.getChildren().add(labelVoitureDispo);
        root.getChildren().add(labelMotoDispo);
        root.getChildren().add(comboBoxVoiture);
        root.getChildren().add(comboBoxMoto);
        root.getChildren().add(inputNom);
        root.getChildren().add(inputPrenom);
        root.getChildren().add(inputAge);
        root.getChildren().add(btnAffiche);
        root.getChildren().add(btnValide);

    }

    public Button getBtnAffiche() {
        return btnAffiche;
    }

    public Button getBtnValide() {
        return btnValide;
    }

    public ComboBox<String> getComboBoxMoto() {
        return comboBoxMoto;
    }

    public ComboBox<String> getComboBoxVoiture() {
        return comboBoxVoiture;
    }

    public TextField getInputNom() {
        return inputNom;
    }

    public TextField getInputPrenom() {
        return inputPrenom;
    }

    public TextField getInputAge() {
        return inputAge;
    }
}
