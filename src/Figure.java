abstract class Figure implements Comparable<Figure>, Area{
    protected Paint location;



    public abstract double Area();

    @Override
    public int compareTo(Figure o){
        return (int) (this.Area() * 100 - o.Area() * 100);
    }

}
