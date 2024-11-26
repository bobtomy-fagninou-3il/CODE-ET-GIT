public class StockManager {

    /**
     * methode pour ajouter un produit
     * @param produit le nom du produit
     * @param quantite la quatite du produit
     * @param stock le stock du produit
     */
    public void operationAjout(String produit, int quantite, int stock){
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
    }

    /**
     * methode pour retirer la quatite d'un produit
     * @param produit le nom du produit
     * @param quantite la quatite du produit
     * @param stock le stock du produit
     */
    public void operationRetrait(String produit, int quantite, int stock){
        if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
        }
    }

    /**
     * methode pour un operation inconnu d'un produit
     */
    public void operationInconnu(){
        System.out.println("Opération inconnue.");
    }

    /**
     * 
     * @param typeOperation le type de l'operation
     * @param produit le nom du produit
     * @param quantite la quatite du produit
     * @param stock le stock du produit
     */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        // Ajout au stock
        if (typeOperation.equals("ajout")) {
            this.operationAjout(produit, quantite, stock);
        // Retrait du stock
        } else if (typeOperation.equals("retrait")) {
            this.operationRetrait(produit, quantite, stock);
        // Si l'action est inconnu
        } else {
            this.operationInconnu();
        }
    }
}
