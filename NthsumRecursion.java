package binarySeach;

public class NthsumRecursion {
     public static int sumN(int n) {
    	if(n==1) return 1;
    	return n+sumN(n-1);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=10;i<16;i++) {
        	System.out.println(sumN(i));
        }
	}

}
