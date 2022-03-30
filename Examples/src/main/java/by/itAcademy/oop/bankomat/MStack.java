package by.itAcademy.oop.bankomat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MStack implements ManeyStack{
    private List<Banknote> st=new ArrayList<>();
    @Override
    public void addBanknote(Banknote b) {
        st.add(b);
    }

    @Override
    public Map<Currency, Long> calc() {
        Map<Currency,Long>map= new HashMap();
        for (Banknote b:st){
            if (map.containsKey(b.getCurrency())){
                map.put(b.getCurrency(),b.getNominal()+map.get(b.getCurrency()));
            }   else{
                map.put(b.getCurrency(),b.getNominal());
            }
        }
        return map;
    }

    @Override
    public boolean isEmpty() {
        return st.isEmpty();
    }

    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        for (Banknote b:st) {
            sb.append(String.format("%d %s sn: %08d\r\n",b.getNominal(),b.getCurrency(),b.getSerialNumber()));
        }

        for (Map.Entry<Currency,Long> e:calc().entrySet()) {
            sb.append(String.format("%s --> %d",e.getKey(),e.getValue()));
        }
        return sb.toString();
    }
}
