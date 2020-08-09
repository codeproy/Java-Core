package classeMethods;
class FailSoftArray{
	
	private int a[];
	private int errval;
	public int length;
	
	public FailSoftArray(int size, int errv){
		a = new int[size];
		errval = errv;	
		length = size;
	}
	
	public int get(int index) {
		
		if (indexOk(index)) return a[index];
		
		return errval ;
		
	}
	
	public boolean put(int index, int val) {
		if (indexOk(index)) {
			a[index] = val;
			return true;
		}
		
		return false;
	}
	
	private boolean indexOk(int index) {
		
		if (index >= 0 & index < length) return true;
		return false;
	}
	
	
	
	
	
}
public class FSDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x ;
		FailSoftArray fs1 = new FailSoftArray(10,-1);
		for(int i =0 ; i < fs1.length; i++) {
			fs1.put(i, i * 10);
		}
		
		for(int i =0 ; i < 2 * fs1.length; i++) {
			x = fs1.get(i);
			
			if (x != -1) System.out.println("Element at index " + i + " is " + x);
		
				else System.out.println("Out of bound at index " + i);
		}
		
		
		System.out.println("Program Completed");

	}

}
