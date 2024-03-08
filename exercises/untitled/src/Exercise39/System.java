package Exercise39;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public class System {
    private List<List<Integer>> competitionResults;

    public System() {
        this.competitionResults = new ArrayList<>();
        for (int i=0;i<10;i++){
            List<Integer> list = new ArrayList<>();
            list.add(0);
            competitionResults.add(i,list);
        }
    }

    public List<List<Integer>> getCompetitionResults() {
        synchronized (this) {
            return competitionResults;
        }
    }

    public boolean setCompetitionResults(List<Integer> current,List<Integer> toBeUpdated,int index) {
        synchronized (this) {
            if (current.equals(competitionResults.get(index))) {
                competitionResults.set(index, toBeUpdated);
                return true;
            }
            return false;
        }
    }
}
