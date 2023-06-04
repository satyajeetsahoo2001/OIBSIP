import java.util.Random;
import java.util.Scanner;

public class Game {
    int comp;
    int user;
    int time;
    Game(){
        Random random=new Random();
        comp=random.nextInt(100);
    }
    public void takeInput(){
        System.out.println("enter the number");
        Scanner scanner=new Scanner(System.in);
        user=scanner.nextInt();
    }
    public boolean check(){
        time++;
        if (user==comp){
            System.out.println("in "+time+"attempts you have guessed the number");
            return true;
        }
        else if (user<comp){
            System.out.println("small number it is");
        }
        else if (user>comp){
            System.out.println("big number it is");
        }
        return false;
    }
}
