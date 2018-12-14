/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author crouvera
 */
public class ChangerCouleur extends Effets {
 
        

    public ChangerCouleur(Bandeau b, int nb) {
        super(b, nb);
        
    }
    @Override
    public void jouer(){
        for(int i=0;i<nbRepetition;i++){
            bd.setMessage("changer la couleur");
            bd.setForeground(Color.RED);
            bd.sleep(1000);
            bd.setForeground(Color.BLACK);
            bd.sleep(1000);
        }
        //int i=0;
        //while (i<=nbRepetition){
        //bd.setMessage("On va changer la couleur de l'écriture");
        //bd.setForeground(Color.red);
        //bd.sleep(1000);
        //i=i+1;
        //}
    }
    
}
