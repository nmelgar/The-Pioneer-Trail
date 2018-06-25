/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.view;

import byui.cit260.PioneerTrail.control.GameControl;
import byui.cit260.PioneerTrail.model.Player;
import byui.cit260.PioneerTrail.control.PlayerControl;
import java.util.Scanner;




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

public class StartProgramView extends View{
    
      public StartProgramView () {
          super("*******************************************************************************************************************\n"
            + "*    ____   _                                      ______              _  __ .\n"
            + "*   / __ \\ (_)____   ____   ___    ___   _____    /_  __/_____ ____ _(_)/ /  .\n"
            + "*  / /_/ // // __ \\ / __ \\ / _ \\  / _ \\ / ___/    / /  / ___// __ `// // /   .\n"
            + "* / ____// // /_/ // / / //  __/ /  __// /       / /  / /   / /_/ // // /    .\n"
            + "*/_/    /_/ \\____//_/ /_/ \\___/  \\___//_/       /_/  /_/    \\\\___//_//_/     .\n" 
            + "* Welcome to the Pioneer Trail.\n"
            + "* You are traveling with your family and other people to the west.\n"
            + "* Your family is composed of both parents and three children.\n"
            + "* Before starting the journey of 1500 miles, you must buy a serie of items, .\n"
            + "* necessary for the trips, such as:  food, water, tools and other things.\n"
            + "* You will have a wagon to take items with you through the journey.\n"
            + "******************************************************************************************************************************\n"
          
            + "Enter your name:  (Press Q to exit)"
          );
          }
      
      /**
       * 
       * Not sure about the use of "trim" for the code
       *  
       */
      
     @Override
    public boolean doAction(String inputs) {
        String playersName = inputs;
        Player player = GameControl.savePlayer(playersName);
        
        System.out.println(
                  "==========================================================\n "
                + "Welcome to the Pioneer Trail " + playersName.toUpperCase()
                + "\n We hope you have a good time!\n"
                + "===========================================================\n"
        );
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        return true;
    } 
}
