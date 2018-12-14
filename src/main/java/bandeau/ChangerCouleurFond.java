/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;

/**
 *
 * @author crouvera
 */
public class ChangerCouleurFond extends Effets {
    

    public ChangerCouleurFond(Bandeau b, int nb) {
        super(b, nb);
        
    }
    @Override
    public void jouer(){
        int i=0;
        while(i<nbRepetition){  
            bd.setMessage("On va changer la couleur du fond");
           bd.sleep(1000);
        bd.setBackground(Color.DARK_GRAY);
        i=i+1;
    }
    }

    
}
