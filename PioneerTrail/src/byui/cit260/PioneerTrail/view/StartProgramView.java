/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.view;

import byui.cit260.PioneerTrail.model.Player;




/**
 *
 * @author MMG
 */

/**
 * displayStartProgramView() {
 endOfView = false
 DO
inputs = getInputs()
IF no inputs were entered OR the first input is Q
 RETURN
ENDIF
endOfView = doAction(inputs)
WHILE endOfView != true
}
 * @author MMG
 */

public class StartProgramView {
    
      public StartProgramView () {
           
    }
        public void startProgram() {   
       
        this.displayBanner();
       
        String playerName = this.getPlayerName ();
       
        Player player = new player(playerName); 
       
        this.displayWelcomeMessage(player);
       
        MainMenuView mainmenu = new MainMenuView();
        mainmenu.display();
    
    }
}
