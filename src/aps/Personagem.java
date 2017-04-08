package aps;

public class Personagem {

    private String nome;
    private String nomeVidaReal;
    private Superpoder[] superpoderes = new Superpoder[4];

    public Personagem(String nome, String nomeVidaReal) {
        this.nome = nome;
        this.nomeVidaReal = nomeVidaReal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeVidaReal() {
        return nomeVidaReal;
    }

    public void setNomeVidaReal(String nomeVidaReal) {
        this.nomeVidaReal = nomeVidaReal;
    }

    public Superpoder getSuperpoderes(int i) {
        return superpoderes[i];
    }

    public void adicionaSuperpoder(Superpoder sp) {
        if (superpoderes[0] == null) {
            superpoderes[0] = sp;
        } else if (superpoderes[1] == null) {
            superpoderes[1] = sp;
        } else if (superpoderes[2] == null) {
            superpoderes[2] = sp;
        } else if (superpoderes[3] == null) {
            superpoderes[3] = sp;
        } else {
            System.out.println("muito poderoso para mais poderes");
        }
    }

    public void contarpoderes() {
        double cont = 0;
        if (superpoderes[0] != null) {
            cont = superpoderes[0].getCategoria();
        }
        if (superpoderes[1] != null) {
            cont = cont + superpoderes[1].getCategoria();
        }
        if (superpoderes[2] != null) {
            cont = cont + superpoderes[2].getCategoria();
        }
        if (superpoderes[3] != null) {
            cont = cont + superpoderes[3].getCategoria();
        }
        System.out.println("Seu poder é mais de:" + cont);
    }
    public double getPoderTotal() {
        int contador = 0;
        int soma = 0;
        for (int i = 0; i < 4; i++) {
            if (this.superpoderes[i] != null) {
                contador = contador + 1;
                soma += this.superpoderes[i].getCategoria();
            }
        }
        return soma;

    }

}
