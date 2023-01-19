public class Triangle extends Figure implements Perimeter{

    private Paint location2;
    private Paint location3;
    public Triangle(Paint location1, Paint location2, Paint location3){
        if ( (location1.getX() == location2.getX() && location2.getX() == location3.getX()) || (location1.getY() == location2.getY() && location2.getY() == location3.getY())){
            throw new IllegalArgumentException("Не верные вводные данные. Проверьте координаты вершин треугольника");
        }
        super.location = location1;
        this.location2 = location2;
        this.location3 = location3;
    }



    @Override
    public double Area() {
        double halfPerimeter = Perimeter() / 2;
        double l1 = Math.sqrt(Math.pow((location.getX() - location2.getX()),2) + Math.pow((location.getY() - location2.getY()),2));
        double l2 = Math.sqrt(Math.pow((location2.getX() - location3.getX()),2) + Math.pow((location2.getY() - location3.getY()),2));
        double l3 = Math.sqrt(Math.pow((location.getX() - location3.getX()),2) + Math.pow((location.getY() - location3.getY()),2));
        return Math.sqrt(halfPerimeter * (halfPerimeter - l1) * (halfPerimeter - l2) * (halfPerimeter - l3));
    }

    @Override
    public double Perimeter() {
        double l1 = Math.sqrt(Math.pow((location.getX()- location2.getX()),2) + Math.pow((location.getY() - location2.getY()),2));
        double l2 = Math.sqrt(Math.pow((location2.getX() - location3.getX()),2) + Math.pow((location2.getY() - location3.getY()),2));
        double l3 = Math.sqrt(Math.pow((location.getX()- location3.getX()),2) + Math.pow((location.getY() - location3.getY()),2));
        return l1 + l2 + l3;
    }
}
