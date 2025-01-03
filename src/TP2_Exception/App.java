package TP2_Exception;

public class App {
    public static void main(String[] args) {
        try {
            // Initialisation avec une valeur valide
            EntierNaturel entier = new EntierNaturel(5);
            System.out.println("Valeur initiale : " + entier.getVal());

            // Modification avec une valeur valide
            entier.setVal(10);
            System.out.println("Nouvelle valeur : " + entier.getVal());

            // Décrémentation
            entier.decrementer();
            System.out.println("Valeur après décrémentation : " + entier.getVal());

            // Test avec une valeur négative pour setVal()
            entier.setVal(-3);

        } catch (NombreNegatifException e) {
            System.err.println("Exception capturée : " + e.getMessage());
            System.err.println("Valeur erronée : " + e.getValeurErronee());
        }

    }
}
