public class GreyWolf extends Canis {

  @Override
  public void vocalize() {
    System.out.println("Awooo!");
  }
  @Override
  public void hunt() {
    System.out.println("The wolf is hunting some deer");
  }


  static void describe() {
    System.out.println("GreyWolf");
  }

}
