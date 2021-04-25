public class Examinee {
    private int orderNumber;
    private String name;
    private String address;
    private String areasOfPriority;
    public Examinee(){}

    public Examinee(int orderNumber, String name, String address, String areasOfPriority) {
        this.orderNumber = orderNumber;
        this.name = name;
        this.address = address;
        this.areasOfPriority = areasOfPriority;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAreasOfPriority() {
        return areasOfPriority;
    }

    public void setAreasOfPriority(String areasOfPriority) {
        this.areasOfPriority = areasOfPriority;
    }

    @Override
    public String toString() {
        return "Examinee{" +
                "orderNumber: " + orderNumber +
                ", name: '" + name + '\'' +
                ", address: '" + address + '\'' +
                ", areasOfPriority: '" + areasOfPriority + '\'' +
                '}';
    }
}
