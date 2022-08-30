package opgave2;

public class PalindromeCalculations {
    public static void main(String[] args) {
        System.out.println(palindrom("ABBA"));
    }
    public static boolean palindrom(String tekst){
        return palindrom(tekst,0,tekst.length() - 1);
    }
    public static boolean palindrom(String tekst, int start, int slut){
        if(start >= slut){
            return true;
        }else{
            char firstChar = Character.toLowerCase(tekst.charAt(start));
            char lastChar = Character.toLowerCase(tekst.charAt(slut));

            if(Character.isLetter(firstChar) && Character.isLetter(lastChar)){
                if(firstChar == lastChar){
                    return palindrom(tekst,start + 1, slut - 1);
                }else{
                    return false;
                }
            }else if(!Character.isLetter(firstChar)){
                return palindrom(tekst, start + 1, slut);
            }else{
                return palindrom(tekst,start,slut-1);
            }
        }

    }
}
