package bancodevinhouse;


public class Operacao {

    private String tipo;
    private double valor;
    private String data;
    private int contaAtual;
    private int contaDestino;
    

    public Operacao() {
    }

    public Operacao(String tipo, double valor, String dataAtual, int atual, int destino) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = dataAtual;
        this.contaAtual = atual;
        this.contaDestino = destino;
    }

    public Operacao(String tipo, double valor, String dataAtual) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = dataAtual;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getContaAtual() {
        return contaAtual;
    }

    public void setContaAtual(int contaAtual) {
        this.contaAtual = contaAtual;
    }

    public int getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(int contaDestino) {
        this.contaDestino = contaDestino;
    }

    
}
