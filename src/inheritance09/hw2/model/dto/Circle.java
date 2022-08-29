package inheritance09.hw2.model.dto;

public class Circle extends Point{
    private int radius;

    public Circle() {
    }

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        super.draw();
        double area = Math.PI * (this.radius * this.radius);
        double round = Math.PI * (this.radius * 2);
        System.out.println("면적 : " + String.format("%.1f",area));
        System.out.println("둘레 : " + String.format("%.1f",round));
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
