
package aps;

public class Jogo {

    public static void main(String[] args) {
        
        SuperHeroi superHeroi = new SuperHeroi("zé do alho","samir bartoso");
        Vilao vilao = new Vilao("lex luthor", "lexluthor", 100);
        
        Superpoder poder1 = new Superpoder("Velocidade",5);
        Superpoder poder2 = new Superpoder("Superforça",5);
        
        superHeroi.adicionaSuperpoder(poder2);
        vilao.adicionaSuperpoder(poder2);
        
        Confronto confronto = new Confronto();
        confronto.confronto(superHeroi, vilao);
        
    }
    
}
