
package bancodevinhouse;

public class OperacaoInvestimento {
    private String tipoInvestimento;
    private double valor;
    private String data;
    private String tipo;

    public OperacaoInvestimento(String tipoInvestimento, String tipo ,double valor, String data) {
        this.tipoInvestimento = tipoInvestimento;
        this.valor = valor;
        this.data = data;
        this.tipo=tipo;
    }

  

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public double getValor() {
        return valor;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
