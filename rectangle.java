class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void displayInfo() {
        system.out.println("Rectangle[Length " + length + "Width" + width + "]");
        system.out.println("Area" + getArea());
        system.out.println("perimeter" + getPerimeter());
    }
}

public static void main(String[] args) {
    Rectangle rect1 = new Rectangle(5, 3);
    Rectangle rect2 = new Rectangle(7, 4);
    system.out.println("Rectangle 1");
    rect1.displayInfo();
    system.out.println("\nRectangle 2");
    rect2.displayInfo();
}
