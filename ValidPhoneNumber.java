class ValidPhoneNumber 
{
	static boolean phoneNumber(String s){
		if(s.length()<10)//there should be atleast 10 numbers
			return false;
		boolean flag=true;
		int counter=0;
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(s.charAt(i)))
				counter++;
			else if(s.charAt(i)=='('){
				if(counter==0 && flag) //used flag to check double '(' at the beginning
					flag=false;
				else
					break;
			}
			else if(s.charAt(i)==')'){
				if(counter==3 && !flag)// used !flag to ensure the first character is '(' and to avoid double ')'
					flag=true;
				else
					break;
			}
			else if(s.charAt(i)=='-'){
				if(!((counter==3 || counter==6) && flag))//'-' should be present after either 3 digits or 6 digits and not in between "()"
					break;
				else if(s.charAt(i+1)=='-')// to avoid continous '-'
					break;
			}
			else
				return false;// if any invalid character return false 
		}
		return (counter==10)&&(flag);
	}
	public static void main(String[] args) 
	{
		System.out.println(phoneNumber("123-456-7890")?"Valid":"Invalid");
	}
}