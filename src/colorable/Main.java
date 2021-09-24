package colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shape=new Shape[4];
        shape[0]=new Rectangle(10,2);
        shape[1]=new Rectangle(5,7);
        shape[2]=new Square(3);
        shape[3]=new Square(7);
        information(shape);
    }
    public static void information(Shape[] shapes){
        for (int i = 0; i < shapes.length; i++) {
            System.out.print(shapes[i].getArea());
            if(shapes[i] instanceof Square){
                ((Square) shapes[i]).howToColor();
            }
            System.out.println('\n');
        }
    }
}
