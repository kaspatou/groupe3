public class ChallengeList {

  /**
  * retourne la moyenne de a et de b
  */
  public static double moyenne(double a, double b){

    double moyenne =  (a + b) / 2  ;

    return moyenne;
  }

  /**
  * retourn le perimetre d'un carre de côté a
  */
  public static int perimetreCarre(int a){
    // TODO @B
    int perimetre = a*4;
    return perimetre;
  }

  /**
  * retourne vrai si les 2 lettres du début et de la fin sont les mêmes
  * ex "ABCDDFAB" : true
  */
  public static boolean commenceFini(String mot){
    // TODO @A
    return false;
  }

  /**
  * retourne vrai si le mot contient des lettres différentes
  * ex "AAAAAA" : false
  * "AAAHAA" : true
  */
  public static boolean nonMonotone(String mot){
    // TODO @B
    return false;
  }

  /**
  * retourne le tarif associé à l'âge :
  * "gratuit" pour les moins de 3 ans
  * "reduit" pour les 3 à 12 ans
  * "plein" pour les autres
  * "erreur" si age négatif
  **/
  public static String tarif(int age){
    // TODO @A
    return null;
  }

  /**
  * retourne un message correspondant à la température :
  * "ça gèle" si la temperature est négative
  * "ça caille" pour une temperature entre 0 et 5
  * "RAS" pour une temperature en 5 et 90
  * "ça bouille" si la température est supérieure à 90
  * "erreur" si la température est inférieure à -274
  **/
  public static String caGele(int temperature){
    // TODO @B
    if (temperature < 0) {
      System.out.println("ca gèle");
    }
    if (temperature >= 0 && temperature <= 5) {
      System.out.println("ca caille");
    }
    if (temperature > 5 && temperature <90) {
      System.out.println("RAS");
    }
    if (temperature > 90) {
      System.out.println("ça bouille");
    }
    if (temperature == -274) {
      System.out.println("erreur");
    }

    return null;
  }

  /**
  * parcourt le tableau de noms et retourne une liste de tous les noms qui ont une longueur > 2
  **/
  public static String[] filtreShort(String[] noms){
    // TODO @A
    return null;
  }

  /**
  * parcourt le tableau de noms et retourne une liste de tous les noms qui commencent par lettre
  **/
  public static String[] filtreLetter(String[] noms, char lettre){
    // TODO @B
    return null;
  }


  /**
  * un exemple
  **/
  public static int squareDigits(int n) {
    String res="";
    for (char digit : (n+"").toCharArray()){
      int d = Character.getNumericValue(digit);
      res = res + (d*d);
    }
    return Integer.parseInt(res);
  }


}
