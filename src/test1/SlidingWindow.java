package test1;

import java.util.HashMap;
import java.util.Map;
//Sliding Window Template
public class SlidingWindow {

	public SlidingWindow() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Value ::"+longestSubString("abcabbacbc"));

	}
	
	public static int longestSubString(String s)
	{
		if(s.length()<2)
		{
			return s.length();
		}
		Map<Character,Integer> maps = new HashMap<>();
		int R=0;
		int L=0;
		int maxLength=0;
		while(R<s.length())
		{
			char ch=s.charAt(R);
			if(maps.containsKey(ch))
			{
				maxLength=Math.max(maxLength, R-L); //calculate maxLength between Right and Left Pointer
				L=Math.max(L, maps.get(ch)+1); //Put the Left pointer in the Last occurrence of the array
			}
			maps.put(ch, R++);
		}
		return Math.max(maxLength, R-L);
	}
}
