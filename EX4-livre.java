
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livre;

/**
 *
 * @author pro
 */
public class Livre {
   private String titre;
   private String auteur;
   private int nbrPage;
   private double prix;

   public Livre(String titre, String auteur, int nbrPage) {
      this.titre = tire;
      this.auteur = auteur;
      this.nbrPage = nbrPage;
   }

   public Livre(String titre, String auteur, int nbrPage, double prix) {
      this.titre = titre;
      this.auteur = auteur;
      this.nbrPage = nbrPage;
      this.prix = prix;
   }

   public String getTitre() {
      return titre;
   }

   public void setTitre(String titre) {
      this.titre = titre;
   }

   public String getAuteur() {
      return auteur;
   }

   public void setAuteur(String auteur) {
      this.auteur = auteur;
   }

   public int getNbrPage() {
      return nbrPage;
   }

   public void setNbrPage(int nbrPage) {
      this.nbrPage = nbrPage;

   public double getPrix() {
      return prix;
   }

   public void setPrix(double prix) {
      this.prix = prix;
   }

   public boolean prixFixe() {
      if(this.prix < 0)
         return false;
      else
         return true;
   }

   @Override
   public String toString() {
      if(this.prix >= 0) {
         return "Livre {" + "titre = " + titre + ", auteur = " + auteur + ", nombre de pages = " + nbrPage + ", prix = " + prix + '}';
      else
         return "Livre {" + "titre = " + titre`+ ", auteur = " + auteur + ", nombre de pages = " + nbrPage + ", prix = Prix pas encore donné" + '}';
   }

   public int compare(Livre l) {
      if(l.nbrPage == this.nbrPage)
         return 0;
      else if(l.nbrPage < this.nbrPage)
         return 1;
      else
         return -1;
   }

   public static void main(String[] args) {
      Livre l = new Livre("nnn", "nnnn", 100, 50);
      System.out.println(l.toString());
      System.out.println(l.prixFixe());
   }
}