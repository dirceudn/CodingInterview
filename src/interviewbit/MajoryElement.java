package interviewbit;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays; 
public class MajoryElement {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> arra1) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        
        int count = 0;
        for(int i = 0; i < arra1.size(); i++){
            if (map.get(arra1.get(i)) == null){
                map.put(arra1.get(i), 0);
            

            }
            
            map.put(arra1.get(i), map.get(arra1.get(i)) + 1);
        }
        
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) 
        {
            Map.Entry pair = (Map.Entry)it.next();
            if ((int)pair.getValue() > arra1.size()/2)
                return (int)pair.getKey();

            it.remove(); 
        }

        // no majority element
        return -1;
    }
}
