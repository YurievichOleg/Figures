public class Circle extends Figure implements Сircumference{

    private int radius;

    public Circle(Paint location, int radius){
        if (radius < 0 ){
            throw new IllegalArgumentException("Не верные вводные данные. Радиус не может иметь отрицательное значение");
        }
        super.location =location;
        this.radius = radius;
    }


    @Override
    public double Area() {
        return 3.14 * Math.pow(radius, 2);
    }

    @Override
    public double Circumference() {
        return 2 * 3.14 * radius;
    }
}
