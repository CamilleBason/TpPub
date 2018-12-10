/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Font;

/**
 *
 * @author cbason
 */
public class Zoom {
   private Bandeau bd;
    private int nb;
    
    public Zoom (Bandeau b, int n){
        n=nb;
        b=bd;
        int j=0;
        while (j<=n){
            for (int i = 5; i < 60 ; i+=5) {
			bd.setFont(new Font("Dialog", Font.BOLD, 5+i));
			bd.sleep(100);}
        j=j+1;
	}
    }
}