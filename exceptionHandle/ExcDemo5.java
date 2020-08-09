package exceptionHandle;

public class ExcDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {4,8,16,32,64,128,78};
		int denom[] = {2,0,4,4,0,8};
		
			try {
				for (int i=0;i < nums.length;i++) {
					
						System.out.println("Num is " + nums[i] + " denom  is" + denom[i]
								+ " div is " + nums[i/denom[i]]);
					}
	
			}
			catch(ArithmeticException exc) {
				System.out.println("Cant divide by zero");
				
			}
			catch(Throwable exc) {
				System.out.println("Exception Occured");
			}
			System.out.println("Finishing the program");
			
		}

}
