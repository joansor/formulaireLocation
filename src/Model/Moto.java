package Model;

public class Moto extends Vehicule{
    private boolean sideCar;

    public Moto(String modele, String marque,double km,boolean estLouee,boolean sideCar){
        super(modele,marque,km,estLouee);
        this.sideCar = sideCar;

    }

}
