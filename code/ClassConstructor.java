class AnimalB {
  private String name;

  public AnimalB(String name) {
    this.name = name;
  }

  public void walk() {
    System.out.println("My name is " + this.name + " and I'm walking");
  }
}

class ClassConstructor {
  public static void main(String[] args) {
    new AnimalB("Kelya").walk();
  }
}
