package String;

public class FaultyKeyword {
    public String finalString(String s) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='i'){
                sb.append(s.charAt(i));
            }else{
                sb.reverse();
            }
        }
        return sb.toString();
    }
}
// Q.No-2810 
