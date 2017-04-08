
package aps;

public class Superpoder {
  	private String nome ; 
	private double categoria;

    public Superpoder(String nome, double categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }
     
    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected double getCategoria() {
        return categoria;
    }

    protected void setCategoria(int categoria) {
        this.categoria = categoria;
    }
        
    protected void Superpoder(String nome, int categoria){
        this.categoria=categoria;
        this.nome=nome;        
    }

}
