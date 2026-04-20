class BitFlips 
{
	static int bitFlips(int start,int goal){
		int xor=start^goal;
        int count=0;
        while (xor!=0){
            count+=xor&1; 
            xor>>=1;
        }
		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello world");
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toBinaryString(7));
		System.out.println(bitFlips(10,7));
		BitFlips bf=new BitFlips();
	}
}
