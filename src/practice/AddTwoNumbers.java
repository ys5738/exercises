package practice;

import java.util.Map;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode res = new ListNode(0);
        ListNode fir = new ListNode(0);
        int c=0;
        int i = 0;
        while((l1 != null || l2 != null )){
        	if(l1 == null){
        		l1 = new ListNode(0);
        	}
        	if(l2 == null){
        		l2 = new ListNode(0);
        	}
        	res.val = l1.val + l2.val + c;
            if(i==0){
                fir = res;
            }
            i++;
            if(res.val>=10){
                c = res.val / 10;
                res.val %= 10;
            }else{
                c = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
            res.next = new ListNode(0);
            res = res.next;
        }
        ListNode node = fir; 
        if(c!=0){
            while(node != null){
            	if(node.next ==null ){
            		node.val = c;
            		break;
            	}
            	node = node.next;
            }        	
        }
        node = fir;
        while(node.next != null){
        	if(node.next.next == null&&node.next.val==0){
        		node.next=null;
        		break;
        	}
        	node = node.next;
        }
        return fir;
    }
    public static ListNode generateList(int[]arr){
		ListNode fir = new ListNode(arr[0]);
		ListNode node = fir;
		for(int i=1;i<arr.length;i++){
			ListNode next = new ListNode(arr[i]);
			node.next = next;
			node = node.next;
		}
    	return fir;
    }
    public static void printList(ListNode node){
    	while(node != null){
    		System.out.println(node.val);
    		node = node.next;
    	}
    }
	public static void main(String[] args) {
		ListNode n = AddTwoNumbers.generateList(new int[]{5});
		ListNode m = AddTwoNumbers.generateList(new int[]{5});
	//	AddTwoNumbers.printList(m);
		AddTwoNumbers.printList(AddTwoNumbers.addTwoNumbers(n,m));
	}

}
