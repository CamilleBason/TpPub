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
        
    
        
        
        public void ChangerCouleur(Bandeau bd1){
        
    	bd1.setForeground(Color.YELLOW);
        bd1.sleep(1000);
        bd1.setForeground(Color.RED);
        bd1.sleep(1000);
        }
}
