package Model;

public class Vehicule {
    protected String modele;
    protected String marque;
    protected double km;
    protected boolean estLouee;


    public Vehicule(String modele, String marque,double km,boolean estLouee){
        this.modele = modele;
        this.marque = marque;
        this.km = km;
        this.estLouee = estLouee;
    }

    public boolean isEstLouee() {
        return estLouee;
    }

    public void setEstLouee(boolean estLouee) {
        this.estLouee = estLouee;
    }

    public String getMarque() {
        return marque;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "modele='" + modele + '\'' +
                ", marque='" + marque + '\'' +
                ", km=" + km +
                ", estLouee=" + estLouee +
                '}';
    }
}
