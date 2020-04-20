class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(String str : strs){
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String anagram = String.valueOf(array);
            if ( !map.containsKey(anagram) )
                map.put(anagram, new ArrayList<String>());
            map.get(anagram).add(str);
        }
        return new ArrayList(map.values());
    }
}