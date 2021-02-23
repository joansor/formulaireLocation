package View;//Dossier
//Imports
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
public class ViewHandler extends Application {
    private ViewPartie viewPartie;
    private ViewAfficher va;

    @Override
    public void start(Stage primaryStage) {

        Group root = new Group();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        // Attention je ne le mets pas en attribut parce que je n'y accederai qu'à partir de cette méthode.
        viewPartie = new ViewPartie(root,this);
        va = new ViewAfficher(root,this);

        primaryStage.setWidth(600);
        primaryStage.setHeight(610);
        primaryStage.setX(500);
        primaryStage.setY(200);
        primaryStage.setTitle("Location");
        primaryStage.setFullScreenExitHint("");
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setFullScreen(false);

        afficherViewPartie();

        primaryStage.show();
    }
    public void afficherViewPartie() {//Méthode qui appel une autre méthode de ViewMenuPrincipal

        viewPartie.afficherViewPartie();

    }
    public void afficherViewAfficher() {//Méthode qui appel une autre méthode de ViewMenuPrincipal

       va.afficherViewAfficher();

    }

}