package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class PerfectString {

	public static void main(String[] args) {
		int[] arr = new int[26] ;
		int res = 0;
		for(int i=0;i<26;i++){
			arr[i]=0;
		}
      //  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 16);
       // BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out), 1 << 16);
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
        String n = in.nextLine();
		String str = n.toLowerCase();
		char[] chars = str.toCharArray();
		for(int i=0;i<chars.length;i++){
			arr[chars[i]-'a']++;
		}
		Arrays.sort(arr);
		for(int i=arr.length-1,j=26;i>=0;i--){
			res += arr[i]*j;
			j--;
		}
		out.println(res);
		out.flush();
		//System.out.println(res);
	}

}
