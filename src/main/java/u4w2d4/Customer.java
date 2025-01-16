package u4w2d4;

public class Customer extends AbsClass implements Interfacename {

    private String name;
    private Integer tier;

    // Costruttore
    public Customer(int id, String name, Integer tier) {
        super(id);
        this.name = name;
        this.tier = tier;
    }

    public int getId() {
        return super.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

}
