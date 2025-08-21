 class Pen {
    String color;
    String type;

    public void Write(){
        System.out.println("It's a pen");
    }
    public void PenColor(){
        System.out.println("color of pen is "+this.color);
    }
    public void PenType(){
        System.out.println(this.type);
    }

}
public class PenDemo{
public static void main(String args[]){
    Pen p1 = new Pen();
    p1.color = "blue";
    p1.type = "gel";
    p1.PenColor();
    p1.PenType();
    p1.Write();
}
}