public class Crud {

    // Attributs
    private String nomProduit = "";
    private int quantite = 0;
    private double prix = 0.0;

    // Constructeur d'initialisation
    public Crud(String pNomProduit, int pQuantite, double pPrix) {
        nomProduit = pNomProduit;
        quantite = pQuantite;
        prix = pPrix;
    }

    // 2- Modifier : une méthode ModifierProduit(String pNomProduit,int
    // pQuantite,double pPrix) qui ne retourne rien (void)

// Getters
public String getNomProduit() {
    return nomProduit;
}

public int getQuantite() {
    return quantite;
}

public double getPrix() {
    return prix;
}

// Setters
public void setNomProduit(String nomProduit) {
    this.nomProduit = nomProduit;
}

public void setQuantite(int quantite) {
    this.quantite = quantite;
}

public void setPrix(double prix) {
    this.prix = prix;
}

// Modifier
public void modifierProduit(String pNomProduit, int pQuantite, double pPrix) {
    setNomProduit(pNomProduit);
    setQuantite(pQuantite);
    setPrix(pPrix);
}

    

    // 3- Supprimer: une méthode supprimerProduit() qui ne retourne rien(void)

    // 4- Afficher: une méthode afficherProduit() qui ne retourne rien(void)

}
