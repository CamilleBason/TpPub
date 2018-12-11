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
        int i=0;
        while (i<nb){
        b.setMessage("Bonjour");
        b.setForeground(Color.red);
        b.sleep(1000);
        b.setForeground(Color.RED);
        b.sleep(1000);
        i=i+1;
        }
    }
}
