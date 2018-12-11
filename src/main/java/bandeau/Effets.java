/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cbason
 */
package bandeau;
public abstract class  Effets {
    protected Bandeau bd;
    protected int nbRepetition ;
    
    public Effets(Bandeau b, int nb){
        bd=b;
        nbRepetition=nb;
    } 
    
    public abstract void jouer();
        
    }

