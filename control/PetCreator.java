package control;

public class PetCreator extends Creator {

    @Override
    protected Pet createNewPet (PetType type) {

        switch (type) {
            case Cat:
                return new Cat();
            case Dog:
                return new Dog();
            case Hamster:
                return new Hamster();
            case Cow:
                return new Cow();
            case Pork:
                return new Pork();
            case Sheep:
                return new Sheep();
            case Mouse:
                return new Mouse();

                
        }
        return null;
    }
}
