
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livre;

/**
 *
 * @author pro
 */
public class Etagere {
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livre;

/**
 *
 * @author pro
 */
public class Etagere {
   private Livre[] livres;
   private int nbrLivre;
   private int capacite;

   public Etagere(int capacite) {
      this.capacite = capacite;
      this.nbrLivre = 0;
      this.livres = new Livre[capacite]
   }

   public int nbrLivreEtage() {
      return nbrLivre;
   }

   public int capaciteEtage() {
      return capacite;
   }

   public void ajouter(Livre l){
      if(this.nbrLivre < this.capacite) {
         livres[nbrLivre] = l;
         nbrLivre++;
      }
      else
         System.out.println("L'etagere est plein.");
   }

   public Livre getLivre(int pos) {
      if(pos >= 1 && pos < nbrLivre)
         return livres[pos-1];
      else
         System.out.println("Erreur de position");
      return null;
   }

   public int chercherLivre(String titre, String auteur) {
      posKtab = 0;
      for(int i=0; i < nbrLivre; i++) {
         Livre livre = livres[i];
         if(auteur == livre.getAuteur() && titre == livre.getTitre())
            posKtab = i+1;
      }
      return posKtab;

      public void supprimerLivre(int pos) {
         if(pos >= 1 && pos < nbrLivre) {
            for(int i = pos - 1; i < nbrLivre-1; i++) {
               livres[i] = livres[i+1];
            }
            livres[nbrLivre - 1] = null;
            nbrLivre--;
         }
         else
            System.out.println("Erreur de position");
      }
}