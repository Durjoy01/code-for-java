package rockpaperscissor;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give(rock,paper or scissor)=");
        String a = sc.nextLine();
        String b="";
        int c=(int)(1+ Math.random()*(3-1+1));
        if(c==1)
        {
          b="rock";
        }
        else if(c==2){
            b="paper";}
        else if (c==3)
        {b="scissor";}
        System.out.println("Computer's move="+b);
        
                if (a.equals("rock")&&b.equals("rock") ||a.equals("scissor")&& b.equals("scissor")|| a.equals("paper")&& b.equals("paper")){
                    System.out.println("Draw");
                } else if (a.equals("rock") && b.equals("paper")) {
                    System.out.println("Computer wins");
                } else if (a.equals("rock") && b.equals("Scissor")) {
                    System.out.println("You win");
                } else if (a.equals("scissor") && b.equals("paper")) {
                    System.out.println("You win");
                } else if (a.equals("scissor") && b.equals("rock")) {
                    System.out.println("Computer wins");
                } else if (a.equals("paper") && b.equals("rock")) {
                    System.out.println("You win");
                } else if (a.equals("paper") && b.equals("scissor")) {
                    System.out.println("Computer win");
                }

    }

}
