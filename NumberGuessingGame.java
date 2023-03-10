import java.util.*;     
import javax.swing.JOptionPane; 

/**
This program generates a random number guessing game.
*/

public class NumberGuessingGame
{
    public static void main(String[] args)
    {
// Create an object and assign a whole random number 
// from 1 to 1000 to it.
        int rnumber;
        Random randomNumbers = new Random();
        rnumber = randomNumbers.nextInt(100); 

// Ask the user to guess the random number.
        int guess;
        boolean game=false;
        int guesses;
        guesses = 0;                                                           
        while (game==false)       
         {  
            String answer; 
        answer = JOptionPane.showInputDialog("Enter a whole  " +"number between 1 and 100.");
        guess = Integer.parseInt(answer);
            if(guesses>10) 
             {
            JOptionPane.showMessageDialog(null,"The correct numbers is."+rnumber);
                
             }                                
           else if (guess > rnumber)
            {
                guesses++;
                JOptionPane.showMessageDialog(null,"Too high, try again."+(10-guesses));
                
            }            
            else if (guess < rnumber)
            {                         
                JOptionPane.showMessageDialog(null,"Too low, try again."+(10-guesses));
                guesses++;
            }  
            else 
            {                
               guesses++;
               JOptionPane.showMessageDialog(null,"Congratulations! The correct " +"number is " + rnumber + ",and you had" + guesses + "guesses."+"you score "+(11-guesses)*10+"out of 100");
            }
        }

    System.exit(0);
    }  
}
    

