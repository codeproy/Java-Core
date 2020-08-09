package classeMethods;

class CalcVol {
	
	int a, b, c;
	private int vol;
	
	CalcVol(int i, int j, int k ){
		a = i;
		b = j;
		c = k;
		vol = a * b * c;
	}
	
	CalcVol(CalcVol ob){
		
		a = ob.a;
		b = ob.b;
		c = ob.c;
		vol = ob.vol;
		
	}
	
	boolean SameParam(CalcVol ob){
		if ((ob.a==a) & (ob.b == b) & (ob.c == c)) {
			return true;
		}
		return false;
	}
	
	public int getVol() {
		
		return vol;
	}

	
}

public class PassObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalcVol cv1 = new CalcVol(20,30,40);
		System.out.println(cv1.getVol());
		CalcVol cv2 = new CalcVol(cv1);
		System.out.println(cv1.SameParam(cv2));		

	}

}
