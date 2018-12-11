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
public class MainScenario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bandeau bd= new Bandeau();
        Scenario s= new Scenario();
        s.addEffet(new TrucQuiTourne(bd,1));
        s.addEffet(new Zoom(bd,3));
        s.addEffet(new ChangerCouleur(bd,1));
        s.addEffet(new ChangerCouleurFond(bd,1));
        s.jouer();
    }
    
}
