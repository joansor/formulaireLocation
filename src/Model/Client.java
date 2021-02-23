package Model;

import javafx.scene.text.Text;

public class Client {
    private String nom;
    private String prenom;
    private int age;
    private Vehicule voitureLouee;
    private Vehicule motoLouee;

    public Client(String nom,String prenom,int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void setMotoLouee(Vehicule motoLouee) {
        this.motoLouee = motoLouee;
    }

    public void setVoitureLouee(Vehicule voitureLouee) {
        this.voitureLouee = voitureLouee;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", voitureLouee=" + voitureLouee +
                ", motoLouee=" + motoLouee +
                '}';
    }
}
