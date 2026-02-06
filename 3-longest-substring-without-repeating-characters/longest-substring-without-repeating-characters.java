class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left =0;
        int maxLen=0;

        int[] lastSeen = new int[128];
        Arrays.fill(lastSeen, -1);

        for(int right = 0 ; right < n ; right++){
            char c = s.charAt(right);

            if(lastSeen[c] >= left){
                left = lastSeen[c] + 1;
            }

            lastSeen[c] = right;
            maxLen = Math.max(maxLen, right - left +1);
        }
        return maxLen;
    }
}