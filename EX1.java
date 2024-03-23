
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.personne;

/**
 *
 * @author pro
 */
public class Personne {
   private String CIN;
   private String nom;
   private String prenom;
   private String email;
   private int age;

   public void initialiserPersonne(String CIN, String nom, String prenom, String email, int age) {
      this.CIN = CIN;
      this.nom = nom;
      this.prenom = prenom;
      this.email = email;
      this.age = age;
   }

   public void afficherPersonne() {
      System.out.println("CIN: " + this.CIN);
      System.out.println("Nom: " + this.nom);
      System.out.println("Prénom: " + this.prenom);
      System.out.println("Email: " + this.email);
      System.out.println("Age: " + this.age);
   }

   public static void main(String[] args) {
      Personne p = new Personne();

      p.intialiserPersonne("2739323", "Ayano", "Aya", "asjdwdjk", "20");

      System.out.println("Les informations de la personne sont : ");
      personne1.afficherPersonne();
   }
}
