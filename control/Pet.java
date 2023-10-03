package control;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pet {
    
    protected int petId;
    protected String name;
    protected String owner;
    protected LocalDate birthday;
    protected String command;
    
    public void setPetId(int petId) {
        this.petId = petId;
    }

    public int getPetId() {
        return petId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setBirthday(LocalDate date) {
        this.birthday = date;
    }

    public LocalDate getBirthdayDate(){
        return birthday;
    }

    public String getBirthday() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return formatter.format(birthday);
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    @Override
    public String toString() {
        return String.format("%d. %s: имя: %s, хозяин: %s, дата рождения: %s, команда: %s ", getPetId(), getClass().getSimpleName(), name, owner, getBirthday(), command);
    }
}