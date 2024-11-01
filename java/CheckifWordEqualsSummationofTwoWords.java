import java.util.ArrayList;
import java.util.List;
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        List<Integer> chaveCoringa=new ArrayList<>();
        List<Boolean> salasVisitadas=new ArrayList<>(rooms.size());
        for(int i=0;i<rooms.size();i++){
            salasVisitadas.add(false);
        }

        salasVisitadas.set(0,true);
        chaveCoringa.add(0);

        int n=0;
        while(!chaveCoringa.isEmpty()){
          int salaAtual=chaveCoringa.remove(0);
          for (int chave : rooms.get(salaAtual)) {
                if (!salasVisitadas.get(chave)) {
                    salasVisitadas.set(chave, true);
                    chaveCoringa.add(chave);
                }
            }
        }

        for (boolean visitada : salasVisitadas) {
            if (!visitada) return false;
        }
        
        return true;
    }
}
