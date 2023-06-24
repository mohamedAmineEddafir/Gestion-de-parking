/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parking;

/**
 *
 * @author eddaf
 */
public class Voiture extends Vehicule{
    private int NumPorte;
    public Voiture(String marque, String modele, String immatriculation, int NumPorte) {
        super(marque, modele, immatriculation);
        this.NumPorte = NumPorte;
    }

    public int getNumPorte() {
        return NumPorte;
    }

    public void setNumPorte(int NumPorte) {
        this.NumPorte = NumPorte;
    }
    
    @Override
    public String toString() {
        String affichage = "- La voiture "+getMarque()+" "+getModele()+" d'immatriculation "+getImmatriculation()+" Contient "+NumPorte+" Porte.";
        return affichage;
    }
}
