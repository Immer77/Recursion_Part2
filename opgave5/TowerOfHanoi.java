package opgave5;

public class TowerOfHanoi {
    public static void main(String[] args) {
        System.out.println(move(3, 1, 3));

    }

    public static int move(int disks, int from, int to) {
        int other = 6 - from - to;
        int result = 0;
        if (disks== 1) {
            result = 1;
            System.out.println("Move from " + from + " to " + to);
        } else {
            result += move(disks- 1, from, other);
            result += move(1, from, to);
            result += move(disks- 1, other, to);
        }
        return result;
    }

    public static int moverings(int n){
        int result = 0;
        if(n == 1){
            result = n;
        }else{
            result = moverings((int) (Math.pow(2,n) - 1)-1);
        }
        return result;
    }
}

