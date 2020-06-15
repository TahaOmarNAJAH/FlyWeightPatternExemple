package master.isi.flyweightexemple;

public class BMW extends Car {
    public static int num;
    public BMW(){
        num++;
    }
	@Override
	void moveCar(int currentX, int currentY, int newX, int newY) {
		// TODO Auto-generated method stub
		 System.out.println("New location of "+this.name+" is X"+newX + " - Y"+newY);
	}

}


