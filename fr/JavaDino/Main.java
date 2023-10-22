package fr.JavaDino;

// crée une classe Dinosaure avec deux attributs (nom et periode), un constructeur pour initialiser ces attributs, et deux méthodes (getNom, getPeriode). Dans la classe principale Main, un objet Dinosaure est créé et ses informations sont affichées.

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Dinosaure
        Dino dino = new Dino("Tyrannosaurus", "Crétacé");

        // Affichage des informations du dinosaure
        System.out.println("Nom du dinosaure: " + dino.getNom());
        System.out.println("Période: " + dino.getPeriode());
    

        Dino dino2 = new Dino("Diplodocus", "Jurassic");
     
      
         // Affichage des informations du dinosaure
        System.out.println("Nom du dinosaure: " + dino2.getNom());
        System.out.println("Période: " + dino2.getPeriode());
}

}