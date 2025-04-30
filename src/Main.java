import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        ControleFinanceiro controle = new ControleFinanceiro(); // Instancia o controle

        try {
            // Registra uma receita e duas despesas usando polimorfismo
            controle.registrarTransacao(new Receita(2500, "Salário", "Salário Mensal", LocalDate.now()));
            controle.registrarTransacao(new Despesa(300, "Alimentação", "Supermercado", LocalDate.now()));
            controle.registrarTransacao(new Despesa(150, "Transporte", "Uber", LocalDate.now()));

            // Calcula e exibe o saldo atual
            System.out.println("Saldo atual: R$ " + controle.calcularSaldo());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage()); // Tratamento de exceções
        }
    }
}