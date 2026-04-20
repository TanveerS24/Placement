package DataStructure;
import java.util.Stack;
import java.util.Scanner;
class Node
{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
class LinkedPalindrome
{
	Node head=null;
	static void addFirst(int data){
		if(node!=null){
			Node temp=new Node(data);
			temp.next=head;
			head=temp;
		}
		else{
			head=new Node(data);
		}
	}
	static void display(Node head){
		Node temp=head;
		while(head!=null){
			System.out.print(head.data+"->");
		}
		System.out.println("null");
	}
	static int counter(Node head){
		Node temp=head;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	static boolean palindrome(Node head){
		Stack<Integer> stack=new Stack<>();
		int count=counter(head);
		Node temp=head;
		int stack_count=0;
		while(temp!=null){
			if(stack_count<=count/2){stack.push(temp.data); stack_count++;}
			else if(count%2!=0 && stack_count==count/2){stack.pop();}
			else{
				if(temp.data!=stack.peek()){return false;}
				else{stack.pop();}
			}
			temp=temp.next;
		}
		return true;
	}
	public static void main(String... args){
		Scanner sc=new Scanner();
		int n;
		System.out.println("Enter no. of elements:");
		n=sc.nextInt();
		System.out.println("Enter the elements");
		while(n>0){
			int temp=sc.nextInt();
			addFirst(temp);
		}
		display(head);
		System.out.println(palindrome(head)?"Palindrome":"Not a Palindrome");
	}	
}