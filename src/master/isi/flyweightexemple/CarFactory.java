package master.isi.flyweightexemple;

import java.util.HashMap;
import java.util.Map;
public class CarFactory {
    private static Map<String, Car> carsList  = new HashMap<>();
    public static Car getCar(String key) {
    	
    	if(carsList.containsKey(key)){
            return carsList.get(key);
        }
        Car car;
         
        switch (key)
        {
            case "Chevrolet":
            	car = new Chevrolet();
            	car.name="Chevrolet";
            	car.speed=220;
            	car.horsePower=1000;
                break;
            case "BMW":
            	car = new BMW();
            	car.name="BMW";
            	car.speed=240;
            	car.horsePower=1200;
                break;
            default:
                throw new IllegalArgumentException("Unsupported car type.");
        }
        carsList.put(key, car);
        return car;
    } 
}



