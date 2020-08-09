package Interfaces;

public class AustralianSig implements CommonSignal, ContinentSignal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AustralianSig a1 = new AustralianSig();
		a1.green();
		a1.snake();
		a1.train();
		
		CommonSignal c1 = new AustralianSig();
		c1.red();

	}
	
	public void snake() {
		System.out.println("Snake");
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("Green");
		
	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("Red");
		
	}

	@Override
	public void yellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow");
		
	}

	@Override
	public void train() {
		// TODO Auto-generated method stub
		System.out.println("train");
		
	}

	@Override
	public int sum() {
		// TODO Auto-generated method stub
		return 0;
	}

}
