package u4w2d4;

public class Product extends AbsClass implements Interfacename {
    private String name;
    private String category;
    private Double price;

    // Costruttore
    public Product(int id, String name, String category, Double price) {
        super(id);
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getter e Setter
    public int getId() {
        return super.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
