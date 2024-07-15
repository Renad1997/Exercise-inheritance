public class Square extends Rectangle {

    public Square() {

    }

    public Square(double side){
    super(side,side);
    }

    public Square(String color, boolean filled , double side){
      super(color,filled,side ,side);
    }

    public double getSide(){
        return super.getArea();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
@Override
    public String toString(){
        return "color "+super.getColor()+" filled:"+super.isFilled()+" side: "+super.getLength()+" area: "+getArea()+" perimeter:"+getPerimeter();
    }

}
