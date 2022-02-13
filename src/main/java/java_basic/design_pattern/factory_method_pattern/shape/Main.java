package java_basic.design_pattern.factory_method_pattern.shape;

public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.createInstance("Circle");
        circle.draw();

        Shape rectangle = shapeFactory.createInstance("Rectangle");
        rectangle.draw();

        Shape square = shapeFactory.createInstance("Square");
        square.draw();
    }
}
