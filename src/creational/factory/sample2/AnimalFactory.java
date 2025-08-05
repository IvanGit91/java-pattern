package creational.factory.sample2;

// The Factory Method pattern defines an interface for creating objects, but lets subclasses decide which class to instantiate.
// It is particularly useful when object creation depends on environment variables, configurations, or complex logic.

interface AnimalF {
    void speak();
}

class DogF implements AnimalF {
    @Override
    public void speak() {
        System.out.println("Bark");
    }
}

class CatF implements AnimalF {
    @Override
    public void speak() {
        System.out.println("Meow");
    }
}

public class AnimalFactory {
    public static AnimalF createAnimal(String type) {
        if (type.equalsIgnoreCase("dog")) {
            return new DogF();
        } else if (type.equalsIgnoreCase("cat")) {
            return new CatF();
        }
        throw new IllegalArgumentException("Unknown animal type");
    }
}
