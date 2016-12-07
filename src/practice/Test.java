package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	static int test(){
		int i=0;
		try{
			
			i++;
			return i;
		}finally{
			//return 5;
			i++;
		}
	}
	
	public  int getNext(int i){
		return i++;
	}
	public static void main(String[] args) {
	/*	String a ="{\"classNm\": \"SmsYIMEIService\",\"userName\":\"6SDK-EMY-6688-JDTMQ\",\"password\":\"2192\"}";
		Pattern p = Pattern.compile("userName\":\"(.*?)\"");
		Matcher m = p.matcher(a);
		if(m.find()){
			System.out.println(m.group(1));
		}else{
			System.out.println(a);
		}*/

/*		String x = new String("aaa");
		String c = x.intern();
		String z = "aaa";
		//System.out.println(x.intern()==x);
		System.out.println(x.intern()==x);
		System.out.println(c==z);
		System.out.println(x==z);
		//System.out.println(str4==x);
		int a = 1;
*/	
/*		String a = new String("1");
		String b = a.intern();
		String c = "1";
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==c);
		
		String str1 = new String("1")+ new String("1");      
		str1.intern();
		String str2 = "11";
		System.out.println(str1.intern() == str1);   
		System.out.println(str1 == "11");  
		System.out.println(str1 == str2);  */
		int a = 0;
		Test.valid(a);
		
		String s = "as";
		Test.valid(s);
	
	}
	public final static void valid(int a) {
		a = 10;
		System.out.println(a);
	}
	public final static void valid(String s) {
		s = "aaaas";
		System.out.println(s);
	}
}
