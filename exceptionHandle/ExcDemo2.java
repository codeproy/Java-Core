package exceptionHandle;
class ExcTest {

	static void genExc() {
		// TODO Auto-generated method stub
		
		int nums[] = new int[4];
		
		try {
			
			System.out.println("Before Exception Is Genreated");
			nums[10] = 20;
			
		}
		catch(ArrayIndexOutOfBoundsException excs){
			
			System.out.println("Index of of bounds in method");
		}
		
		System.out.println("After method catch statement");
	}

}

class ExcTest1 {

	static void genExc() {
		// TODO Auto-generated method stub
		
		int nums[] = new int[4];
		
		
			
			System.out.println("Before Exception Is Genreated");
			nums[10] = 20;
			System.out.println("After method statement");
	}

}

public class ExcDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			ExcTest.genExc();
			
			System.out.println("------");
			
			ExcTest1.genExc();
			
			
		}
		
		catch(ArrayIndexOutOfBoundsException exc)
		{
			System.out.println("Index of of bounds in class");
		}
		
		System.out.println("After catch statement");

	}

}
