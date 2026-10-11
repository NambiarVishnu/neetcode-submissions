class Solution {
    public boolean isPalindrome(String s) {
        // List<Character> word=new ArrayList<>();

        // for(int i=0;i<s.length();i++){
        //     char letter=s.charAt(i);
        //     if(Character.isLetterOrDigit(letter)){
        //         word.add(Character.toLowerCase(letter));
        //     }
        // }

        int k=s.length()-1;
        int j=0;
        while(j<k){
            if (!Character.isLetterOrDigit(s.charAt(j))){
                j++;
                continue;
            }if (!Character.isLetterOrDigit(s.charAt(k))){
                k--;
                continue;
            }

            if(Character.toLowerCase(s.charAt(j))!=Character.toLowerCase(s.charAt(k))){
                return false;
            }else{
            j++;
            k--;
            }

      
        }
        return true;     
    }
}
