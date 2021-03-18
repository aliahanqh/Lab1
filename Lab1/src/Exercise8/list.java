package Exercise8;
import java.util.ArrayList;
import java.util.Iterator;
import Exercise7.WeightOnMars;

public class list {
	public list(){
		WeightOnMars wt1 = new WeightOnMars(60);
		WeightOnMars wt2 = new WeightOnMars(70);
		WeightOnMars wt3 = new WeightOnMars(100);

		ArrayList<WeightOnMars> weightlist = new ArrayList<WeightOnMars>();

		weightlist.add(wt1);
		weightlist.add(wt2);
		weightlist.add(wt3);

		Iterator<WeightOnMars> weightIt = weightlist.iterator();
		while (weightIt.hasNext()) {
			weightIt.next().calculateWeight();
		}
	}
}
