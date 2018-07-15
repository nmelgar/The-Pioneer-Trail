/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import pioneertrail.PioneerTrail;


/**
 *
 * @author MMG
 */
public abstract class View implements ViewInterface {

   protected String promptMessage;
   
   protected final BufferedReader keyboard = PioneerTrail.getInFile();
   protected final PrintWriter console = PioneerTrail.getOutFile();

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
        
        boolean valid = false;
        String inputs = null;
        try {
            while (valid == false) {
                this.console.println(promptMessage);
                inputs = this.keyboard.readLine();
                inputs = inputs.trim();

                if (inputs.length() < 1) {
                    ErrorView.display(this.getClass().getName(), "You must enter a non-blank value");
                    continue; 
                }
                break;
            }

            valid = true;
            return inputs;
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
        }

        return inputs;
    }
}
    
        /**
        Scanner scan;
        scan = new Scanner(System.in);
        String input = "";
        boolean valid = false;
        while (valid == false) {
            System.out.println(promptMessage);
            input = scan.nextLine();
            if (input.length() < 1) {
                ErrorView.display(this.getClass().getName(),
                        "You must enter a value.");
                continue;
            }
            
            break;
        }
    } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(),
                    "Error Reading Input: "
                    + ex.getMessage());
        }

        return inputs;
    }   */
