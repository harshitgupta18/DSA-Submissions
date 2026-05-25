class Solution {
    public int appendCharacters(String s, String t) {
        int pts  = 0;
        int ptt = 0;
        while(pts < s.length() && ptt < t.length()){
            if(s.charAt(pts) == t.charAt(ptt)){
                pts++;
                ptt++;
            }
            else{
                pts++;
            }
        }
        return t.length() - ptt;
    }
}