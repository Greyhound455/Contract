import java.util.*;
class Main {
  public static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {

    System.out.println("\033\143");
    System.out.println("Sign your name on the Contract and i'll give you a job.");
    String name = input.next();
    name = name.substring(0,4);
    Contract spirit = new Contract(name);
    System.out.println(spirit.getWord());
  }

  public static class Contract{

    private String word;

    public Contract(String startWord){
      word = startWord;
    }

    public void setWord(String newWord){
      word = newWord;
    }

    public String getWord(){
      System.out.println("Here is your new name: " );
      System.out.pritnln("who needs your old name lmao")
      return word;
    }
  }
}
