public class GeneralInformation {
public String brand;
public String model;
public int yearOfManufacture;
public String condition;
public int mileage;

    public GeneralInformation(String brand, String model, int yearOfManufacture, String condition, int mileage) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.condition = condition;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "GeneralInformation{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", condition='" + condition + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
