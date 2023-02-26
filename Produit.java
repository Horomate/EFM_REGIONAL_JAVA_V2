public class Produit {

        private int code;
        private double prixorigin;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public double getPrixorigin() {
            return prixorigin;
        }

        public void setPrixorigin(double prixorigin) {
            this.prixorigin = prixorigin;
        }

        public Produit(int code, double prixorigin) {
            this.code = code;
            this.prixorigin = prixorigin;
        }

        @Override
        public String toString() {
            return this.code + ";" +this.prixorigin;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Produit) {
                Produit autreProduit = (Produit) obj;
                return this.code == autreProduit.code;
            }
            return false;
        }
        public double prixProduit() {
            return prixorigin;
        }



    }


