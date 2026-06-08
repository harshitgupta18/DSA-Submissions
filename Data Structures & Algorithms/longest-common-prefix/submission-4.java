class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        int l = s.length();
        for(int i = 1 ; i < strs.length ; i++){
            if(strs[i].length() == 0){
                return "";
            }
            if(l > strs[i].length()){
                l = strs[i].length();
            }
            int j = 0;
            while(j < l && j< strs[i].length()){
                if(s.charAt(j) != strs[i].charAt(j) ){
                    l = j;
                    if(j == 0){
                        return "";
                    }
                    break;
                }
                j++;
            }
        }
        return s.substring(0,l);
    }
}