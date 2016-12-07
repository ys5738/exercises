package practice;

import java.math.BigInteger;

public class Substitute {
	public int getValue(String str1,String str2){
		float res=0;
		int m = 1;
		int n=0;
		for(int i=0;i<str2.length();i++){
			for(int j=0;j<str1.length();j++){
				if(str2.charAt(i)==str1.charAt(j)){
					if(j==str1.length()-1){
						if(res!=0){
							m++;
						}
					}else{
						n= j+1;
						res += n/Math.pow(10,m++);
					}
				}
			}
		}
		res *= Math.pow(10,m-1);
		int res2= (int)res;
		return res2;
	}
	public static void main(String []args){
		System.out.println(new Substitute().getValue("QASWXZVBHG","QASWXZVBHG"));
		int i = 1234567890;
		System.out.println(i);
	}

}
