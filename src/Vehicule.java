public class Vehicule {

    public Vehicule() {

    }

    public void  testVitesse(int vitesse)throws TropViteException{
        if (vitesse > 90){
            throw new TropViteException(vitesse);
        }
        System.out.println("la vitesse " + vitesse + " est légale");
    }
}
