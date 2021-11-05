import java.util.ArrayList;
import java.util.List;

public class MainFuncionario {
    public static void main(String[] args) {
        List<Funcionario> arrayFuncionario = new ArrayList<>();
        Funcionario funcionario1 = new Funcionario("Luiz", "Silva");
        funcionario1.setHorasTrabalhadas(10);
        funcionario1.setValorPorHora(25.50);

        funcionario1.nomeCompleto();
        funcionario1.calcularSalario();
        funcionario1.incrementaHoras(8);
        funcionario1.calcularSalario();
        
        Funcionario funcionario2 = new Funcionario("Lucas", "Santos");
        Funcionario funcionario3 = new Funcionario("Livia", "Santos");
        Funcionario funcionario4 = new Funcionario("Davi", "Santos");
        Funcionario funcionario5 = new Funcionario("Ze", "Neto");
        Funcionario funcionario6 = new Funcionario("Marcos", "Felipe");
        Funcionario funcionario7 = new Funcionario("Wesley", "Sherman");
        Funcionario funcionario8 = new Funcionario("Rhaylene", "Almeida");
        Funcionario funcionario9 = new Funcionario("Jose", "Carlos");
        Funcionario funcionario10 = new Funcionario("Fernando", "Miguel");

        arrayFuncionario.add(funcionario2);
        arrayFuncionario.add(funcionario3);
        arrayFuncionario.add(funcionario4);
        arrayFuncionario.add(funcionario5);
        arrayFuncionario.add(funcionario6);
        arrayFuncionario.add(funcionario7);
        arrayFuncionario.add(funcionario8);
        arrayFuncionario.add(funcionario9);
        arrayFuncionario.add(funcionario10);

       
    
    }
}