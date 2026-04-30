class Solution {
    public char[] bubblesort(char[] word){
        for(int i=0; i<word.length-1; i++){
            for(int j=0; j<word.length-i-1; j++){
                if(word[j]<word[j+1]){
                    char temp=word[j];
                    word[j]=word[j+1];
                    word[j+1]=temp;
                }
            }
        }
        return word;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        else{
            char[]s1= s.toCharArray();
            char[] t1=t.toCharArray();
            bubblesort(s1);
            bubblesort(t1);
            return java.util.Arrays.equals(s1, t1);
            }
    }
}
