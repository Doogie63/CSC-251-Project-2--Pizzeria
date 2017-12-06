/**
 * Pizza ordering program
 * 4 Dec 2017
 * CSC 251 Project 2 -Pizzeria
 * @author Todd Anderson
 */

package pizzeria_toddanderson;
import java.util.ArrayList;


public class PizzaOrderingSystem {

    /**
     * @param args the command line arguments
    
     */
    
    String pSize;
    String pOption;
    ArrayList<String> pToppings;
    String pName;
    String pInstructions;
    
    String pPrice;

    @Override
    public String toString() {
        return "Your Order:"
               + "\nSize: " + pSize
               + "\nToppings: " + pToppings.toString()
               + "\nCrust: " + pOption
             //  + "\nName: " + pName
             
               
               + "\nPrice: $ " + pPrice;
    }

    public PizzaOrderingSystem(String pSize, ArrayList pToppings, String pName, String pInstructions, String pOption, String pPrice) {
        this.pSize = pSize;
        this.pOption = pOption;
        this.pToppings = pToppings;
        this.pName = pName;
        this.pInstructions = pInstructions;
        
        this.pPrice = pPrice;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
