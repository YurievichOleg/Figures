import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Rectangle a = null;
        try {
            a = new Rectangle(new Paint(2, 2),1, 5);
        }catch (IllegalArgumentException e){
            System.err.printf("Unable to create Rectangle instance: " + e.getMessage() + "\n");
        }

        Rectangle b = null;
        try {
            b = new Rectangle(new Paint(3, 4), 4);
        }catch (IllegalArgumentException e){
            System.err.printf("Unable to create Rectangle instance: " + e.getMessage() + "\n");
        }


        Triangle c = null;
        try {
            c = new Triangle(new Paint(0,0), new Paint(0, 1), new Paint(1, 0));
        }catch (IllegalArgumentException e){
            System.err.printf("Unable to create Triangle instance: " + e.getMessage() + "\n");
        }
        Circle d = null;
        try{
            d = new Circle(new Paint(10, 10),5);
        }catch (IllegalArgumentException e){
            System.err.printf("Unable to create Circle instance: " + e.getMessage() + "\n");
        }

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(a);
        figures.add(b);
        figures.add(c);
        figures.add(d);

        for (Figure f: figures) {
            System.out.println(f.Area());
        }

        Collections.sort(figures);

        for (Figure f: figures) {
            System.out.println(f.Area() );
            System.out.println(BorderLength.borderLength(f)+ "\n");

        }
        System.out.println(a.Perimeter());


    }
}
