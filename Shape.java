public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
    color = "green";
      filled = true;
    }

    public Shape(String color , boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
@Override
    public String toString() {
        return "color=" + color + " filled=" + filled ;
    }


}
