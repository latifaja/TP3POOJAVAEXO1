//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicule vehicule = new Vehicule();
        try {
            // Test avec une vitesse en dessous de la limite
            vehicule.testVitesse(40);
        } catch (TropViteException e) {
            e.printStackTrace();
        }
        try {
            // Test avec une vitesse qui dépasse la limite
            vehicule.testVitesse(160);
        } catch (TropViteException e) {
            e.printStackTrace();  // Affiche la pile d'appel de l'exception
        }


    }
}