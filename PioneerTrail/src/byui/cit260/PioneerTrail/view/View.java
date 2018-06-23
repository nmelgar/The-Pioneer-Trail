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

    public View() {
    }
    
    protected String promptMessage;

    public View() {
    }

    public View(String menuPrompt) {
        this.promptMessage = menuPrompt;
    }

    @Override
    public void display() {
        boolean endOfView = false;
       
        do {
            String[] inputs = this.getInputs();
            if (inputs == null){
            return;
            } else if ("E".equals(inputs[0].toUpperCase())){ }) {
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
        Scanner reader = new Scanner(System.in);
        String[] inputs = new String[1],
        boolean valid = false;
        String input = "";
        while (valid == false) {
            System.out.println(promptMessage);
            input = reader.nextLine();
            input = input.trim();
            if (input.length() < 1) {
                System.out.println("You must enter value");
                continue;
            }
            valid = true;
        }
        return input;
    }
}
