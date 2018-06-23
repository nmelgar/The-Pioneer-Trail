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
           
    }
      
      public void displayStartProgramView() {
        System.out.println("*******************************************************************************************************************\n"
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
            + "******************************************************************************************************************************\n");

        boolean endOfView = false;

        do {
            String[] inputs = this.getInputs();

            if (inputs == null) {
                return;
            }
            

            else if ("Q".equals(inputs[0].toUpperCase())) {
                return;
            }
            

            endOfView = doAction(inputs);

        }
        while (endOfView = false);
    }

    private String[] getInputs() {
        //Gets input for main menu

        Scanner reader = new Scanner(System.in);

        String[] inputs = new String[1];

        boolean valid = false;
        while (valid == false) {

            System.out.println("Enter your name: (Q to quit.)");
            inputs[0] = reader.nextLine();

            inputs[0] = inputs[0].trim();

            if (inputs[0].length() < 1) {
                System.out.println("You must enter a non-blank value");
                continue;
            }

            valid = true;
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        GameControl gameControl = new GameControl();

        String playersName = inputs[0];
        Player player = gameControl.savePlayer(playersName);

        if (player == null) {
            System.out.println("Could not create the player. " + playersName + "Enter a different name.");
            return false;
        }

        System.out.println("==================================================================\n"
            + "Welcome to the Pioneer Trail " + playersName
            + "\nLet's have a good time!\n"
            + "==================================================================");

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();

        return true;
    }
       
      
     
    
}
