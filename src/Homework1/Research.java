package Homework1;

import java.util.ArrayList;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship relation) {
        for (Node t : tree) {
            if (t.p1.getFullName().equals(p.getFullName()) && t.getRelationship() == relation) {
                result.add(t.p2.getFullName());
            }
        }
        return result;
    }

}