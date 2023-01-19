public class BorderLength {

    public static double borderLength(Figure figure){
        if (figure instanceof Circle) {
            return  ((Circle) figure).Circumference();
        } else if (figure instanceof Rectangle){
            return((Rectangle) figure).Perimeter();
        } else{
            return ((Triangle) figure).Perimeter();
        }
    }
}
