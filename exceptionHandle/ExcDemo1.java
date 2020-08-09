package exceptionHandle;

public class ExcDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = new int[4];
		
		try {
			
			System.out.println("Before Exception Is Genreated");
			nums[4] = 20;
			
		}
		catch(ArrayIndexOutOfBoundsException excs){
			
			System.out.println("Index of of bounds");
		}
		
		System.out.println("After catch statement");
	}

}
