package practice;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CloneTest implements Cloneable,Serializable{

	public Hand hand;
	
	public CloneTest(Hand hand){
		this.hand = hand;
	}

	@Override
	public Object clone(){
		CloneTest cloneObj = null;  
	            //写入字节流  
	            ByteArrayOutputStream out = new ByteArrayOutputStream();  
	            ObjectOutputStream obs;
				try {
					obs = new ObjectOutputStream(out);
		            obs.writeObject(this);  
		            obs.close();  
		            ByteArrayInputStream ios = new ByteArrayInputStream(out.toByteArray());  
		            ObjectInputStream ois = new ObjectInputStream(ios);  
		            //返回生成的新对象  
		            cloneObj = (CloneTest) ois.readObject();  
		            ois.close();  
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  

	              
	            //分配内存，写入原始对象，生成新对象  

	            return cloneObj;
	}
	public static void main(String[] args) {
		Hand2 h2 = new Hand2();
		Hand h = new Hand(h2);
		CloneTest c = new CloneTest(h);
		CloneTest c2 = (CloneTest) c.clone();
		c2.hand.a = 1;
		c2.hand.h2.a = 1;
		System.out.print(c.hand.h2.a);
	//序列化复制对象时,对象所持有的对象也会被深复制. 即会递归的深复制.
		
	}

}
