package homeworks_w2;

public class Methods1 {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9 };
		int aranacak = 7;
		boolean isTrue = false;
		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				isTrue = true;
				break;
			}

		}
		if (isTrue) {
			mesajVer("Sayı mevcut: " + aranacak);

		} else
			mesajVer("Sayı yok: " + aranacak);
	}

	public static void mesajVer(String message) {
		System.out.println(message);
	}
}
