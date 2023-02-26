public class ProduitsEnSolde extends Produit {
    private double remise;

    public double getRemise() { return remise; }
    public void setRemise(double remise) {
        if (remise < 0 || remise > 90) {
            System.out.println("La remise doit être comprise entre 0 et 90");
        }
        this.remise = remise;
    }
    public ProduitsEnSolde(double remis, int code, double prixorigin){
        super(code, prixorigin);
        this.remise = remise;
    }

    @Override
    public String toString() {
       return super.toString() + ";" + this.remise;
    }
    public double prixProduits(){
        return getPrixorigin - (getPrixorigin * (1 - this.remise/ 100));
    }
}
