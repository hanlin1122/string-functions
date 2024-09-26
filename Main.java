class Main {
  public static void main(String[] args) {
    System.out.println(capFirstWord("Hello. my name is henry. you love to play games"));
  }
  public static int spaceCount(String s){
    int count = 0;
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) == ' '){
        count++;
      }
    }
    return count;
  }
  public static int vowelCount(String s){
    int count = 0;
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
        count++;
      }
    }
    return count;
  }
  public static int letterCount(String s, String letter){
    int count = 0;
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) == letter.charAt(0)){
        count++;
      }
    }
    return count;
  }
  public static String duplicate(String s, String letter){
    s = s.substring(0,s.indexOf(letter)) + letter + s.substring(s.indexOf(letter));
    //System.out.println(s.substring(s.indexOf("i")));
    return s;
  }
  public static String beforeString(String s, String substr){
    s = s.substring(0,s.indexOf(substr));
    return s;
  }
  public static String afterString(String s, String substr){
    s = s.substring(s.indexOf(substr) + substr.length());
    return s;
  }
  public static String capVowel(String s){
    return s.replaceAll("a", "A").replaceAll("e", "E").replaceAll("i", "I").replaceAll("o", "O").replaceAll("u", "U");
  }
  public static boolean isVowel(String s){
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U'){
        return true;
      }
    }
    return false;
  }
  public static String capFirstWord(String s){
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) == '.'){
        s = s.substring(0,i+2) + s.substring(i+2,i+3).toUpperCase() + s.substring(i+3);
      }
    }
    return s;
  }
  public static String reverse(String s){
    String str = "";
    char ch;
    for(int i = 0; i < s.length(); i++){
      ch = s.charAt(i);
      str = ch + str;
    }
    return str;
  }
}
