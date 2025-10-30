package aula_76.entities;


public class Product {
    private String name;
    private double price;
    private int quantity;

    //construtor padrão (opcional se não tiver outro construtor)
    public Product() {

    }

    //construtor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //sobrecarga
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        quantity = 0; //opcional
    }

    public String getName(){
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return this.name
                + ", $ "
                + String.format("%.2f", this.price)
                + ", " + this.quantity
                + " units, Total: $ "
                + String.format("%.2f", this.totalValueInStock());
    }
}

