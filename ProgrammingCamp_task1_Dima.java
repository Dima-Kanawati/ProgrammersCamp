//Dima Kanawati / First Task : Ceaser cipher
package programmingcamp_tast1_dima;
import java.util.Scanner;
public class ProgrammingCamp_task1_Dima {
    public static void main(String[] args) {
        
       Scanner input = new Scanner (System.in);
       
       //Format. 
       System.out.println("------------------------------------------------");
       System.out.println("Welcome to Java Programming Camp !");
       System.out.println("------------------------------------------------");
       System.out.println();
       System.out.print("Enter your message: ");
       String message = input.nextLine();
       
       //The Coded message.
       String codedMessage = ""; 
       //A character in the message.
       char character;
       //Shift Number.
       int N = 5;
       
        //For loop go through all the letters in the message.
        for(int i = 0; i < message.length(); i++){
            character = message.charAt(i);  
            
            //From a to z shift 5 positions down the alphabet.
            if(character >= 'a' && character <= 'z'){
                character = (char)(character + N);
                
                //If the letter is z it rotates to e.
                if(character > 'z'){
                    character = (char)(character - 'z' + 'a' - 1);
                }
                //Coded message
                codedMessage = codedMessage + character;
            }
            
            //From A to Z shift 5 posistions down the alphabets.
            else if(character >= 'A' && character <= 'Z'){
	        character = (char)(character + N);
                //If the letter is Z it rotates to E.
	        if(character > 'Z'){
	            character = (char)(character - 'Z' + 'A' - 1);
	        }
                //Coded message 
	        codedMessage = codedMessage + character;
	    }
            
            //For white space 
	    else {
                codedMessage = codedMessage + character;
	    }
        }
       	System.out.println("Coded message: " +  codedMessage);
    }
}
