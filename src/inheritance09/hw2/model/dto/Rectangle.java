package inheritance09.hw2.model.dto;

public class Rectangle extends Point{
    private int width;
    private int height;

    public Rectangle(){};

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        super.draw();
        double round = 2 * (this.width + this.height);
        double area = this.width * this.height;
        System.out.println("면적 : " + String.format("%.1f",area));
        System.out.println("둘레 : " + String.format("%.1f",round));
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
