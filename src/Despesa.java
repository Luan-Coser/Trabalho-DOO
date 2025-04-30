import java.time.LocalDate;

public class Despesa extends Transacao {
    public Despesa(double valor, String categoria, String descricao, LocalDate data) {
        super(valor, categoria, descricao, data); // Herança
    }

    @Override
    public double calcularImpacto() {
        return -valor; // Corrigido: Despesa deve subtrair valor do saldo
    }
}
