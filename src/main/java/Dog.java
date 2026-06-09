public non-sealed class Dog extends GreyWolf {

  private int huntcount = 0;

  {
    System.out.println("In Dog instance initialization");
  }

  static {
    System.out.println("In Dog static initialization");
  }

public Dog() {
  System.out.println("In Dog constructor prologue");
    super();
  System.out.println("In Dog constructor epilogue");
}

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
