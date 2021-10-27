import java.lang.Exception;

public class TryCatchFinallyActivity {
	public static void main(String[] args) {
		TryCatchFinallyActivity obj = new TryCatchFinallyActivity();
		try {
			obj.catchMeIfYouCan();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posicao do array fora do limite");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Obrigado!");
		}
	}

	void catchMeIfYouCan() {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i <= 10; i++) {
			System.out.println(arr[i]);
		}
	}
}
