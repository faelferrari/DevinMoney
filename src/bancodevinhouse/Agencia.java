
package bancodevinhouse;
public enum Agencia {
   A_001("FLORIANOPOLIS"),A_002("S.JOSE");
    
    private String tipoAgencia;
    
    Agencia(String tipoAgencia){
    this.tipoAgencia = tipoAgencia;
    }
    
    public String getAgencia(){
    return this.tipoAgencia;
    }
    
    
}
