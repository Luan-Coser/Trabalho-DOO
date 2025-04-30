import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Transacao {
    protected double valor;
    protected String categoria;
    protected String descricao;
    protected LocalDate data;

    public Transacao(double valor, String categoria, String descricao, LocalDate data) {
        this.valor = valor;
        this.categoria = categoria;
        this.descricao = descricao;
        this.data = data;
    }

    public abstract double calcularImpacto(); // Classe abstrata com método abstrato
}

