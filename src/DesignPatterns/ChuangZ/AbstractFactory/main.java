package DesignPatterns.ChuangZ.AbstractFactory;
//抽象工厂模式

public class main {
    public static void main(String[] args) {
        Factory factory1 = new Factory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();
        productA1.info();
        productB1.info();

        Factory factory2 = new Factory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();
        productA2.info();
        productB2.info();
    }
}

interface Factory {
    ProductA createProductA();
    ProductB createProductB();
}

class Factory1 implements Factory {

    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
}

class Factory2 implements Factory {

    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB2 createProductB() {
        return new ProductB2();
    }
}

interface ProductA {
    void info();
}

class ProductA1 implements ProductA {

    @Override
    public void info() {
        System.out.println("产品的信息：A1");
    }
}

class ProductA2 implements ProductA {

    @Override
    public void info() {
        System.out.println("产品的信息：A2");
    }
}

interface ProductB {
    void info();
}

class ProductB1 implements ProductB {

    @Override
    public void info() {
        System.out.println("产品的信息：B1");
    }
}

class ProductB2 implements ProductB {

    @Override
    public void info() {
        System.out.println("产品的信息：B2");
    }
}

