public class TotalStrings {
    public static int countStrings(int n){
        int count = 0;
     for (int i = 0; i < Math.pow(3, n); i++) {
         String s = Integer.toString(i, 3);
         s = s.replace('0', 'a').replace('1', 'b').replace('2', 'c');
         int bCount = 0, cCount = 0;
         for (int j = 0; j < s.length(); j++) {
             if (s.charAt(j) == 'b') {
                 bCount++;
             } else if (s.charAt(j) == 'c') {
                 cCount++;
             }
         }
         if (bCount <= 1 && cCount <= 2) {
             count++;
         }
     }
     return count;
 }
}
