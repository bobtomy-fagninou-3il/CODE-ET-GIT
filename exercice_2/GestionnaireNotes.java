public class GestionnaireNotes {

    /**
     * Methode pour le calcule de la somme des notes
     * @param notes tableau de note
     * @return un entier somme
     */
    public int sommeNotes(int[] notes){
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return somme;
    }
    
    /**
     * Methode pour calcule la note moyenne
     * @param notes tableau de note
     */
    public void moyenne(int[] notes){
        int somme = this.sommeNotes(notes);
        double moyenne = (double) somme / notes.length;
        System.out.println("Moyenne : " + moyenne);
    }

    /**
     * Afficher la moyenne de l'etudiant
     * @param nomEtudiant nom de l'etudiant
     * @param notes tableau de note 
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        // Affichage des notes
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
        this.sommeNotes(notes);
        this.moyenne(notes);
    }
}
