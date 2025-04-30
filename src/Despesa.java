import java.time.LocalDate;

public class Despesa extends Transacao{
    public Despesa(double valor, String categoria, String descricao, LocalDate data) {
        super(valor, categoria, descricao, data);
    }

    @Override
    public double calcularImpacto() {
        return 0;
    }
}
