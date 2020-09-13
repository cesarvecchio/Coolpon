package br.com.coolpon.coolpon;

public class Product {
    private Integer id;
    private String cod;
    private String name;
    private Double price;

    public Product(Integer id, String cod, String name, Double price) {
        this.id = id;
        this.cod = cod;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public Product(String cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", cod='" + cod + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
}
