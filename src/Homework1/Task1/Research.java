package Homework1.Task1;

import java.util.ArrayList;

public interface Research {

    ArrayList<String> getParents(Person person);

    ArrayList<String> getChildren(Person person);

    void getPartners(Person person);

    ArrayList<String> spend(Person p, Relationship relation);
}