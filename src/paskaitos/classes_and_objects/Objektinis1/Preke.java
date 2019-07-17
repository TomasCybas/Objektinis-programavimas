package paskaitos.classes_and_objects.Objektinis1;

public class Preke {
    public String name;
    private Double price;
    public Double weight;

    public Preke(){

    }

    public Preke (String name, Double price){
        this.name = name;
        this.price = price;
    }
    public Preke (String name, Double price, Double weight){
        this(name, price);
        this.weight = weight;
    }

    public Double price(Double amount){
        return amount * this.price;
    }
    private Double priceVat(){
        return this.price * 1.21;
    }
    public Double priceVat(Double amount){
        return amount * this.priceVat();

    }

    public String toString(){
        return this.name + ", " + this.price + "€, " + this.weight;
    }

    public void setPrice(Double price) {
        if(price > 0){
            this.price = price;
        }
    }

    public double getPrice() {
        return this.price;
    }
}
