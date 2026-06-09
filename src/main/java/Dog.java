public class Dog extends GreyWolf {

  private int huntcount = 0;

  @Override
  public void vocalize() {
    System.out.println("Woof!");
  }

  public void hunt() {
    huntcount = huntcount + 1;
    System.out.println("The dog is chasing a squirrel for the " + huntcount + " time ");
  }

  static void describe() {
    System.out.println("Dog");
  }

}
