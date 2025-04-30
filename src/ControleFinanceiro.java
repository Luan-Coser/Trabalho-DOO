import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ControleFinanceiro implements Registravel {
    private List<Transacao> transacoes; // Uso de Collection (ArrayList)

    public ControleFinanceiro() {
        transacoes = new ArrayList<>();
    }

    @Override
    public void registrarTransacao(Transacao t) {
        transacoes.add(t); // Polimorfismo: aceita Receita ou Despesa
    }

    public double calcularSaldo() {
        double saldo = 0;
        for (Transacao t : transacoes) {
            saldo += t.calcularImpacto(); // Polimorfismo em ação (método sobrescrito)
        }
        return saldo;
    }

    public List<Transacao> listarPorCategoria(String categoria) {
        return transacoes.stream()
                .filter(t -> t.categoria.equalsIgnoreCase(categoria))
                .collect(Collectors.toList()); // Filtra por categoria
    }
}
