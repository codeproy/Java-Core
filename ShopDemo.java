class Shop{
	
	double Sales = 0.0;
	int Volume = 0 ;
			
	Shop(double s ,int v ){
		
		Sales = s;
		Volume = v;
	}
	
	Shop(){
		
	}
	
	boolean isSalesDoubleVolume(Shop s){
		
		if (s.Sales == 2 * s.Volume) return true;
		
		return false;
		
	}
	
	void calc_Volume() {
		Volume += 10;
	}
	
	void calc_Volume(int f) {
		
		Volume += f;
	}
		
}

public class ShopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shop s1 = new Shop();
		Shop s2 = new Shop(20,10);
		System.out.println(s1.isSalesDoubleVolume(s2));
		s2.calc_Volume();
		System.out.println(s2.Volume);
		s2.calc_Volume(50);
		System.out.println(s2.Volume);
		

	}

}
