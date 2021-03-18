package Exercise8;
import java.util.ArrayList;
import java.util.Iterator;
import Exercise7.WeightOnMars;

public class list {
	public list(){
		WeightOnMars wom1 = new WeightOnMars(60);
		WeightOnMars wom2 = new WeightOnMars(65);
		WeightOnMars wom3 = new WeightOnMars(70);

		ArrayList<WeightOnMars> weightlist = new ArrayList<WeightOnMars>();

		weightlist.add(wom1);
		weightlist.add(wom2);
		weightlist.add(wom3);

		Iterator<WeightOnMars> weightIt = weightlist.iterator();
		while (weightIt.hasNext()) {
			weightIt.next().calculateWeight();
		}
	}
}
