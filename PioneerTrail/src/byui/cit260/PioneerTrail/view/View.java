/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.view;

import java.util.Scanner;


/**
 *
 * @author MMG
 */
public abstract class View implements ViewInterface {

   protected String promptMessage;

    public View() {
    }

    public View(String menusPrompt) {
        this.promptMessage = menusPrompt;
    }

    @Override
    public void display() {
        boolean endOfView = false;
        String inputs;
        do {
            inputs = this.getInputs();
            if (inputs == null || inputs.toUpperCase().equals("Q")) {
                return; 
            }

            endOfView = doAction(inputs);
        } while (endOfView == true);

    }

    @Override
    public String getInputs() {
        return getInput(promptMessage);
    }

    @Override
    public String getInput(String promptMessage) {
        Scanner scan;
        scan = new Scanner(System.in);
        String input = "";
        boolean valid = false;
        while (valid == false) {
            System.out.println(promptMessage);
            input = scan.nextLine();
            if (input.length() < 1) {
                System.out.println("You must enter a value");
                continue;
            }
            valid = true;
        }
        return input;
    }
}