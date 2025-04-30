public class ValorNegativoException extends RuntimeException {
    public ValorNegativoException(String mensagem) {
        super(mensagem); // Exceção personalizada (herança de RuntimeException)
    }
}