package objectequality;

public class Car {
    private String brand;
    private int year;

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Car car = (Car) obj;
        if (!this.brand.equals(car.brand) || this.year != car.year) {
            return false;
        }
        return true;
    }
}
