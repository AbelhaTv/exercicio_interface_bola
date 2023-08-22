public class BolaDeFutebol extends Bola{
    public BolaDeFutebol (String nomeDaMarca){
super(nomeDaMarca);
    }
public void lancar(){
   System.out.println("bolas de futebol da marca " + getNomeDaMarca() + "sao rapidas");
}
public void quicar(){
    System.out.println("bolas de futebol quicam muito");
}

}
