package main;

import metier.*;

public class Main {
    public static void main(String[] args) {
        Etudiant Etudiant1 = new Etudiant(01, "Hamilton", "Lewis", "0123456");
        Etudiant Etudiant2 = new Etudiant(02, "Sainz JR", "Carlos", "1234560");

        Employe Employe1 = new Employe(03, "Leclerc", "Charles", 15000);
        Employe Employe2 = new Employe(04, "Gasly", "Pierre", 14200);

        Professeur Professeur1 = new Professeur(05, "Verstappen", "Max", 50000,"RedBull");
        Professeur Professeur2 = new Professeur(06, "Russel", "George", 10000, "Mercedez");

        System.out.println("La liste des employés : ");
        System.out.println("Je suis " + Employe1.getNom() + " " + Employe1.getPrenom() + " mon salaire est : " + Employe1.getSalaire());
        System.out.println("Je suis " + Employe2.getNom() + " " + Employe2.getPrenom() + " mon salaire est : " + Employe2.getSalaire());
        System.out.println("La liste des étudiants : ");
        System.out.println("Je suis " + Etudiant1.getNom() + " " + Etudiant1.getPrenom() + " mon CNE est : " + Etudiant1.getCne());
        System.out.println("Je suis " + Etudiant2.getNom() + " " + Etudiant2.getPrenom() + " mon CNE est : " + Etudiant2.getCne());
        System.out.println("La liste des professeurs : ");
        System.out.println("Je suis " + Professeur1.getNom() + " " + Professeur1.getPrenom() + " mon salaire est : " + Professeur1.getSalaire() + " est ma spécialité est : " + Professeur1.getSpecialite());
        System.out.println("Je suis " + Professeur2.getNom() + " " + Professeur2.getPrenom() + " mon salaire est : " + Professeur2.getSalaire() + " est ma spécialité est : " + Professeur2.getSpecialite());
    }
}