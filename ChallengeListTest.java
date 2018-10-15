import java.util.Arrays;

public class ChallengeListTest{

  /**
  * Les tests sont à écrire ici.
  * Il peut y avoir plusieurs assert pour chaque methode testée.
  */


  public static void testMoyenne(){
    //  @B
    assertEquals("test moyenne simple", 11, ChallengeList.moyenne(10, 12));

  }

  public static void testPerimetreCarre(){
    // @A
    assertEquals("SquareDigits un seul chiffre", 16, ChallengeList.perimetreCarre(4));
    assertEquals("SquareDigits un seul chiffre", 12, ChallengeList.perimetreCarre(3));
  }

  public static void testCommenceFini(){
    // @B
    assertEquals("test commence fini", true, ChallengeList.commenceFini("anna"));
  }

  public static void testNonMonotone(){
    // @A
    assertEquals("lettre identique", false, ChallengeList.testNonMonotone("AAAA"));
    assertEquals("lettre identique", false, ChallengeList.testNonMonotone("aaaaa"));
    assertEquals("lettre identique", true, ChallengeList.testNonMonotone("AAHHAA"));
    assertEquals("lettre identique", true, ChallengeList.testNonMonotone("aahhaa"));
    assertEquals("lettre identique", true, ChallengeList.testNonMonotone("hhhha"));
    assertEquals("lettre identique", true, ChallengeList.testNonMonotone("haaaa"));

  }

  public static void testTarif(){
    // @B
  }

  public static void testCaGele(){
    // @A
    assertEquals("lettre identique", "ça gèle", ChallengeList.testCaGele( -5 ));
    assertEquals("lettre identique", "ça caille", ChallengeList.testCaGele( 0 ));
    assertEquals("lettre identique", "ça caille", ChallengeList.testCaGele( 2 ));
    assertEquals("lettre identique", "ça caille", ChallengeList.testCaGele( 4 ));
    assertEquals("lettre identique", "RAS", ChallengeList.testCaGele( 5 ));
    assertEquals("lettre identique", "RAS", ChallengeList.testCaGele( 15 ));
    assertEquals("lettre identique", "RAS", ChallengeList.testCaGele( 90 ));
    assertEquals("lettre identique", "ça bouille", ChallengeList.testCaGele( 91 ));
    assertEquals("lettre identique", "erreur", ChallengeList.testCaGele( -275 ));
  }

  public static void testFiltreShort(){
    // @B
  }

  public static void testFiltreLetter(){
    // @A
    assertEquals("retourne nom commence lettre", "maison","chat","voiture" , ChallengeList.testCaGele( "maison","chat","voiture" ));
    assertEquals("retourne nom commence lettre", "chat", ChallengeList.testCaGele( "1maison","chat","1voiture" ));
    assertEquals("retourne nom commence lettre", "maison" , ChallengeList.testCaGele( "maison",".chat","'voiture" ));
  }


  /**
  * un exemple de test
  */
  public static void testSquareDigits(){
    assertEquals("SquareDigits un seul chiffre", 16, ChallengeList.squareDigits(4));
    assertEquals("SquareDigits plusieurs chiffres", 811181, ChallengeList.squareDigits(9119));
  }


  /****************************************************************************
  * NE PAS TOUCHER CE QUI SUIT
  **/
  public static void main(String[] args){
    testMoyenne();
    testPerimetreCarre();
    testCommenceFini();
    testNonMonotone();
    testSquareDigits();
    testTarif();
    testCaGele();
    testFiltreShort();
    testFiltreLetter();
  }

  public static void assertEquals(String message, String[] expected, String[] res){
    if (java.util.Arrays.deepEquals(expected, res)) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (exp : "+Arrays.toString(expected)+", res : "+Arrays.toString(res)+")");
    }
  }

  public static void assertEquals(String message, double expected, double res){
    if (Math.abs(expected-res) < 0.0001) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (exp : "+expected+", res : "+res+")");
    }
  }

  public static void assertEquals(String message, int expected, int res){
    if (expected == res) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (exp : "+expected+", res : "+res+")");
    }
  }

  public static void assertTrue(String message, boolean res){
    if (res) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message+" (res : "+res+")");
    }
  }

  public static void assertFalse(String message, boolean res){
    assertTrue(message, !res);
  }
}
