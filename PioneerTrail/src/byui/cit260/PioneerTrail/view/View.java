/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.view;


/**
 *
 * @author MMG
 */
public abstract class View implements ViewInterface {

    public View() {
    }
    
    @Override
    public void display(){
        
         boolean endOfView = false;
        
        do {
           
            String[] inputs = this.getInputs();

            if (inputs == null) {
                return;
            } else if ("E".equals(inputs[0].toUpperCase())) {
                return;
            }

            endOfView = doAction(inputs);
            
        } while (endOfView == false);
        
    }
    
    @override
    public String getInputs(String promptMessage) {
    
    
         return inputs;
    }
}
