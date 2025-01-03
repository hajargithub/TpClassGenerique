package Tp1_Généricité;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner scanner = new Scanner(System.in);
        List <Produit> produits= new ArrayList<Produit>();
        Produit p1= new Produit(1,"P1","Brand1",500,"description P1",5);
        Produit p2= new Produit(2,"P2","Brand1",200,"description P2",50);
        metier.add(p1);
        metier.add(p2);
        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Rechercher un produit par son id");
            System.out.println("3. Ajouter un nouveau produit dans la liste");
            System.out.println("4. Supprimer un produit par id");
            System.out.println("5. Quitter ce programme");
            System.out.print("Votre choix : ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    System.out.println("Liste des produits :");
                    for (Produit p : metier.getAll()) {
                        System.out.println(p.toString());
                    }
                    break;

                case 2:
                    System.out.print("Entrez l'id du produit : ");
                    long idRecherche = scanner.nextLong();
                    Produit produitTrouve = metier.findById(idRecherche);
                    if (produitTrouve != null) {
                        System.out.println("Produit trouvé : " + produitTrouve.toString());
                    } else {
                        System.out.println("Aucun produit trouvé avec cet id.");
                    }
                    break;

                case 3:
                    System.out.print("Entrez l'id : ");
                    long id = scanner.nextLong();
                    scanner.nextLine(); // Consommer la nouvelle ligne

                    System.out.print("Entrez le nom : ");
                    String nom = scanner.nextLine();

                    System.out.print("Entrez la marque : ");
                    String marque = scanner.nextLine();

                    System.out.print("Entrez le prix : ");
                    double prix = scanner.nextDouble();
                    scanner.nextLine(); // Consommer la nouvelle ligne

                    System.out.print("Entrez la description : ");
                    String description = scanner.nextLine();

                    System.out.print("Entrez le nombre en stock : ");
                    int nombreEnStock = scanner.nextInt();

                    Produit nouveauProduit = new Produit(id, nom, marque, prix, description, nombreEnStock);
                    metier.add(nouveauProduit);
                    System.out.println("Produit ajouté avec succès.");
                    break;

                case 4:
                    System.out.print("Entrez l'id du produit à supprimer : ");
                    long idSuppression = scanner.nextLong();
                    metier.delete(idSuppression);
                    System.out.println("Produit supprimé avec succès.");
                    break;

                case 5:
                    System.out.println("Au revoir !");
                    scanner.close();
                    return;

                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }
    }
}

