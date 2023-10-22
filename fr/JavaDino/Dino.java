package fr.JavaDino;

public class Dino {
    private String nom;
    private String periode;

    // Constructeur
    public Dino(String nom, String periode) {
        this.nom = nom;
        this.periode = periode;
    }

    // Méthode pour obtenir le nom
    public String getNom() {
        return nom;
    }

    // Méthode pour obtenir la période
    public String getPeriode() {
        return periode;
    }

    // Méthode pour mettre à jour le nom
    public void setNom(String nom) {
        this.nom = nom;
    }
    // Méthode pour mettre à jour la période
    public void setPeriode(String periode) {
        this.periode = periode;
    }



}
