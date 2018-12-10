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
public class ChangerCouleurFond {
    private Bandeau bd2;
    
    
    public void ChangerFond(Bandeau bd2){
        
        bd2.sleep(1000);
        bd2.setBackground(Color.DARK_GRAY);
    }
    
}
