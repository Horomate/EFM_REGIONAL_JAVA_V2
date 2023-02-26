import java.util.ArrayList;
import java.util.List;

public class Boutique {
    private List<Produit> produits = new ArrayList<>();

    public Boutique(List<Produit> produits) { this.produits = produits; }
    public int indiceDe(int code){
        for (int i =0, i < produits.size(), i++){
            if(produits.get(i).getCode() == code){
                return i;
            }
        }
        return -1;
    }

    public void ajouter(Produit p){
        if(indiceDe(p.getCode()) != -1){
            Systeme.out.println("Le produit déja existe ");
        }
        produits.add(p);
    }

    public boolean supprimer(int code) {
        int indice = indiceDe(code);
        if (indice == -1) {
            return false;
        } else {
            produits.remove(indice);
            return true;
        }
    }

    public boolean supprimer(Produit p) {
        return produits.remove(p);
    }

}
