package chemical.classes;

import java.util.Comparator;

public class CompoundComparator implements Comparator<Compound> {

    @Override
    public int compare(Compound o1, Compound o2) {
        if (o1.getComplexDanger() > o2.getComplexDanger())
            return 1;
        else if (o1.getComplexDanger() < o2.getComplexDanger())
            return -1;
        else
            return 0;
    }
}
