package POD;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {
        public String destCity(List<List<String>> paths) {
        Set<String> cities=new HashSet<>();
        for(List<String> path:paths){
            cities.add(path.get(0));
        }
        for(List<String> path:paths){
            String destination =path.get(1);
            if(!cities.contains(destination)){
                return destination;
            }
        }
        return "";
    }
}
//1436 Q.No