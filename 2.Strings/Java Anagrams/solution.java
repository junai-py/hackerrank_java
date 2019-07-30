import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        char [] ch1 = a.toLowerCase().toCharArray();
        char [] ch2 = b.toLowerCase().toCharArray();
        ch1=sort(ch1);
        ch2=sort(ch2);
        int count=0,i=0;
        if(ch1.length==ch2.length)
        {
            while( i<=ch1.length-1 && (ch1[i]==ch2[i]))
            {
                count++;
                i++;
            }
            if(count==ch1.length)
                return true;
            else
                return false;

        }
        else
            return false;
        
    }
    public static char [] sort(char [] arr)
        {
            for (int i = 0; i < arr.length-1; i++) 
                for (int j = 0; j < arr.length-i-1; j++) 
                    if (arr[j] > arr[j+1]) 
                    { 
                    // swap arr[j+1] and arr[i] 
                    char temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                    }         
            return arr;
        }
    

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
