import java.util.Scanner;
public class kullanıcıdan_alma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Dizi kaç elemanlı olsun ?");
		int diziUzunluk = scanner.nextInt();
		
		
		scanner.nextLine();
		//int den sonra string girerken oluşan bug u çözümler
		//enter ı da girdi olarak algıladıgı için onu boşa çıkartıyoruz
		
		
		String[] isimler = new String[diziUzunluk];
		for(int i=0;i<isimler.length;i++) {
			System.out.println("Dizinin "+(i)+". index değerini giriniz :");
			isimler[i] = scanner.nextLine();
		}
		
		System.out.println("------------------------------------------");
		System.out.println("Dizinin elemanları :");
		for(int a=0; a<isimler.length;a++) {
			
			System.out.print(isimler[a]+",");
		}

	}

}
