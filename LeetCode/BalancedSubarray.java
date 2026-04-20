import java.util.HashMap
class BalancedSubarray 
{
	public static int longestBalanced(int[] nums) {
        HashMap <Integer,Integer> firstIndex = new HashMap<>();
		HashMap <Integer,Integer> even = new HashMap<>();
		HashMap <Integer,Integer> odd = new HashMap<>();

		int distinctEven = 0;
		int distinctOdd = 0;
		int diff = 0;
		int maxlen = 0;

		firstIndex.put(0,-1);

		for (int i=0; i<nums.length; i++)
		{
			int x = nums[i];
			
			if (x%2 == 0)
			{
				even.put(x, even.getOrDefault(x,0)+1);
				if(even.get(x) == 0 ) distinctEven++;
			} 
			else {
				odd.put(x, odd.getOrDefault(x,0)+1);
				if(odd.get(x) == 0) distinctOdd++;
			}

			diff = distinctEven - distinctOdd;

			if(firstIndex.containsKey(diff)){
				maxlen = Math.max(maxlen, i - firstIndex.get(diff));
			}
			else {
				firstIndex.put(diff, i);
			}
			return maxlen;
		}

		
    }
	public static void main(String[] args) 
	{
		System.out.println(longestBalanced(new int[]{2,5,4,3}));
	}
}
