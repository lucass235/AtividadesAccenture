import java.lang.Exception;

public class ArithmeticExceptionActivity {
	public static void main(String[] args) {
		try {
			catchMe(10, 0);
		} catch (ArithmeticException e) {
			System.err.println("ERRO aritmetico");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			catchMe(10, 2);
			System.out.println("Obrigado por usar nosso programa!");
		}
	}

	static void catchMe(int num1, int num2) {
		int result = num1 / num2;
		System.out.println("O resultado é :" + result);
	}
}
