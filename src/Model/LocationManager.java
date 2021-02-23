package Model;

import java.util.ArrayList;

public class LocationManager {

    private ArrayList<Voiture> listVoiture;
    private ArrayList<Moto> listMoto;
    private ArrayList<Client> listClient;

    public LocationManager() {

        ajouterDansListMoto();
        ajouterDansListVoiture();
    }

    public void ajouterDansListClient(String nom,String prenom,int age){

        listClient = new ArrayList<>();
        Client client = new Client(nom,prenom,age);
        listClient.add(client);
        System.out.println(listClient);
    }

    public ArrayList<Client> getListClient() {

        return listClient;
    }

    public void ajouterDansListMoto(){

        listMoto = new ArrayList<>();
        Moto suzuki = new Moto("SV650X","SUZUKI",300.00,false,false);
        Moto triumph = new Moto("BONNIE","TRIUMPH",445.55,false,false);
        Moto harleyDavidson = new Moto("FATBOY","Harley DAVIDSON",2566.15,false,true);

        listMoto.add(suzuki);
        listMoto.add(triumph);
        listMoto.add(harleyDavidson);
    }

    public void ajouterDansListVoiture(){

        listVoiture = new ArrayList<>();
        Voiture peugeot = new Voiture("308","PEUGEOT",10500,false,5,true);
        Voiture opel = new Voiture("Corsa","OPEL",7000.55,false,5,false);
        Voiture mercedes = new Voiture("Class-B","MERCEDES",100.35,false,5,true);

        listVoiture.add(peugeot);
        listVoiture.add(opel);
        listVoiture.add(mercedes);
    }

    public void location(String itemVoiture,String itemMoto,Client client){

        for (int i = 0; i < listVoiture.size(); i++) {

            Vehicule voiture = listVoiture.get(i);

            if(itemVoiture.equals(voiture.getMarque())){

                voiture.setEstLouee(true);
                client.setVoitureLouee(voiture);

            }
        }
        for (int i = 0; i < listMoto.size(); i++) {

            Vehicule moto = listMoto.get(i);

            if (itemMoto.equals(moto.getMarque())){

                moto.setEstLouee(true);
                client.setMotoLouee(moto);
            }

        }
        System.out.println(client);
    }

    public ArrayList<Voiture> getListVoiture() {
        return listVoiture;
    }

    public ArrayList<Moto> getListMoto() {
        return listMoto;
    }

    @Override
    public String toString() {
        return "LocationManager{" +
                "listClient=" + listClient +
                '}';
    }
}
