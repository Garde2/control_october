package control;

public enum PetType {
    
    Cat,
    Dog,
    Hamster,
    Mouse,
    Cow,
    Sheep,
    Pork;

    public static PetType getType (int typeId){
        switch (typeId){
            case 1:
                return PetType.Cat;
            case 2:
                return PetType.Dog;
            case 3:
                return PetType.Hamster;
            case 4:
                return PetType.Mouse;
            case 5:
                return PetType.Cow;
            case 6:
                return PetType.Sheep;
            case 7:
                return PetType.Pork;

        
            default:
                return null;
        }
    }
}