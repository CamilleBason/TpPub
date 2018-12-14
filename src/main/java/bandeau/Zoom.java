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
public class Zoom extends Effets{
   
    
    public Zoom (Bandeau b, int n){
        super (b, n);
        
    }
   @Override
    public void jouer(){
//        bd.setMessage("On va zoomer "+nbRepetition+" fois!");
//        int j=0;
//        while (j<=nbRepetition){
//            for (int i = 5; i < 60 ; i+=5) {
//			bd.setFont(new Font("Dialog", Font.BOLD, 5+i));
//			bd.sleep(100);}
//        j=j+1;
//	}
        bd.setMessage("On va zoomer "+nbRepetition+" fois !");
        for(int j=0;j<nbRepetition;j++){
            for (int i = 5; i < 60 ; i+=5) {
			bd.setFont(new Font("Dialog", Font.BOLD, 5+i));
			bd.sleep(100);}
        }
        bd.setFont(new Font("Dialog",Font.BOLD,15));
    }
}
