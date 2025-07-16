import java.time.LocalDateTime;

public class Transacao {
    public enum Tipo { DEPOSITO, SAQUE, TRANSFERENCIA }

    private Tipo tipo;
    private double valor;
    private LocalDateTime dataHora;
    private String descricao;

    public Transacao(Tipo tipo, double valor, String descricao) {
        this.tipo = tipo;
        this.valor = valor;
        this.dataHora = LocalDateTime.now();
        this.descricao = descricao;
    }

    public void imprimir() {
        System.out.println(dataHora + " - " + tipo + ": R$ " + valor + " (" + descricao + ")");
    }
}
