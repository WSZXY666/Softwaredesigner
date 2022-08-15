package DesignPatterns.ChuangZ.Builder;
//生成器模式

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Director director = new Director();

        Builder builder1 = new Builder1();
        director.Construct(builder1);
        Product product1 = builder1.getResult();
        product1.show();

        Builder builder2 = new Builder2();
        director.Construct(builder2);
        Product product2 = builder2.getResult();
        product2.show();
    }
}

class Director {
    public void Construct(Builder builder) {
        builder.Buildpart();
    }
}

abstract class Builder {
    public abstract void Buildpart();

    public abstract Product getResult();
}

class Builder1 extends Builder {
    Product product = new Product();

    @Override
    public void Buildpart() {
        product.Add("A");
        product.Add("B");
        product.Add("C");
        product.Add("D");
        product.Add("E");
        product.Add("F");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

class Builder2 extends Builder {
    Product product = new Product();

    @Override
    public void Buildpart() {
        product.Add("A");
        product.Add("B");
        product.Add("C");
        product.Add("D");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

class Product {
    List<String> parts = new ArrayList<String>();

    public void Add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.print("产品的组成：" );
        for (String s : parts) {
            System.out.print(s + " ");
        }
        System.out.print("\n");
    }
}
