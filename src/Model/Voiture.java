package Model;

public class Voiture extends Vehicule{
    private int nbPlaces;
    private boolean barresDeToit;


    public Voiture(String modele, String marque,double km,boolean estLouee,int nbPlaces,boolean barresDeToit){
        super(modele,marque,km,estLouee);
        this.nbPlaces = nbPlaces;
        this.barresDeToit = barresDeToit;
    }

}
