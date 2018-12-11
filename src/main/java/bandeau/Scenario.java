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
   
    ArrayList<Effets> lesEffets = new ArrayList<>();
    
    public Scenario(){
       // ArrayList<Effets>() ;
    }
   
    
    public void addEffet(Effets e){
        lesEffets.add(e);    
    }
    
    public void jouer(){
        for(Effets e:lesEffets){
            e.jouer();
        }
        
    }
}
