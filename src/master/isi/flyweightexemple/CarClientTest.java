package master.isi.flyweightexemple;

import java.util.Random;

public class CarClientTest {
	 //CarFactory carFactory = new CarFactory();
	public static void main(String[] args) {
		Random r = new Random();
		for(int x = 1; x < 5; x = x + 1) {
	         
			CarClient car1 = new CarClient("Chevrolet"); 
			car1.moveCar(r.nextInt(200), r.nextInt(2000));
	          
	       }
	        
	       for(int x = 1; x < 5; x = x + 1) {
	    	   CarClient car2 = new CarClient("BMW"); 
	    	   car2.moveCar(r.nextInt(200), r.nextInt(200));
	          
	       }
	       
	       /*Output and observe the number of instances created*/
	       System.out.println("BMW Car Instances: " + BMW.num);
	       System.out.println("Chevrolet Car Instances: " + Chevrolet.num);
		
	}
}




