package Interface;

import Interface.Circle;
import Interface.GeometricObject;

import java.util.List;

public class ShapeUtil {
    /**
     * dua thong tin.
     *
     * @param shapes as a list.
     * @return info.
     */
    public String printInfo(List<GeometricObject> shapes) {
        String toInfo = "";
        toInfo += "Interface.Circle:\n";
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                Circle circle = (Circle) shapes.get(i);
                toInfo += circle.getInfo() + "\n";
            }
        }
        toInfo += "Interface.Triangle:\n";
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Triangle) {
                Triangle triangle = (Triangle) shapes.get(i);
                toInfo += triangle.getInfo() + "\n";
            }
        }
        return toInfo;
    }
}
