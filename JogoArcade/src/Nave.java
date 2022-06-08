public class Nave extends JogoArcade{
    private double velocidade;
    private int vida;

    public Nave(int x, int y, char direcao, double velocidade){
        super (x, y, direcao);
        this.velocidade =velocidade; //para o atributo receber da classe filha (inicializa
    }
    public void irA(int x, int y, char direcao){
        if(this.direcao != direcao)
            this.girar(direcao);

    }
    public void girar(char direcao){

    }
    public void restaVida(int valor){
        this.valor -= valor;
        if(this.vida <= 0)
            System.out.println("Game over");
    }
}
