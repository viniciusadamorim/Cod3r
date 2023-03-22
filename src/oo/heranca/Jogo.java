package oo.heranca;

public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.y = 10;
        monstro.x = 10;

        Heroi heroi = new Heroi();
        heroi.y = 11;
        heroi.x = 10;


        System.out.println("Monstro tem: " + monstro.vida);
        System.out.println("Herói tem: " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        monstro.atacar(monstro);

        System.out.println("Monstro tem: " + monstro.vida);
        System.out.println("Herói tem: " + heroi.vida);




        /* monstro.andar(Direcao.NORTE);
        monstro.andar(Direcao.LESTE);
        monstro.andar(Direcao.SUL);
        monstro.andar(Direcao.OESTE);
        monstro.andar(Direcao.LESTE);

        System.out.println(monstro.y);
        System.out.println(monstro.x);
        */
    }
}
