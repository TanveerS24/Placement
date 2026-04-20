class DoubleLinkedList{
	int data;
	DoubleLinkedList prev;
	DoubleLinkedList next;
	DoubleLinkedList(int data){
		this.data=data;
	}
}
class DoublyList
{
	static DoubleLinkedList head=null;
	static void insertFirst(int data){
		if(head!=null){
			DoubleLinkedList temp=new DoubleLinkedList(data);
			temp.prev=null;
			temp.next=head;
			head.prev=temp;
			head=temp;
		}
		else{
			head=new DoubleLinkedList(data);
			head.prev=null;
			head.next=null;
		}
	}
	static void display(){
		DoubleLinkedList temp=head;
		System.out.print("NULL -> ");
		while(temp!=null){
			System.out.print(temp.data+" <-> ");
			temp=temp.next;
		}
		System.out.println("NULL");
	}
	static void reverse(){
		DoubleLinkedList temp=head;
		DoubleLinkedList t1=null;
		while(temp!=null){
			t1=temp;
			temp=temp.next;
			t1.next=t1.prev;
			t1.prev=temp;
		}
		head=t1;
	}
	static DoubleLinkedList reverse(DoubleLinkedList h){
		DoubleLinkedList temp=h;
		DoubleLinkedList t1=null;
		while(temp!=null){
			t1=temp;
			temp=temp.next;
			t1.next=t1.prev;
			t1.prev=temp;
		}
		return t1;
	}
	static void reverseK(int k){
		int count=1;
		DoubleLinkedList temp=head;
		DoubleLinkedList l1=temp;
		DoubleLinkedList l2=temp;
		DoubleLinkedList l3=temp;
		while(temp!=null){
			if(count==k){
				l2=temp;
				temp=temp.next;
				l2.next=null;
				l3=l1.prev;
				if(l3==null){
					temp.prev=null;
					head=reverse(l1);
					l1.next=temp;
					temp.prev=l1;
				}
				else if(temp==null){
					l3.next=null;
					l1.prev=null;
					l2=reverse(l1);
					l2.prev=l3;
					l3.next=l2;
				}
				else{
					l3.next=null;
					l1.prev=null;
					temp.prev=null;
					l2=reverse(l1);
					l2.prev=l3;
					l3.next=l2;
					temp.prev=l1;
					l1.next=temp;
				}
				l1=temp;
				count=1;
			}
			else{
				temp=temp.next;
				count++;
			}
		}
		if(count!=1){
			l3=l1.prev;
			l3.next=null;
			l1.prev=null;
			l2=reverse(l1);
			l3.next=l2;
			l2.prev=l3;
		}
	}
	public static void main(String... args){
		//insertFirst(150);
		insertFirst(140);
		insertFirst(130);
		insertFirst(120);
		insertFirst(110);
		insertFirst(100);
		insertFirst(90);
		insertFirst(80);
		insertFirst(70);
		insertFirst(60);
		insertFirst(50);
		insertFirst(40);
		insertFirst(30);
		insertFirst(20);
		insertFirst(10);
		display();
		//reverseDisplay();
		//reverse();
		//display();
		reverseK(5);
		display();
	}
}