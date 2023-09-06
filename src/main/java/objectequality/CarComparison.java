package objectequality;

public class CarComparison {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.setYear(2009);
        c2.setYear(2009);
        c1.setBrand("BMW");
        c2.setBrand("BMW");

        System.out.println(c1 == c2);   // false
        System.out.println(c1.equals(c2)); // true
    }
}
