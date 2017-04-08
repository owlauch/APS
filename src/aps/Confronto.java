package aps;

public class Confronto {

    public int confronto(SuperHeroi superHeroi, Vilao vilao) {
        if (superHeroi.getPoderTotal() > vilao.getPoderTotal()) {
            System.out.println("Heroi venceu");
            return 1;
        } else if (superHeroi.getPoderTotal() < vilao.getPoderTotal()) {
            System.out.println("Vilao venceu");
            return 2;
        } else {
            System.out.println("Empate");
            return 0;
        }
    }
}
