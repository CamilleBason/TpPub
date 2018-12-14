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
        //while(i<=nbRepetition){  
            for ( i=0;i<nbRepetition;i++){
            bd.setMessage("changer la couleur du fond");
           bd.sleep(1000);
        bd.setBackground(Color.yellow);
        bd.sleep(1000);
         bd.setBackground(Color.RED);
              bd.sleep(1000);
       // i=i+1;
            }
            bd.setBackground(Color.WHITE);
    }
    //}

    
}
