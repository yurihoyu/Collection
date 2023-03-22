package practice;

import java.util.Comparator;

public class DateComparator implements Comparator<Task> {

	@Override
	public int compare(Task t1, Task t2) {
		int c;
		if(t1.getDate().isAfter(t2.getDate())) {
			c = 1;
		}else {
			c =-1;
		}


		return c ;
	}
}