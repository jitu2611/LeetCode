// 2938. Separate Black and White Balls
class Solution {

    private long occurence(String s, char ch) {
        long count = 0;
        for(int i=0; i<s.length();i++) {
            if(s.charAt(i) == ch) {
                count ++;
            }
        }
        return count;
    }

    public long minimumSteps(String s) {
        long numBalls = s.length();
        long numBlackBalls = occurence(s, '1');
        long numBlueBalls = numBalls - numBlackBalls;
        long swaps = 0;
        long blackBallExpectedIndex = numBlueBalls;
        for(int i=0;i<s.length();i++) {
           
            if(s.charAt(i)=='1' && i <= blackBallExpectedIndex) {
                swaps = swaps + blackBallExpectedIndex - i;
                blackBallExpectedIndex += 1 ;
            }
        }

        return swaps;

    }
}
