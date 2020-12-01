//OWN CODE: TAKING IN SCORES:

//Asks the user how many scores they will enter 
//Get them to enter these scores
//Store the scores in an array list 
//Print the scores in ascending order to the user 
//Print out other information about the scores that the user has given 


package own_code_scores;

import java.util.Scanner;
import java.util.ArrayList; 
import java.util.Collections;

public class Own_Code_Scores {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        //Introductions 
        System.out.println("You will be able to input all of your scores here");
        System.out.println("How many scores do you have?"); 
        int amount = input.nextInt(); 
        
        int run = 0;
        
        //Creating the array list that scores will be saved in: 
        ArrayList <Float> scoreList = new ArrayList <> (); 
        
        //Getting the scores and adding them to the arrylist 
        while(run < amount){
            try{
                System.out.println("Print the next score");
                float scores = input.nextFloat(); 
                scoreList.add(scores); 
                run = run + 1; 

        }
        catch(Exception e){
            System.out.println("ERROR: " + e); 
        }
        }
        
        //Printing the scores
        System.out.println("");
        System.out.println("These are your scores that you have entered:");
        System.out.println(scoreList); 
        System.out.println(""); 
        
        //Printing the scores in ascending order 
        System.out.println("These in ascending order are:");
        Collections.sort(scoreList);
        System.out.println(scoreList); 
        
        
        //Calculating the meium value of the scores that the user gave
        int medium = amount/2; 
        
        if(medium % 2 != 0){
            System.out.println("");
            System.out.println("The medium score is:"); 
            System.out.println(scoreList.get(medium)); 
        }
        else{
            System.out.println(""); 
            System.out.println("The medium score is:");
            int secondMedium = medium - 1; 
            float x = (scoreList.get(secondMedium) + scoreList.get(medium)) / 2; 
            System.out.println(x); 
        }
       
        
        
        System.out.println(""); 
        
        
        
        
        
        
        
    }
    
}
