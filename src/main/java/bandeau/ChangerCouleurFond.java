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
    //private Bandeau bd2;

    public ChangerCouleurFond(Bandeau b, int nb) {
        super(b, nb);
        int i=0;
        while(i<nb){  
            b.setMessage("Couleur");
           b.sleep(1000);
        b.setBackground(Color.DARK_GRAY);
        i=i+1;
    }
    }

    
}
