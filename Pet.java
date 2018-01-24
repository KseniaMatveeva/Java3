public class Pet {
    private static Pet pet = new Pet();

    Pet() {
    }


    public static Pet getInstance() {
        return pet;
    }

}



