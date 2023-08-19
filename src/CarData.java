public class CarData {
    private String color;
    private int price;
    private String model;
    private int yearOfIssue;

    public CarData(String color, int price, String model, int yearOfIssue) {
        this.color = color;
        this.price = price;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "CarData{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
