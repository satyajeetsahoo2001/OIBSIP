public class Main {
    public static void main(String[] args) {
Game game=new Game();
boolean b=false;
        while (!b){
            game.takeInput();
           b= game.check();
        }

    }
}