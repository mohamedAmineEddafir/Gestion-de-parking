/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parking;

/**
 *
 * @author eddaf
 */
public class Camion extends Vehicule{
    private boolean remorque; 
    public Camion(String marque, String modele, String immatriculation, boolean remorque) {
        super(marque, modele, immatriculation);
        this.remorque = remorque;
    }

    public boolean isRemorque() {
        return remorque;
    }

    public void setRemorque(boolean remorque) {
        this.remorque = remorque;
    }
    
    @Override
    public String toString() {
        String affichage = null;
        if (isRemorque())
            affichage = "- Le Camion "+getMarque()+" "+getModele()+" d'immatriculation "+getImmatriculation()+" Contient un remorque.";
        else 
            affichage = "- Le Camion "+getMarque()+" "+getModele()+" d'immatriculation "+getImmatriculation()+" Ne Contient pas un remorque.";
        return affichage;
    }
    
}
