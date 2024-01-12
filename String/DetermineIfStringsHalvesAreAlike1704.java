package String;

public class DetermineIfStringsHalvesAreAlike1704 {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        String str="";
        String strs="";
        for(int i=0;i<n/2;i++){
            str+=s.charAt(i);
        }
        for(int i=n/2;i<n;i++){
            strs+=s.charAt(i);
        }
        String vowels="aeiouAEIOU";
        int count1=0;
        int count2=0;
        for(int i=0;i<n/2;i++){
            if(vowels.indexOf(str.charAt(i))!=-1){
                count1++;
            }
        }
        for(int i=0;i<n/2;i++){
            if(vowels.indexOf(strs.charAt(i))!=-1){
                count2++;
            }
        }
        if(count1==count2){
            return true;
        }else{
            return false;
        }
    }
}
