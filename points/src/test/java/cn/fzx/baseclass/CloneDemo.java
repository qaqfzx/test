package cn.fzx.baseclass;

public class CloneDemo {

    public static void main(String[] args) throws Exception {
        /*
        protected native Object clone() throws CloneNotSupportedException

            naitive方法，用于创建并返回当前对象的一份拷贝。
            一般情况下，对于任何对象 x，表达式 x.clone() != x 为true，x.clone().getClass() == x.getClass() 为true。
            Object本身没有实现Cloneable接口，所以不重写clone方法并且进行调用的话会发生CloneNotSupportedException异常。

            即   既需要重写clone方法，又需要继承Cloneable接口


            拷贝和引用不同，会在堆上（heap）创建一个新对象

            深拷贝和浅拷贝指的是 Clone方法的实现不同。

            深拷贝时对象中的对象也会拷贝一份，  需对象内部的对象也可以拷贝

         */

        Address address = new Address("北京");
        Address clone = address.clone();
        System.out.println("拷贝结果 ： "+ clone);

        Park park = new Park(address);
        Park qdPark = park.clone();
        System.out.println("浅拷贝内部对象还是一个  park.getAddress() == qdPark.getAddress() = " + (park.getAddress() == qdPark.getAddress()));


        School school = new School(address);
        School schoolClone = school.clone();

        System.out.println("深拷贝内部对象也不是一个了    school.getAddress() == schoolClone.getAddress() = " + (school.getAddress() == schoolClone.getAddress()));

    }
}


class School implements Cloneable {
    private Address address;

    public School(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected School clone() throws CloneNotSupportedException {
        School school = (School)super.clone();
        // Address 类型的对象可以拷贝。
        school.setAddress(school.getAddress().clone());
        return school;
    }

    @Override
    public String toString() {
        return "School{" +
                "address=" + address +
                '}';
    }
}


class Park implements Cloneable {

    private Address address;


    public Park(Address address) {
        this.address = address;
    }

    public Park() {
    }

    @Override
    protected Park clone() throws CloneNotSupportedException {
        return (Park)super.clone();
    }

    @Override
    public String toString() {
        return "Park{" +
                "address=" + address +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}


class Address implements Cloneable {
    private String name;

    public Address(String name) {
        this.name = name;
    }

    public Address() {
    }

    public String getName() {
        return name;
    }

    @Override
    protected Address clone() throws CloneNotSupportedException {
        return (Address)super.clone();
    }


    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                '}';
    }
}
