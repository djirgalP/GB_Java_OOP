package Homework1.Task1;

import java.util.ArrayList;

public class GeoTree {

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
}