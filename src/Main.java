import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        ControleFinanceiro controle = new ControleFinanceiro();

        try {
            controle.registrarTransacao(new Receita(2500, "Salário", "Salário Mensal", LocalDate.now()));
            controle.registrarTransacao(new Despesa(300, "Alimentação", "Supermercado", LocalDate.now()));
            controle.registrarTransacao(new Despesa(150, "Transporte", "Uber", LocalDate.now()));

            System.out.println("Saldo atual: R$ " + controle.calcularSaldo());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}