import java.util.ArrayList;

public class Search {
    public static int contarOcorrencias(ArrayList<Integer> lista, Integer elemento){
        int count = 0;

        for (int item : lista){
            if (item==elemento){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(2);
        lista.add(4);
        lista.add(2);

        System.out.println("existem " + contarOcorrencias(lista, 2) +" ocorrencias");
        System.out.println("Lista possui elementos repetidos? " + hasRepeat(lista));
        System.out.println(qtdRepeat(lista));
    }

    public static boolean hasRepeat(ArrayList<Integer> l) {
        for(int i = 0;i<l.size();i++){
            Integer e =l.get(i);
            for(int j = i+1;j<l.size();j++){
                if(e.equals(l.get(j))){
                    return true;
                }
            }
        }
        return false;
    }
    public static int qtdRepeat(ArrayList<Integer> l) {
        ArrayList<Integer> repeated = new ArrayList<>();
        for(int i = 0;i<l.size();i++){
            Integer e =l.get(i);
            for(int j = i+1;j<l.size();j++){
                if(e.equals(l.get(j))){
                    if(!repeated.contains(e)){
                        repeated.add(e);
                    }

                }
            }
        }
        return repeated.size();
    }
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