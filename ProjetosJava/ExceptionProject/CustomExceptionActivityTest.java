public class CustomExceptionActivityTest {

	public static void main(String[] args) {
		try {
			validateUser("John");
			validateUser("Sergio");
		} catch (CustomExceptionActivity e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Obrigado por usar nosso programa");
		}
	}

	static void validateUser(String nome) throws CustomExceptionActivity {
		// array of names
		String[] validUsers = { "John", "Mike", "Shanti", "Stacie" };
		// flag stores 1 if a match is found else it should remain 0
		int flag = 0;
		for (int i = 0; i < 4; i++) {
			if (validUsers[i].equals(nome)) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			throw new CustomExceptionActivity();
		} else {
			System.out.println("Bem vindo ao  programa Payroll");
		}
	}
}
