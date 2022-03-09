public class Square {
    private float edge;
    public Square(float inputEdge){
        this.edge = inputEdge;
    }
    void getEdge(){
        System.out.println("Square's Edge: " + this.edge);
    }
    void getPerimeter(){
        System.out.println("Square's Perimeter: " + 4 * this.edge);
    }
    void getArea(){
        System.out.println("Square's Area: " + this.edge * this.edge);
    }
    void getSquare(){
        this.getEdge();
        this.getPerimeter();
        this.getArea();
    }
    public static void main(String[] args) {
        Square square = new Square((float)4.3);
        square.getEdge();
        square.getPerimeter();
        square.getArea();
        square.getSquare();
    }
}
