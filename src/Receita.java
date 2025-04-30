import java.time.LocalDate;

public class Receita extends Transacao {
    public Receita(double valor, String categoria, String descricao, LocalDate data) {
        super(valor, categoria, descricao, data); // Herança
    }

    @Override
    public double calcularImpacto() {
        return valor; // Receita contribui positivamente
    }
}
