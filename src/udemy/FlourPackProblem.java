package udemy;

public class FlourPackProblem {

    public static void main(String[] args) {
        boolean b1=canPack(4,2,20);
        System.out.println(b1);
    }


    public static boolean canPack(int bigCount,int smallCount,int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        for(int i=0;i<=bigCount;i++) {
            for (int j = 0; j <= smallCount; j++)
                if (i * 5 + j == goal)
                    return true;
        }
        return false;
    }
}
