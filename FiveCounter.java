class Node
{
	int val;
	Node next;
	public Node(int val){ 
		this.val=val; 
	}
	public Node(){}
}
class FiveCounter 
{
	static Node head=null;
	public static void insert(int x){
		if(head==null){
			head=new Node(x);
			head.next=null;
		}
		else{
			Node n=head;
			while(n.next!=null){
				n=n.next;
			}
			n.next=new Node(x);
			n=n.next;
			n.next=null;
		}
	}
	public static void fiveCounter(Node n){
		int count=0;
		Node temp=n;
		while(temp!=null){
			if(temp.val==5 || temp.val%10==5){
				Node five=new Node(++count);
				five.next=temp.next;
				temp.next=five;
				temp=temp.next;
			}
			temp=temp.next;
		}
	}
	public static void printer(Node n){
		while(n!=null){
			System.out.print(n.val+"->");
			n=n.next;
		}
		System.out.println("NULL");
	}
	public static void main(String[] args) 
	{
		
		Node cur=head;
		for(int i=5;i<=20;i+=5){
			insert(i);
		}		
		printer(head);
		fiveCounter(head);
		printer(head);
	}
}
