import java.util.Scanner;
/**
* Array of Pokemons to create a team.
* @author Kimi Li
* @since 11/28/23
*/

public class Assignment11Qianbing {
   /** USER CAN ENTER UP TO SIX POKEMON. */
   static final int SIZE = 6;
   
   /** 
   * main method. 
   * @param args not used
   */
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      //declare array
      PokemonByQianbing[] pokeArray = new PokemonByQianbing[SIZE];
      String temp = "";
      String pSpecies = "";
      String pName = "";
      int pNum = 0;
      int pHp = 0;
      //counter of pokemons
      int counter = 0;
      //sentinal to stop loop
      boolean keepGoing = true;
      
      //user instruction 
      System.out.println("Hello, I am a program that can create a team of"  
            + " 6 and less Pokemons");
      
      do {
         System.out.println("Do you want to add a Pokemon to your team? y/n:");
         temp = scan.nextLine();
            
         if (temp.equalsIgnoreCase("N")) {
            keepGoing = false;
         } else if (!(temp.equalsIgnoreCase("Y"))) {
            System.out.println("ERROR. Please enter y/n.");
         } else {
               //user enter y
               //ask for Pokemon info
            System.out.println("Enter Pokemon's species: ");
            pSpecies = scan.nextLine();
            System.out.println("Enter Pokemon's name: ");
            pName = scan.nextLine();
            System.out.println("Enter Pokemon's number: ");
            temp = scan.nextLine();
            try {
               pNum = Integer.parseInt(temp);
               System.out.println("Enter Pokemon's HP: ");
               temp = scan.nextLine();
               pHp = Integer.parseInt(temp);
                  
                  //put new pokemon into array
               pokeArray[counter] = new PokemonByQianbing(pSpecies, pName, pNum, pHp);
                  
               System.out.println("\nThis pokemon was added to your team");
               System.out.println(pokeArray[counter] + "\n");
                  
               counter++;
                  
            } catch (NumberFormatException nfe) {
               System.out.println("You didn't enter a valid number");
               System.out.println("Please try again\n");
                  
            } catch (PokemonByQianbingException pbq) {
               System.out.println("ERROR: " + pbq.getMessage());
               System.out.println("Please try again!\n");
            }
         } // else
            
      } while(keepGoing && (counter < SIZE));
      //loop while user continues or list not full
      
      System.out.println("\nYou have " + counter + " Pokemons on your list\n");
      
      //print the list
      for (int i = 0; i < counter; i++) {
         System.out.println("Pokemon " + (i + 1) + " " + pokeArray[i] + "\n");
         
      } 
         
      
      
      
      
      
      
   }  

}