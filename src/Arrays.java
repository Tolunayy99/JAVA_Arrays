import java.util.Iterator;

public class Arrays {

	public static void main(String[] args) {
		
		String[] isimDizisi = {"Tolu","Cemo","Apo","Yusuf","Batu"};
		for(int i=0;i<isimDizisi.length;i++) {
			System.out.println(isimDizisi[i]);
		}
		
		System.out.println("------------------------------------");
		
		int[] numbers = {1,2,3,4,5,6};
		for(int j=0; j<numbers.length;j++) {
			System.out.println(numbers[j]);
		}
		
		System.out.println("------------------------------------");
		
		char[] character = {'A','B','C','D','E'};
		for(int k=0;k<character.length;k++) {
			System.out.println(character[k]);
		}
		
		System.out.println("------------------------------------");
	
		double[] doubleArray = {12.3,17.4,33.9,41.8,57.6};
		for(int a=0;a<doubleArray.length;a++) {
			System.out.println(doubleArray[a]);
		}

	}

}
