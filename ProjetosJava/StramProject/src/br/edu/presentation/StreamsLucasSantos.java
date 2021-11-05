package br.edu.presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import br.edu.entities.Account;
import br.edu.entities.AccountEnum;
import br.edu.entities.Address;
import br.edu.entities.Client;
import br.edu.service.BankService;
import br.edu.service.ServiceFactory;

/**
 * OBSERVAÇÕES: NÃO é permitido o uso de nenhuma estrutura de repetição (for,
 * while, do-while). Tente, ao máximo, evitar o uso das estruturas if, else if,
 * else e switch-case
 * 
 */
public class StreamsLucasSantos {

	private static BankService service = ServiceFactory.getService();

	private static List<Client> clientes = new ArrayList<>();
	private static List<Address> enderecos = new ArrayList<>();
	private static List<Account> contas = new ArrayList<>();
	private static List<String> estado = new ArrayList<>();
	private static List<String> emails = new ArrayList<>();
	private static List<Integer> numeroContaPais = new ArrayList<>();
	private static List<Account> contasJoin = new ArrayList<>();

	public static void main(String[] args) {
		// main com os clientes, enderecos e contas.
		Address endereco1 = new Address("Rua Larousse", 76, "Apt. 1301", "PE", "Brazil");
		Address endereco2 = new Address("Rua cinco", 58, "Barraca do leandro", "PE", "Brazil");
		Address endereco3 = new Address("Rua assombrada", 66, "Perto do semiterio", "NY", "United States");
		Address endereco4 = new Address("Rua 2", 77, "ali perto", "NY", "United States");
		enderecos.add(endereco1);
		enderecos.add(endereco2);
		enderecos.add(endereco3);
		enderecos.add(endereco4);

		Client cliente1 = new Client("Ze Neto", "zenetogatao@accenture.com", endereco1);
		Client cliente2 = new Client("Lucas Santos", "lucass235@accenture.com", endereco2);
		Client cliente3 = new Client("Marcos Felipe", "marcoslutador@accenture.com", endereco3);
		Client cliente4 = new Client("Kay", "kayfarinhalactar@accenture.com", endereco4);
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);

		Account conta1 = new Account(011, 001, 100.0, cliente1, AccountEnum.CHECKING);
		Account conta2 = new Account(011, 002, 100.0, cliente2, AccountEnum.CHECKING);
		Account conta3 = new Account(022, 003, 200.0, cliente3, AccountEnum.SAVING);
		Account conta4 = new Account(022, 004, 200.0, cliente4, AccountEnum.JOINT);
		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);
		contas.add(conta4);

		// * 1. Imprima na tela o nome e e-mail de todos os clientes (sem repetição),
		// * usando o seguinte formato: Ze Mane - ze@mail.br
		imprimirNomesClientes();

		System.out.println();

		// * 2. Imprima na tela o nome do cliente e a média do saldo de suas contas, ex:
		// * Ze Mane - 352
		imprimirMediaSaldos();

		System.out.println();

		// * 3. Considerando que só existem os países "Brazil" e "United States",
		// imprima
		// * na tela qual deles possui o cliente mais rico, ou seja, com o maior saldo
		// * somando todas as suas contas.
		if (imprimirPaisClienteMaisRico() == 1) {
			System.out.println("Brasil possui cliente mais rico");
		} else {
			System.out.println("Estados Unidos possui clientes mais ricos!");
		}

		System.out.println("====================================");

		// * 4. Imprime na tela o saldo médio das contas da agência
		imprimirSaldoMedio(conta2.getAgency());

		System.out.println("====================================");

		/**
		 * 5. Imprime na tela o nome de todos os clientes que possuem conta poupança
		 * (tipo SAVING)
		 */
		imprimirClientesComPoupanca();

		System.out.println("====================================");

		// * 6.
		// * @return Retorna uma lista de Strings com o "estado" de todos os clientes da
		// * agência
		estado = getEstadoClientes(011);
		System.out.println(estado);

		System.out.println("====================================");

		// * 7.
		// * @param country
		// * @return Retorna uma lista de inteiros com os números das contas daquele
		// país
		numeroContaPais = getNumerosContas("United States");
		System.out.println("Numero de contas dos Estados Unidos " + numeroContaPais);

		System.out.println("====================================");

		// * 8. Retorna o somatório dos saldos das contas do cliente em questão
		// * @param clientEmail
		// * @return
		System.out.println(getMaiorSaldo(cliente2.getEmail()));

		System.out.println("====================================");

		// * 9. Realiza uma operação de saque na conta de acordo com os parâmetros
		// * recebidos
		// * @param agency
		// * @param number
		// * @param value
		sacar(011, 002, 50.0);
		System.out.println("Saque realizado");

		System.out.println("====================================");

		// * 10. Realiza um deposito para todos os clientes do país em questão
		// * @param country
		// * @param value
		depositar("United States", 20.0);
		System.out.println("Valor depositado na conta do pais US");

		System.out.println("====================================");

		// * 11. Realiza uma transferência entre duas contas de uma agência.
		// * @param agency - agência das duas contas
		// * @param numberSource - conta a ser debitado o dinheiro
		// * @param numberTarget - conta a ser creditado o dinheiro
		// * @param value - valor da transferência
		transferir(001, 002, 002, 50.0);
		System.out.println("Valor trasferido");

		System.out.println("====================================");

		// * 12.
		// * @param clients
		// * @return Retorna uma lista com todas as contas conjuntas (JOINT) dos
		// clientes
		// */ // List<Client> clients
		contasJoin = getContasConjuntas();
		System.out.println("Contas com join: " + contasJoin);

		System.out.println("====================================");

		// * 13.
		// * @param state
		// * @return Retorna uma lista com o somatório dos saldos de todas as contas do
		// * estado
		double saldoEstados = getSomaContasEstado("PE");
		System.out.println("Saldos do estado PE:" + saldoEstados);

		System.out.println("====================================");

		// * 14.
		// * @return Retorna um array com os e-mails de todos os clientes que possuem
		// * contas conjuntas
		emails = getEmailsClientesContasConjuntas();
		System.out.println("Emails contas conjuntas: " + emails);

		System.out.println("====================================");

		// * 15.
		// * @param number
		// * @return Retorna se o número é primo ou não
		int num = 5;
		boolean ePrimo = isPrimo(num);
		System.out.println("O numero " + num + " e primo? --> " + ePrimo);

		System.out.println("====================================");

		// * 16.
		// * @param number
		// * @return Retorna o fatorial do número
		System.out.println("O fatorial de " + num + " e:" + getFatorial(num));

	}

	public static void imprimirNomesClientes() {
		clientes.stream()
				.map(cliente -> cliente.getName() + " - " + cliente.getEmail()).distinct()
				.forEach(System.out::println);
	}

	public static void imprimirMediaSaldos() {
		clientes.stream()
				.forEach(cliente -> {
			double media = contas.stream().filter(conta -> conta.getClient().getName().equals(cliente.getName()))
				.mapToDouble(conta -> conta.getBalance()).average().getAsDouble();

			System.out.println(cliente.getName() + " - " + media);
		});
	}

	public static int imprimirPaisClienteMaisRico() {
		double sumClientBrazil = contas.stream()
				.filter(conta -> conta.getClient().getAddress().getCountry().equals("Brazil"))
				.mapToDouble(conta -> conta.getBalance()).sum();
		// Complete o código aqui
		double sumClienteUSA = contas.stream()
				.filter(conta -> conta.getClient().getAddress().getCountry().equals("United States"))
				.mapToDouble(conta -> conta.getBalance()).sum();

		return Double.compare(sumClientBrazil, sumClienteUSA);
	}

	public static void imprimirSaldoMedio(int agency) {
		double average = contas.stream().filter(conta -> conta.getAgency() == agency)
				.mapToDouble(conta -> conta.getBalance()).average().getAsDouble();
		System.out.println(average);
	}

	public static void imprimirClientesComPoupanca() {
		contas.stream().filter(conta -> conta.getType().equals(AccountEnum.SAVING))
				.map(conta -> conta.getClient().getName()).distinct().forEach(System.out::println);

	}

	public static List<String> getEstadoClientes(int agency) {
		List<String> stateOfAllClients = contas.stream().filter(conta -> conta.getAgency() == agency)
				.map(conta -> conta.getClient().getAddress().getState()).collect(Collectors.toList());
		return (List<String>) stateOfAllClients;
	}

	public static List<Integer> getNumerosContas(String country) {
		// Complete o código aqui
		List<Integer> countryNumbers = contas.stream()
				.filter(conta -> conta.getClient().getAddress().getCountry() == country).map(conta -> conta.getNumber())
				.collect(Collectors.toList());

		return countryNumbers;
	}

	public static double getMaiorSaldo(String clientEmail) {
		double sumBalance = contas.stream().filter(conta -> conta.getClient().getEmail().equals(clientEmail))
				.mapToDouble(conta -> conta.getBalance()).sum();
		return sumBalance;
	}

	public static void sacar(int agency, int number, double value) {
		contas.stream().filter(conta -> conta.getAgency() == agency && conta.getNumber() == number)
				.mapToDouble(conta -> {
					double operacao = conta.getBalance() - value;
					conta.setBalance(operacao);
					return operacao;
				}).sum();
	}

	public static void depositar(String country, double value) {
		contas.stream().filter(conta -> conta.getClient().getAddress().getCountry().equals(country))
				.mapToDouble(conta -> {
					double deposito = conta.getBalance() + value;
					conta.setBalance(deposito);
					return deposito;
				}).sum();
	}

	public static void transferir(int agency, int numberSource, int numberTarget, double value) {
		contas.stream().filter(conta -> conta.getAgency() == agency && conta.getNumber() == numberSource)
				.mapToDouble(conta -> {
					double transferencia = conta.getBalance() - value;
					conta.setBalance(transferencia);
					return transferencia;
				}).sum();

		contas.stream().filter(conta -> conta.getAgency() == agency && conta.getNumber() == numberTarget)
				.mapToDouble(conta -> {
					double valorRecebido = conta.getBalance() + value;
					conta.setBalance(valorRecebido);
					return valorRecebido;
				}).sum();

	}

	public static List<Account> getContasConjuntas() {
		List<Account> jointAccounts = new ArrayList<Account>();
		// Complete o código aqui
		jointAccounts = contas.stream().filter(conta -> conta.getType().equals(AccountEnum.JOINT)).map(conta -> conta)
				.collect(Collectors.toList());

		return jointAccounts;
	}

	public static double getSomaContasEstado(String state) {
		double sumAccountState = contas.stream()
				.filter(conta -> conta.getClient().getAddress().getState().equals(state))
				.mapToDouble(conta -> conta.getBalance()).sum();
		return sumAccountState;
	}

	public static List<String> getEmailsClientesContasConjuntas() {
		List<String> emailsAllClientsJoinAccounts = contas.stream()
				.filter(conta -> conta.getType().equals(AccountEnum.JOINT)).map(conta -> conta.getClient().getEmail())
				.collect(Collectors.toList());

		return emailsAllClientsJoinAccounts;
	}

	public static boolean isPrimo(int number) {
		return IntStream.rangeClosed(2, (number / 2)).noneMatch(i -> number % i == 0);
	}

	public static int getFatorial(int number) {
		int factorial = IntStream.rangeClosed(1, number).reduce(1, (x, y) -> x * y);
		return factorial;
	}
}
