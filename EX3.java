
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.point;

/**
 *
 * @author pro
 */
public class Point {
   private char nom;
   private double abscisse;

   public Point(char nom, double abscisse) {
      this.nom = nom;
      this.abscisse = abscisse;
   }

   public Point(Point p) {
      p.nom = nom;
      p.abscisse = abscisse;
   }

   public void affiche() {
      System.out.println("Le nom du point: " + this.nom);
      System.out.println("L'abscisse du point: " + this.abscisse);
   }

   public void translate(double translate) {
      abscisse += translate;
   }

   public static void main(String[] args) {
      Point p = new Point('x', 7);
      p.affiche();
      p.translate(2);
      p.affiche();
   }
}
