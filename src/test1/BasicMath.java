package test1;

public class BasicMath {

	public BasicMath() {
		// TODO Auto-generated constructor stub
	}
	
	 public static int reverse(int x) {
	        int temp=x;
	        int digitCount=(int)Math.log10(x)+1;
	        int revNum=0;
	        while(temp!=0)
	        {
	            int rem=temp%10;
	            int div=temp/10;
	            if(rem>0&&digitCount>=0)
	            {
	            revNum+=rem*Math.pow(10,--digitCount);
	            }
	            temp=div;
	        }
	        return revNum;
	    }
	 
	 public static boolean isPalindrome(int x) {
	        if(x<0)
	        {
	            return false;
	        }
	        //2147483647 || 2147483647
	        int digitCount=(int)Math.log10(x)+1;
	        int temp=x;
	        long revNum=0;
	        while(temp!=0)
	        {
	            int rem=temp%10;
	            temp/=10;
	            revNum+=rem*Math.pow(10,--digitCount);
	        }
	        return x==revNum?true:false;   
	    }

	public static void main(String[] args) {
		boolean g= isPalindrome(2147483647);
		int p =reverse(123);
		System.out.println(5%10+" :: "+10%5);

	}

}
