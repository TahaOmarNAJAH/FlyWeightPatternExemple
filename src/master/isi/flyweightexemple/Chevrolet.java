package master.isi.flyweightexemple;

public class Chevrolet extends Car{
    public static int num;
    public Chevrolet() {
        num++;
    }
    
	@Override
	void moveCar(int currentX, int currentY, int newX, int newY) {
		// TODO Auto-generated method stub
		 System.out.println("New location of "+this.name+" is X"+newX + " - Y"+newY);
	}


}


