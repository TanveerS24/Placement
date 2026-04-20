class RelativeRank 
{
	static String[] relativeRank(int[] score){
		int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;
		String[] ans=new String[score.length];
		int i;
		for(i=0;i<score.length;i++){
			if(score[i]>first){
				third=second;
				second=first;
				first=score[i];
			}
			else if(score[i]>second){
				third=second;
				second=score[i];			
			}
			else if(score[i]>third){
				third=score[i];
			}
			System.out.println(first+" "+second+" "+third);
		}
		for(i=0;i<score.length;i++){
			if(score[i]==first)
				ans[i]="Gold Medal";
			else if(score[i]==second)
				ans[i]="Silver Medal";
			else if(score[i]==third)
				ans[i]="Bronze Medal";
			else
				ans[i]=score[i]+"";
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		String[] ans=relativeRank(new int[]{10,3,8,9,4});
		for(int i=0;i<ans.length;i++){
			System.out.print(ans[i]+" ");
		}
	}
}
