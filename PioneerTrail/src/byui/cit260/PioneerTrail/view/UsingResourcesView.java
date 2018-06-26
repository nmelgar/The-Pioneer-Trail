/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.view;

/**
 *
 *
 */
public class UsingResourcesView extends View{

 public UsingResourcesView(){

     super( 
             "++++++++++++++++++++++++++++++++++++++++++++++++++\n"
            + "Resources are key in helping you throughout your Journey."
            + "There are some resources that are available for your use."
            + "Some required resources for your journey are:"
            + "Food, Axe, Hammer, Spare wheels, Bullets, woods and Drinking Water."
            + "Select the reources that you will need for your journey safely"
            + "++++++++++++++++++++++++++++++++++++++++++++++++++\n"
            + "\n Q Exist"
     );
             
    }

    @Override
    public boolean doAction(String inputs) {
        
        String menuOptions = inputs.toUpperCase();    
    switch(menuOptions) {
        case "Q":
            return true;
        default:
            System.out.println("Invalid input");
    }
     return false;
    }
        
    }
    

