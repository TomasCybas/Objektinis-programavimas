package namudarbas12.uzduotis;

import java.util.Arrays;

public class Dish {

    public String name;
    public Product [] products;


    public class Product {
        public String name;
        public int fats;
        public int proteins;
        public int carbs;
        public int amount;

        public Product(String name, int fats, int proteins, int carbs, int amount) {
            this.name = name;
            this.fats = fats;
            this.proteins = proteins;
            this.carbs = carbs;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return
                    name +  ", " + fats + ", " +  proteins+ ", " + carbs + ", " + amount;
        }
    }

    public Dish(String name) {
        super();
        this.name = name;
        this.products = new Product [0];
    }
    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }
    public void addProduct(String name, int fats, int proteins, int carbs, int amount){
        Product product = new Product(name, fats, proteins, carbs, amount);
        this.products = Arrays.copyOf(products, this.products.length + 1);
        this.products[this.products.length - 1] = product;
    }
}
