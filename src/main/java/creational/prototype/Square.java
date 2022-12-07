package creational.prototype;

public class Square implements ShapePrototype {

    private final int width;

    private final int height;

    public Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Square(ShapePrototype shape) {
        this.width = shape.getWidth();
        this.height = shape.getHeight();
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public ShapePrototype clone() {
        return new Square(this);
    }
}
