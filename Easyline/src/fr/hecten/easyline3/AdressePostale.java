package fr.hecten.easyline3;
public class AdressePostale {
    // Attributs
    private String numeroVoie;
    private String ville;
    private int codePostal;

    // Constructeur
    public AdressePostale(String numeroVoie, String ville, int codePostal) {
        this.numeroVoie = numeroVoie;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    // Méthodes GET
    public String getNumeroVoie() {
        return numeroVoie;
    }

    public String getVille() {
        return ville;
    }

    public int getCodePostal() {
        return codePostal;
    }

    // Méthodes SET
    public void setNumeroVoie(String numeroVoie) {
        this.numeroVoie = numeroVoie;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    // Méthode pour afficher l'adresse
    public void afficher() {
        System.out.println(numeroVoie + ", " + codePostal + " " + ville);
    }
}

