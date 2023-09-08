public class specialSumOfArray {
    public static int sum(int arr[])
	{
        int sum=0;
        int n=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=9)
            {
                sum=sum+arr[i];
            }
        }
        
			 while(sum > 0 || n > 9) 
    { 
        if(sum == 0) 
        { 
            sum = n; 
            n = 0; 
        } 
        n =n+ sum % 10; 
        sum =sum/ 10; 
    } 
    return n;            
	}
}
