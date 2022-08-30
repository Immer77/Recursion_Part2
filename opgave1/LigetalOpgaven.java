package opgave1;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;

public class LigetalOpgaven {
    public static void main(String[] args) {
        ArrayList<Integer> tal = new ArrayList<>(Arrays.asList(3,4,5,6,1,32,2,4));

        System.out.println(ligetal(tal));
    }

    public static int ligetal(ArrayList<Integer> list){
        return ligetal(list,0 );
    }
    private static int ligetal(ArrayList<Integer> list, int n){
        int counter = 0;
        if (n == list.size()){
            return counter;
        }else if(list.get(n) % 2  == 0){
            counter = 1 + ligetal(list, n + 1);
        } else{
            System.out.println("Ulige");
            counter = ligetal(list,n + 1);
        }

        return counter;
    }
}
