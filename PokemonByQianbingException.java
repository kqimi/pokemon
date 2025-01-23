/**
* PokemonByQianbingException RuntimeException.
* @author Kimi Li
* @since 11/22/23
*/

public class PokemonByQianbingException extends RuntimeException {
   /**
   * constructor with message String.
   * @param message The error message
   */
   public PokemonByQianbingException(String message) {
      //call super class constructor
      super(message);
   }
   
   /**
   * constructor with no message.
   */
   public PokemonByQianbingException() {
      super("There was an error");
   }
}