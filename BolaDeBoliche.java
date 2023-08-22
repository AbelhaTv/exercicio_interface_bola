public class BolaDeBoliche extends Bola{
    public BolaDeBoliche (String nomeDaMarca){
super(nomeDaMarca);
    }
public void lancar(){
   System.out.println("bolas de boliche da marca " + getNomeDaMarca() + "sao boas para lançar ");
}
public void quicar(){
    System.out.println("bolas de boliche nao quicam muito ");
}

}

