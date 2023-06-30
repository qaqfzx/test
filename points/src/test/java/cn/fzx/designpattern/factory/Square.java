package cn.fzx.designpattern.factory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("正方形 square :: draw() method");
    }
}
