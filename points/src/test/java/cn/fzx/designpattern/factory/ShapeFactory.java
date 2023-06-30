package cn.fzx.designpattern.factory;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if ("circle".equalsIgnoreCase(shapeType)) {
            return new Cirle();
        } else if ("square".equals(shapeType)) {
            return new Square();
        } else if ("rectangle".equals(shapeType)) {
            return new Rectangle();
        } else {
            return null;
        }
    }
}
