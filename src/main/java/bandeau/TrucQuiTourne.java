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
public class TrucQuiTourne {
    private Bandeau bd;
    private int nb;
    
    public TrucQuiTourne (Bandeau b, int n){
        n=nb;
        b=bd;
        int i=0;
        while (i<=n){
	bd.sleep(100);
        i=i+1;
	}
    }
}
