package control;

import java.time.LocalDate;

public abstract class Creator {

    protected abstract Pet createNewPet(PetType type);

    public Pet createPet(PetType type, String name, String owner, LocalDate date) {

        Pet pet = createNewPet(type);
        pet.setName(name);
        pet.setOwner(owner);
        pet.setBirthday(date);
                
        return pet;
    }
}