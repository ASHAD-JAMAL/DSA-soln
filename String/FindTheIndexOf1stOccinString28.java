package String;

public class FindTheIndexOf1stOccinString28 {
    public static int fun(String haystack,String needle){
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
    
}
