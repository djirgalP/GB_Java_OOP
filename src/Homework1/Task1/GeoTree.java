package Homework1.Task1;

import java.util.ArrayList;

public class GeoTree implements Research{

    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {

        return tree;
    }

    public void appendChild(Person parent, Person children) {
        if (parent == null || children == null) {
            return;
        }
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));

    }

    public void appendPartner(Person partner1, Person partner2){
        if (partner1 == null || partner2 == null) {
            return;
        }
        tree.add(new Node(partner1,Relationship.partner,partner2));
        tree.add(new Node(partner2,Relationship.partner,partner1));

    }

    @Override
    public ArrayList<String> getParents(Person person) {
        System.out.printf("Родители человека по имени %s : ", person.getFullName());
        return spend(person, Relationship.children);
    }

    @Override
    public ArrayList<String> getChildren(Person person) {
        System.out.printf("Дети человека по имени %s : ", person.getFullName());
        return spend(person, Relationship.parent);
    }

    @Override
    public void getPartners(Person person) {
        ArrayList<String> result = spend(person, Relationship.partner);
        if (result.isEmpty()) {
            System.out.printf("Данных о супруге человека по имени %s нет.", person.getFullName());
        }
        else {
            System.out.printf("Супруг/супруга человека по имени %s : ", person.getFullName());
            System.out.println(result);

        }
    }

    @Override
    public ArrayList<String> spend(Person p, Relationship relation) {
        ArrayList<String> result = new ArrayList<>();
        for (Node t : tree) {
            if (t.p1.getFullName().equals(p.getFullName()) && t.getRelationship() == relation) {
                result.add(t.p2.getFullName());
            }
        }
        return result;
    }
}