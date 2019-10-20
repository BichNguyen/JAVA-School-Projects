/**
      THis program will allow users to play a guessing game. 
      Name: Bich Nguyen (BN)
      CPS 121 _Online class
 */
 
import javax.swing.JOptionPane; 
import java.util.Random; 

public class BNGame2
   {
      public static void main(String[] args)
      { 
         int x = 1; 
         int number; // To hold the random number
         int enternumber; // To hold the entered number
         String input;   // To hold the input 
         
         // Create a Random class object. 
         Random randomNumbers = new Random(); 
         
         //Get a random number from 1 to 1024 and assign to variable number
          number = randomNumbers.nextInt(1024) + 1; 
         
         // Do-While Statement
          
         do 
         {
            x+=1; 
                      
            
            //User enters a number 
            input = JOptionPane.showInputDialog(" A number randomly generated from 1 to 1024, please enter your guess number:");
            enternumber = Integer.parseInt(input); 
            
            if(enternumber>number)
                {
                  JOptionPane.showMessageDialog(null, "Too high, try again!!! :(   "); 
                  }
             else if(enternumber < number)
                 {
                    JOptionPane.showMessageDialog(null, "Too low, try again!!! :(  "); 
                   }   
             else
                  {
                    JOptionPane.showMessageDialog(null, "Excellent, the correct number is " + number + ", and you entered " + (x -1) + " times.");
                    }
                        
          } while(x <=10);
          
          JOptionPane.showMessageDialog(null, " Hmm, maybe you should try a new game :))");
          
        System.exit(0); 
     }
 }
          
          
         
         
         
       
      