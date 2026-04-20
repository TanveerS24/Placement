class Node
{
	char data;
	Node next;
	Node(char data){
		this.data=data;
	}
}
class RemoveDuplicates
{
	static Node head=null;
	static void addFirst(char data){
		if(head!=null){
			Node temp=new Node(data);
			temp.next=head;
			head=temp;
		}
		else{
			head=new Node(data);
		}
	}
	static void display(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	static void removeDuplicates(){
		Node temp=head;
		Node prev=null;
		int arr[]=new int[26];
		while(temp!=null){
			int ind=temp.data-'a';
			arr[ind]++;
			if(arr[ind]>1){
				prev.next=temp.next;
				temp=temp.next;
				continue;
			}
			prev=temp;
			temp=temp.next;
		}
	}
	static void firstDuplicate(){
		int arr[]=new int[26];
		Node temp=head;
		while(temp!=null){
			int ind=temp.data-'a';
			if(++arr[ind]>=2){
				System.out.println((char)('a'+ind));
				return;
			}
			temp=temp.next;
		}
		System.out.println("-1");
	}
	static int count=1;
	static char kLastElement(int k,Node temp){
		
		int t;
		if(temp.next!=null){
			count++;
			t=kLastElement(k,temp.next);
		}
		System.out.println(count);
		return temp.data;
	}
	static void kLastElement(int k){
		Node temp=head;
		while(k>0){
			temp=temp.next;
			k--;
		}
		Node temp2=head;
		while(temp!=null){
			temp=temp.next;
			temp2=temp2.next;
		}
		System.out.println(temp2.data);
	}
	public static void main(String... args){
		addFirst('a');
		addFirst('b');
		addFirst('c');
		addFirst('d');
		addFirst('e');
		addFirst('f');
		addFirst('g');
		addFirst('h');
		addFirst('i');
		addFirst('j');
		display();
		//firstDuplicate();
		//removeDuplicates();
		display();
		kLastElement(3,head);
	}
}