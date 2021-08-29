public class ConsecutiveCharacters_1446 {
    class Solution {
        public int maxPower(String s) {
            char prev = s.charAt(0);
            int count = 1;
            int maxLength =1;
            for(int curr=1; curr<s.length(); curr++){
                char cc = s.charAt(curr);
                if(cc==prev){
                    count++;
                }else{
                    prev=cc;
                    count=1;
                }
                maxLength = Math.max(maxLength, count);
            }
            return maxLength;

        }
    }
}
