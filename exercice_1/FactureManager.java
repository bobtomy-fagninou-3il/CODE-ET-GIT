public class FactureManager {

    /**
     * Methode qui calcule la reduction des produits alimentaire
     * @param quantite
     * @param prixUnitaire
     * @return 
     */
    public double reductionAlimentaire ( int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;
        return (total -= total * 0.05);
    }

    /**
     * Methode qui calcule la reduction des produits Electromenage
     * @param quantite
     * @param prixUnitaire
     * @return 
     */
    public double reductionElectromenage ( int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;
        return (total -= total * 0.1);
    }

    /**
     * Methode qui calcule la reduction des produits de Luxe
     * @param quantite
     * @param prixUnitaire
     * @return 
     */
    public double reductionLuxe ( int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;
        return (total -= total * 0.15);
    }
    public double reductionGenerale(int quantite, double prixUnitaire){
        double total = quantite * prixUnitaire;
        if (total > 1000) {
            total -= total * 0.05; // Réduction supplémentaire de 5% pour les gros montants
        }
        return total;
    }

    /**
     * calcule le totale d'une facture
     * @param typeProduit
     * @param quantite
     * @param prixUnitaire
     */
    public void calculerFacture(String typeProduit, int quantite, double prixUnitaire) {        
        // reduction selon la catégorie
        if (typeProduit.equals("Alimentaire")) {
            this.reductionAlimentaire(quantite, prixUnitaire);// Réduction de 5%
        } else if (typeProduit.equals("Electronique")) {
            this.reductionElectromenage(quantite, prixUnitaire); // Réduction de 10%
        } else if (typeProduit.equals("Luxe")) {
            this.reductionLuxe(quantite, prixUnitaire); // Réduction de 15%
        }
        this.reductionGenerale(quantite, prixUnitaire);// Réduction de 10%
    }
}
