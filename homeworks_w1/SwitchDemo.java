package homeworks_w1;

public class SwitchDemo {

	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {
		case 'A':
			System.out.println("Mükkemmel, Geçtiniz");
			break;
		case 'B':
			System.out.println("İyi, Geçtiniz");
			break;
		case 'C':
			System.out.println("Orta, Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil, Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef, Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz.");
		}

	}

}
