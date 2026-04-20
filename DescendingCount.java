import java.util.Scanner;
class DescendingCount 
{
	static void descendingCount(String s){
		String unique="";
		for(int i=0;i<s.length();i++){
			if(!unique.contains(s.charAt(i)+""))
				unique+=s.charAt(i);
		}
		int[] freq=new int[unique.length()];
		int max;
		for(int i=0;i<s.length();i++){
			freq[unique.indexOf(s.charAt(i))]++;
		}
		for(int i=0;i<unique.length();i++){
			max=i;
			for(int j=0;j<freq.length;j++){
				if(freq[max]<freq[j])
					max=j;
				else if(freq[max]==freq[j] &&max!=j){
					max=unique.indexOf(unique.charAt(max))<unique.indexOf(unique.charAt(j))?max:j;
				}
			}
			System.out.println(unique.charAt(max)+" "+freq[max]);
			freq[max]=0;
		}
	}
	/*static void descendingCount(String s){
		String unique="";
		int[] freq=new int[26];
		int pos,i,j;
		char c_temp;
		int temp1,temp2,temp3;
		for(i=0;i<s.length();i++){
			pos=s.charAt(i)-97;
			freq[pos]++;
			if(!unique.contains(s.charAt(i)+""))
				unique+=s.charAt(i);
		}
		char[] letter=unique.toCharArray();
		for(i=0;i<freq.length-1;i++){
			//System.out.println(letter[i]);
			for(j=i+1;j<freq.length;j++){
				if(freq[j]>freq[i]){
					if(freq[i]!=0 && freq[j]!=0){
						temp1=unique.indexOf((char)97+i);
						temp2=unique.indexOf((char)97+j);
						c_temp=letter[temp1];
						letter[temp1]=letter[temp2];
						letter[temp2]=c_temp;
					}
					temp1=freq[i];
					freq[i]=freq[j];
					freq[j]=temp1;
				}
			}
		}
		i=0;
		while(i<letter.length && freq[i]!=0){
			System.out.println(letter[i]+":"+freq[i]);
			i++;
		}
	}*/
	public static void main(String[] args) 
	{
		Scanner sn=new Scanner(System.in);
		String s=sn.nextLine();
		descendingCount(s);
	}
}
