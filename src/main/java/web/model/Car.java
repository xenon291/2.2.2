package web.model;

import java.util.Objects;

public class Car {

    private String marka;
    private String model;
    private int year;


    public Car(String marka, String model, int year) {
        this.marka = marka;
        this.model = model;
        this.year = year;
    }
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(marka, car.marka) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, model, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
