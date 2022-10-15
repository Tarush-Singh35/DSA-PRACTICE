package test1;

import java.util.ArrayList;
import java.util.List;

public class CommonCharacter {

	public CommonCharacter() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<String> commonChars(String[] A) {
        int[] last = count(A[0]);
        for (int i = 1; i < A.length; i++) {
            last = intersection(last, count(A[i]));
        }
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (last[i] != 0) {
                char a = 'a';
                a += i;
                String s = String.valueOf(a);
                while (last[i] > 0) {
                    arr.add(s);
                    last[i]--;
                }
            }
        }
        return arr;
    }

    int[] intersection(int[] a, int[] b) {
        int[] t = new int[26];
        for (int i = 0; i < 26; i++) {
            t[i] = Math.min(a[i], b[i]);
        }
        return t;
    }

    int[] count(String str) {
        int[] t = new int[26];
        for (char c : str.toCharArray()) t[c - 'a']++;
        return t;
    }
    
    static final int MAX_CHAR = 26;
    
    static void printCommon(String s1, String s2)
    {
       // two arrays of length 26 to store occurrence
        // of a letters alphabetically for each string
        int[] a1 = new int[MAX_CHAR];
        int[] a2 = new int[MAX_CHAR];
 
        int length1 = s1.length();
        int length2 = s2.length();
 
        for (int i = 0 ; i < length1 ; i++)
           a1[s1.charAt(i) - 'a'] += 1;
 
        for (int i = 0 ; i < length2 ; i++)
           a2[s2.charAt(i) - 'a'] += 1;
 
        // If a common index is non-zero, it means
        // that the letter corresponding to that
        // index is common to both strings
        for (int i = 0 ; i < MAX_CHAR ; i++)
        {
            if (a1[i] != 0 && a2[i] != 0)
            {
                // Find the minimum of the occurrence
                // of the character in both strings and print
                // the letter that many number of times
                for (int j = 0 ; j < Math.min(a1[i], a2[i]) ; j++)
                    System.out.print(((char)(i + 'a')));
            }
        }
    }

}
