package master.isi.flyweightexemple;

public abstract class Car {
	String name;
    int speed;
    int horsePower;
    
    //Extrinsic state is stored or computed by client objects, and passed to the Flyweight
    abstract void moveCar(int currentX, int currentY, int newX ,int newY);
}

