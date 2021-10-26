package Dahinh2;

import java.util.*;

public class Layer {
    private List<Shape> shapes = new ArrayList<Shape>();

    public void addShape() {
        shapes.add(new Circle());
        shapes.add(new Rectangle());
        shapes.add(new Circle());
        shapes.add(new Square());
    }

    public String getInfor() {
        return shapes.toString();
    }

    public void removeCircle() {
        shapes.remove(new Circle());
    }

    public void removeDuplicates() {
        Set<Shape> removeduplicates = new HashSet<>(shapes);
        shapes.clear();
        shapes.addAll(removeduplicates);
    }
}
