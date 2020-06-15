package master.isi.flyweightexemple;

public class CarClient {
	private Car car;
    public CarClient(String name) {
        /*Ask factory for a Car*/
        car = CarFactory.getCar(name);
    }
     /**
     * The extrinsic state of the flyweight is maintained by the client
     */
    private int currentX = 0;
    private int currentY=0;
    
    public void moveCar(int newX, int newY){
    /*Car movement is handled by the flyweight object*/
    	car.moveCar(currentX,
                currentY, newX, newY);
        currentX = newX;
        currentY = newY;
    
    }
    
}




