
package Base;

public class comida {
    
    private String nome;
    private double calorias;
    
    public comida(){
    }
    
    public comida(String nome,double calorias){
        this.nome = nome;
        this.calorias = calorias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
    
}
