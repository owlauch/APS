package aps;

public class Vilao extends Personagem {

    private int tempodeprisao;

    public Vilao(String nome, String nomeVidaReal, int tempo) {
        super(nome, nomeVidaReal);
        setTempodeprisao(tempo);
    }

    public int getTempodeprisao() {
        return tempodeprisao;
    }

    public void setTempodeprisao(int tempodeprisao) {
        this.tempodeprisao = tempodeprisao;
    }


}
