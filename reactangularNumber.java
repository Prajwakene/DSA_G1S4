public class reactangularNumber {
    public static void print(int n) {
	   
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print(n - Math.min(i,j) + 1);                
            }
            for(int j = n-1; j>=1; j--){
                System.out.print(n - Math.min(i,j) + 1);                
            }
            System.out.println();
        }
        
        for(int i = n-1; i>=1; i--){
            for(int j = 1; j<=n; j++){
                System.out.print(n - Math.min(i,j) + 1);                
            }
            for(int j = n-1; j>=1; j--){
                System.out.print(n - Math.min(i,j) + 1);                
            }
            System.out.println();
        }        
	}
}
