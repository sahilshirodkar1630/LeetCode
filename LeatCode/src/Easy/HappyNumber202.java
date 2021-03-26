package Easy;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isHappy(n));
		
	}

	public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        return check(set,n);
	}
    private static boolean check(Set<Integer> set , int n ){
        if(n==1){
            return true;
        }
        else if ( set.contains(n)){
            return false;
        }
        set.add(n);
        n= update(n);
        return check(set,n);
    }
    
	private static int update(int n) {
		int updateN = 0;
        while(n>0){
            int dig = n%10;
            updateN += dig*dig;
            n = n/10;
        }
        return updateN;
	}
	
//	static HashMap<Integer, Boolean> map = new HashMap<Integer,Boolean>();
//	private static boolean isHappy(int n) {
//		// TODO Auto-generated method stub
//		if(map.containsKey(n)) {
//			return false;
//		}
//		map.put(n, true);
//		int addN =0;
//		while(n!=0) {
//			addN += getSquare(n%10);
//			n = n/10;
//		}
//		if(addN == 1) {
//			return true;
//		}
//		
//		return isHappy(addN);
//	}
//	private static int getSquare(int n) {
//		return n*n;
//	}

}
