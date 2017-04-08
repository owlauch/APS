package aps;


public class SuperHeroi extends Personagem {

    public SuperHeroi(String nome, String nomeVidaReal) {
        super(nome, nomeVidaReal);
    }

    @Override
    public double getPoderTotal() {
        return super.getPoderTotal()*1.1; //To change body of generated methods, choose Tools | Templates.
    }
    


}
