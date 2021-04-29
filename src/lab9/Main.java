package lab9;

import lab9.models.Circle;
import lab9.models.Rectangle;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Circle> circleSet = new TreeSet<>(new Circle.RadiusComparator());

        for (int i = 10; i > 0; i--) {
            circleSet.add(new Circle(i));
        }

        for (Circle circle : circleSet) {
            System.out.println(circle);
        }

        System.out.println("---------------------------");

        Set<Rectangle> rectangleSet = new TreeSet<>(new Comparator<Rectangle>() {
            @Override
            public int compare(Rectangle r1, Rectangle r2) {
                return (r1.getArea() == r2.getArea()) ? 0 : (r1.getArea() > r2.getArea()) ? 1 : -1;
            }
        });
        for (int i = 10; i > 0; i--) {
            rectangleSet.add(new Rectangle(i, i));
        }

        for (Rectangle rectangle : rectangleSet) {
            System.out.println(rectangle);
        }
    }
}
