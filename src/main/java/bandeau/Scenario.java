/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.ArrayList;

/**
 *
 * @author cbason
 */
public class Scenario {
    Bandeau bd;
    ArrayList<Effets> lesEffets;
    
    public Scenario(){
        new ArrayList<>();
    }
   
    
    public void addEffet(Effets e){
        lesEffets.add(e);    
    }
    
    public void jouer(){
        
    }
}
