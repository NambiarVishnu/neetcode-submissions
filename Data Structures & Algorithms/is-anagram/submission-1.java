class Solution {
    public boolean isAnagram(String s, String t) {
        char firstWord [] = new char [s.length()];
        firstWord = s.toCharArray();
        Arrays.sort(firstWord);
        char secondWord [] = new char [t.length()];
        secondWord = t.toCharArray();
        Arrays.sort(secondWord);
        if(firstWord.length!=secondWord.length){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(firstWord[i]!=secondWord[i]){
                return false;
            }
        }
        return true;
    }
}
