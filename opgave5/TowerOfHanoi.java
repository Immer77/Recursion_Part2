package opgave5;

public class TowerOfHanoi {
    public static void main(String[] args) {
        System.out.println(moverings(5));
    }

    public static void move(int disks, int from, int to) {
        int other = 6 - from - to;
        if (disks== 1) {
            System.out.println("Move from " + from + " to " + to);
        } else {
            move(disks- 1, from, other);
            System.out.println("Move from " + from + " to " + to);
            move(disks- 1, other, to);
        }
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

