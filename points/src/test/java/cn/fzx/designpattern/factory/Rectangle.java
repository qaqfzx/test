package cn.fzx.designpattern.factory;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("长方形 rectangle :: draw() method");
    }
}
