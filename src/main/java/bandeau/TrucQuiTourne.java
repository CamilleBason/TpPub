/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author cbason
 */
public class TrucQuiTourne extends Effets{
    private Bandeau bd;
    private int nb;
    
    public TrucQuiTourne (Bandeau b, int n){
        super (b, n);
        bd.setMessage("On va tourner "+nb+" fois!");
        int j=0;
        while (j<=nb){
	bd.sleep(100);
        for (int i = 0; i <= 100; i++) {
		b.setRotation(2*Math.PI*i / 100);
		b.sleep(100);
        j=j+1;
	}
    }
}
}
