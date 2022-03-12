
package Intro;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class isBeautifulString {
    public static void main(String[] args) {
        String str="bbc";
        int n = str.length();
 
        // 'freq[]' implemented as hash table
        int[] freq = new int[26];
 
        // accumulate freqeuncy of each character
        // in 'str'
        for (int i = 0; i < n; i++){
               freq[str.charAt(i) - 'a']++;
        }
 
        // traverse 'str' from left to right
        for (int i = 0; i < n-1; i++) {
            if(freq[i]<freq[i+1]){
                System.out.println(freq[i]+" < "+freq[i+1]);
                break;
            }
            // if frequency of character str.charAt(i)
            // is not equal to 0
//          if (freq[str.charAt(i) - 'a'] != 0)  {
// 
//                // print the character along with its
//                // frequency
//                System.out.print(str.charAt(i));
//                System.out.print(freq[str.charAt(i) - 'a'] + " ");
// 
//                // update frequency of str.charAt(i) to
//                // 0 so that the same character is not
//                // printed again
//                freq[str.charAt(i) - 'a'] = 0;
//            }
        }
        
    }
    
}
