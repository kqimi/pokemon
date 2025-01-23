/**
* Pokemon Object Class.
* @author Kimi Li
* @since 11/22/23
*/

public class PokemonByQianbing {
   //*********Variables************
   /** Pokemon species. */
   private String species;
   /** Pokemon's name. */
   private String name;
   /** Pokemon Pokedex number. */
   private int number;
   /** Hit Power.*/
   private int hp;
   
   /** Pokemon constructor.
   *@param newSpecies The Pokemon species.
   *@param newName The Pokemon name.
   *@param newNumber The Pokedex number. 
   *@param newHP The hit power
   */
   public PokemonByQianbing(String newSpecies, String newName, int newNumber, int newHP) {
      // this.species = newSpecies;
      this.setSpecies(newSpecies);
      // this.name = newName;
      this.setName(newName);
      // this.number = newNumber;
      this.setNumber(newNumber);
      // this.hp = newHP;
      this.setHP(newHP);
      
   }
   
   //************** gets method *********************/
   /**
   * Gets the Pokemon's species.
   * @return The Pokemon's species
   */
   public String getSpecies() {
      return this.species;
   }
   
   /**
   * Gets the Pokemon's name.
   * @return The Pokemon's name
   */
   public String getName() {
      return this.name;
   }
   
   /**
   * Gets the Pokemon's pokedex number.
   * @return The Pokemon's pokedex number
   */
   public int getNumber() {
      return this.number;
   }
   
   /**
   * Gets the Pokemon's hp.
   * @return The Pokemon's hp
   */
   public int getHP() {
      return this.hp;
   }
   
   
   /********* mutator (set) methods *************/
   /**
   * Changes the Species.
   * @param s the new Species.
   * @throws PokemonByQianbingException if empty or only contain spaces.
   */
   public void setSpecies(String s) throws PokemonByQianbingException {
      if (s.trim().length() >= 1) {
         this.species = s;
      } else {
         throw new PokemonByQianbingException("The Species cannot be empty");
      }
   }
   
   /** Changes the Number.
   * @param num the new Number
   * @throws PokemonByQianbingException if the number is < 1 or > 151
   */
   public void setNumber(int num) throws PokemonByQianbingException {
      if (num >= 1 && num <= 151) {
         this.number = num;
      } else {
         throw new PokemonByQianbingException("The number must be between 1 - 151");
      }
   }
   
   /** Changes the HP.
   * @param hit the new HP
   * @throws PokemonByQianbingException if the hp is < 0 or > 401
   */

   public void setHP(int hit) throws PokemonByQianbingException {
      if (hit >= 0 && hit <= 401) {
         this.hp = hit;
      } else {
         throw new PokemonByQianbingException("The hp must be between 0 - 401");
      }
   }
   
   /** Changes the name.
   * @param n the new name
   * assign name variable to species String if it is empty or only contain space
   */
   public void setName(String n) {
      if (n.trim().length() >= 1) {
         this.name = n;
      } else {
         this.name = species;
      }
   }
   
   /** toString method.
   *@return the text representation of the Pokemon.
   */
   public String toString() {
      String p = "Species: " + this.species + "\n"
          + "Name: " + this.name + "\n"
          + "Number: " + this.number + "\n"
          + "HP: " + this.hp;
      return p;
   }
   
   
   
}