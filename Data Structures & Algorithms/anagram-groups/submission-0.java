class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> res = new HashMap<String , List<String>>();
        for(String str:strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sortedS = new String(arr);

            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(str);
        }
        return new ArrayList<>(res.values());
    }
}
