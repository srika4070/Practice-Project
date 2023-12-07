package camera_Rental_Application;

public class Camera {


private int id;
private String brand;
private String model;
private double pricePerDay;
private boolean available;
//Constructor 
public Camera(int id, String brand, String model, double pricePerDay, boolean available) {
    this.id = id;
    this.brand = brand;
    this.model = model;
    this.pricePerDay = pricePerDay;
    this.available = available;
}
//Getters to get the ID, Brand names, and Price for different cases
public int getId() {
    return id;
}

public String getBrand() {
    return brand;
}

public String getModel() {
    return model;
}

public double getPricePerDay() {
    return pricePerDay;
}

public boolean isAvailable() {
    return available;
}
// To set availability as available = true, or rented = false
public void setAvailable(boolean available) {
    this.available = available;
}
}