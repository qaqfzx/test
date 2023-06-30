package cn.fzx.reflect;

import java.util.Objects;

/**
 * 美女类
 */
public class Belle {

    private int age;

    private double height;

    private double weight;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Belle{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belle belle = (Belle) o;
        return age == belle.age &&
                Double.compare(belle.height, height) == 0 &&
                Double.compare(belle.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, height, weight);
    }
}
