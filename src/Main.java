import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1, "с065mk78");
        Car car2 = new Car(2, "g454ky78");
        Car car3 = new Car(3, "t534iu78");
        Car car4 = new Car(4, "u876hg78");
        Car car5 = new Car(5, "k345cn78");
        CarData carData1 = new CarData("Red", 5200000, "Tesla", 2021);
        CarData carData2 = new CarData("Blue", 600000, "Kia", 2017);
        CarData carData3 = new CarData("White", 2800000, "Kia", 2022);
        CarData carData4 = new CarData("Black", 7100000, "BMW", 2018);
        CarData carData5 = new CarData("BloodRed", 999999999, "Moskvich", 2023);
        HashMap<Car, CarData> carMap = new HashMap<>();
        carMap.put(car1, carData1);
        carMap.put(car2, carData2);
        carMap.put(car3, carData3);
        carMap.put(car4, carData4);
        carMap.put(car5, carData5);
        for (Map.Entry<Car, CarData> c : carMap.entrySet()) {
            System.out.println("Key: " + c.getKey() + " " + "Value: " + c.getValue());
        }
    }
}