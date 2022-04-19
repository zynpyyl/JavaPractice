package udemy;

public class Lesson49 {


    public static void main(String[] args) {
        int position=calculateHighScorePosition(50);
        displayHighScorePosition("Zeynep",position);

    }

    public static void displayHighScorePosition(String name,int position){
        System.out.println(name+" managed to get into position "+ position+" on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        int result=(score>=1000)? 1 : (score>=500)? 2 : (score>=100)? 3 : 4;
        return result;
    }


}
