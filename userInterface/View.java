﻿package userInterface;

import java.util.List;

public interface View <T>{
    
    String getName();
    String getOwner();
    String getBirthday();
    <U> void printAll (List <U> list, Class <U> clazz);
    void showMessage (String s);

}