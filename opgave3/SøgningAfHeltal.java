package opgave3;

public class SøgningAfHeltal {
    public static void main(String[] args) {
        int[] list = {1,2,3,4};
        System.out.println(search(list));
    }
    public static boolean search(int[] list){
        return search(list, 0,list.length -1, 5);
    }

    public static boolean search(int[] list, int left, int right, int target){
        boolean indeks = false;

        if(left <= right){
            int middle = (left + right) / 2;
            int k = list[middle];
            if(k == target){
                indeks = true;
            }else if(k > target){
                right = middle - 1;
                indeks = search(list,left,right,target);
            }else{
                left = middle + 1;
                indeks = search(list,left,right,target);
            }
        }
        return indeks;
    }

}
