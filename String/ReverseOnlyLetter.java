package String;

public class ReverseOnlyLetter {
        public String reverseOnlyLetters(String s) {
        int st=0;
        int e=s.length()-1;
        char[] string=s.toCharArray();
        while(st<=e){
                if(Character.isAlphabetic(string[st]) && Character.isAlphabetic(string[e])){
                    char temp=string[st];
                    string[st]=string[e];
                    string[e]=temp;
                    st++;
                    e--;
                }
                else if(!Character.isAlphabetic(string[st])){
                    st++;
                }
                else if(!Character.isAlphabetic(string[e])){
                    e--;
                }
        }
        return String.valueOf(string);
    }
}
