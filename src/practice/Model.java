package practice;

public class Model {
    public int cardID;
    public String carName;
    public String brand;
    public float price;

    public Model(int cardID, String carName, String brand, float price) {
        this.cardID = cardID;
        this.carName = carName;
        this.brand = brand;
        this.price = price;
    }

    public Model() {

    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
