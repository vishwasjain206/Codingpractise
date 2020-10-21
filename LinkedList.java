Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 
@vishwasjain206 
Learn Git and GitHub without any code!
Using the Hello World guide, you’ll start a branch, write comments, and open a pull request.


vishwasjain206
/
Stringquestions
Private
1
00
Code
Issues
Pull requests
Actions
Projects
Security
Insights
Settings
Stringquestions/eclipse-workspace/vishwas/src/vishwas/LinkedList.java /

VISHWASJ Trying
Latest commit 6f25d81 6 days ago
 History
 0 contributors
65 lines (48 sloc)  727 Bytes
  
package vishwas;


public class LinkedList {
Node head;

class Node
{
	int num;
	Node next;
	
	Node(int num1)
	{
		num = num1;
		next = null;
	}
}

LinkedList()
{
	head = null;
}
private void pushdata(int i) {
	
	
	if (head == null)
	{
		head = new Node(i);
		
	}
	else
	{
		Node n1 = head;
		while(n1.next != null)
		{
			n1 = n1.next;
		}
		
		n1.next = new Node(i);
	}
	
}
private void getdata() {
	Node n1 = head;
	while(n1.next != null)
	{
		System.out.println(n1.num);
	}
}

	public static void main(String[] args) {
	
		
		LinkedList l1 = new LinkedList ();
		
		l1.pushdata(5);
		l1.pushdata(6);
		l1.pushdata(6);
		l1.pushdata(8);
		l1.getdata();
}


	
}
