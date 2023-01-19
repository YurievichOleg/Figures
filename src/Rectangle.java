public class Rectangle extends Figure implements Perimeter{

    private int width;
    private int length;
    public Rectangle(Paint location, int width, int length){
        if ( width < 0 || length < 0){
            throw new IllegalArgumentException("Не верные вводные данные. Длина и ширина не могут принимать отрицательные значения");
        }

        super.location = location;
        this.width = width;
        this.length = length;
    }

    public Rectangle(Paint location, int width){
        this(location, width, width);
    }




    @Override
    public double Area() {
        return width * length;
    }

    @Override
    public double Perimeter() {
        return width * 2 + length * 2;
    }
}
