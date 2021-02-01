import java.util.Scanner;

public class Solution {
    static void count(int[] arr, String s){
        for(char i : s.toCharArray()){
            char c = Character.toLowerCase(i);
            arr[c-'a']++;
        }
    }
    static boolean isAnagram(String a, String b) {
        // Complete the function 
        int[] arr1 = new int[26];
        count(arr1,a);
        int[] arr2 = new int[26];
        count(arr2,b);
        for(int i =0; i<26; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
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
