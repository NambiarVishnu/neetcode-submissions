class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mapAnagram = new HashMap();

        for(int i=0;i<strs.length;i++){
            String word =strs[i];
            char[] sortedWord = word.toCharArray();
            Arrays.sort(sortedWord);
            String key = new String(sortedWord);
            if(!mapAnagram.containsKey(key)){
                mapAnagram.put(key,new ArrayList<>());
            }
            mapAnagram.get(key).add(word);
        }

        List<List<String>> result =  new ArrayList();

        for(Map.Entry<String,List<String>> entry:mapAnagram.entrySet()){
            result.add(entry.getValue());
        }

        return result;
    }
}
