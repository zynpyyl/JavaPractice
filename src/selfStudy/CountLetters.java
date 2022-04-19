package selfStudy;
import java.util.*;

class CountLetters {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            char [] game = new char[9];
            for(int i=0; i < game.length; i++) {
                game[i] = in.next().charAt(0);
            }

            System.out.println(won(game));
        }



        public static String won(char[] x){



            String result="Player O won";

            for(int i=0;i<x.length-3;i+=3){

                if((x[i]=='X'&&x[i+1]=='X'&&x[i+2]=='X')||(x[i]=='X'&&x[i+3]=='X'&&x[i+6]=='X')||(x[0]=='X'&&x[4]=='X'&&x[8]=='X')||(x[2]=='X'&&x[4]=='X'&&x[6]=='X')){
                    result="Player X won";
                    break;
                }
            }
            return result;

        }}