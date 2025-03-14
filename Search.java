import java.util.ArrayList;

public class Search {

    private ArrayList<Integer> listRepeat(ArrayList<Integer> l){
        ArrayList<Integer> repeat = new ArrayList<>();
        for(Integer i : l){
            int ocurr = 0;
            for(Integer el : l){
                if(i.equals(el)){
                    ocurr++;
                }
            }
            if(ocurr>=2){
                repeat.add(i);
            }
        }
        return repeat;
    }
    private ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2){
        ArrayList<Integer> union = new ArrayList<>();
        for(Integer i : l1){
            union.add(i);
        }
        for(Integer i: l2){
            if(!l2.contains(i)){
                union.add(i);
            }
        }
        return union;
    }
    private ArrayList<Integer> interseccion(ArrayList<Integer> l1, ArrayList<Integer> l2){
        ArrayList<Integer> inters = new ArrayList<>();
        for(Integer i : l1){
            if(l2.contains(i)){
                inters.add(i);
            }
        }
        return inters;
    }
}