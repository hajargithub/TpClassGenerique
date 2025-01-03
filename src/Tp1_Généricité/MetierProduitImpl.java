package Tp1_Généricité;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit> {

    private List<Produit> produits = new ArrayList<>();
    @Override
    public void add(Produit produit) {
        produits.add(produit);
    }

    @Override
    public List<Produit> getAll() {
        return produits;
    }

    @Override
    public Produit findById(long id) {
        for (Produit produit : produits) {
            if (produit.getId() == id) {
                return produit;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {
        produits.removeIf(produit -> produit.getId() == id);
    }
}
