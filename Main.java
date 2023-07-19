class Solution {
    public int titleToNumber(String a) {
        int sum=0;
		for(int i=0;i<a.length();i++)
		{
			
			int c=a.charAt(i)-64;
			sum=sum*26+c;
		}
		return sum;
        
    }
}