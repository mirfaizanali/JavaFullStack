public class Inheritance {

    public static void main(String[] args) {
        Animal animal = new Animal();

        Dog dog = new Dog();

        dog.setColoor("Green");
        dog.setName("Tom");
        animal.setName("tommy");

        System.out.println(animal.getName());
        System.out.println(dog.getName());
        System.out.println(dog.getColoor());
    }
}
