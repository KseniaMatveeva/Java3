
class Cat extends Pet {

   public static Cat cat = new Cat();

    private Cat() {
        super();
    }


      public static Cat getInstance() {
        return cat;
    }

    public static void main(String[] args) {

      System.out.println(Cat.getInstance());
        System.out.println(Pet.getInstance());
    }
}
