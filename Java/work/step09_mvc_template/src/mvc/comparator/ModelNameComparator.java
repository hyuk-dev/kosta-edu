package mvc.comparator;

import java.util.Comparator;

import mvc.dto.Electronics;

public class ModelNameComparator implements Comparator<Electronics> {

	@Override
	public int compare(Electronics o1, Electronics o2) {
		return o1.getModelName().compareTo(o2.getModelName());
	}
	

}
