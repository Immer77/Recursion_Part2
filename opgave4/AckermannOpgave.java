package opgave4;

public class AckermannOpgave {
    public static void main(String[] args) {

    }

    public static int ackermann(int x, int y){
        int result = 0;
        if(x == 0){
            result = y+1;
        }else if(y == 0){
            result = ackermann(x-1,1);
        }else{
            result = ackermann(x-1,ackermann(x,y-1));
        }
        return result;
    }
}

