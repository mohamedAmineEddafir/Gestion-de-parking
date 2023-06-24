/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parking;

/**
 *
 * @author eddaf
 */
public class Moto extends Vehicule{
    private int VitesseMax;
    public Moto(String marque, String modele, String immatriculation,int VitesseMax) {
        super(marque, modele, immatriculation);
        this.VitesseMax = VitesseMax;
    }

    public int getVitesseMax() {
        return VitesseMax;
    }

    public void setVitesseMax(int VitesseMax) {
        this.VitesseMax = VitesseMax;
    }
    public String toString() {
        String affichage = "- Le Moto "+getMarque()+" "+getModele()+" d'immatriculation "+getImmatriculation()+" a Une vitesse maximale => "+getVitesseMax();
        return affichage;
    }
}
