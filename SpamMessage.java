class SpamMessage 
{
	static boolean spam(String[] message, String[] bannedWords){
		String ban=String.join(" ",bannedWords);
		int count=0;
		for(int i=0;i<message.length;i++){
			if(ban.contains(message[i]))
				count++;
		}
		System.out.println(count);
		return count>=2;
	}
	public static void main(String[] args) 
	{
		String[] m={"hello","world","leetcode"};
		String []ban={"world","hello"};
		System.out.println(spam(m,ban));
	}
}
