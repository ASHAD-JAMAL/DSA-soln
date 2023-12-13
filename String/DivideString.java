package String;
class DivideString {
    public String[] divideString(String s, int k, char fill) {
        int count=((s.length()%k)==0)?(s.length()/k):(s.length()/k)+1;
        String[] ans=new String[count];
        int p=0;
        int i=0;
        int j=0;
        String substr="";
        for(;i<s.length();){
            while(j<k && i<s.length()){
                substr+=s.charAt(i);
                i++;
                j++;
            }
            while(substr.length()<k){
                substr+=fill;
            }
            ans[p]=substr;
            j=0;
            substr="";
            p++;
        }
        return ans;
    }
}