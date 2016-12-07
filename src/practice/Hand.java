package practice;

import java.io.Serializable;

public class Hand implements Cloneable,Serializable{
	
	public int a;

	public Hand2 h2;
	
	public Hand(){
		this.a = 2;
	}
	
	public Hand(Hand2 h2){
		this();
		this.h2 = h2;
	}
	
	@Override
	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
