import java.util.Arrays;
import java.util.Comparator;

public class HumanRace {

    public static void main(String[] args) {

	Human[] humanRace = new Human[5];
	Human[] humanSortName = new Human[5];
	Human[] humanSortAge = new Human[5];
	Pass firstDoc = new Pass(123);
	MyCalendar firstDate = new MyCalendar(22, 06, 1995);
	Human first = new Human("Artem", firstDoc, firstDate);
	humanRace[0] = first;
	Pass secondDoc = new Pass(127);
	MyCalendar secondDate = new MyCalendar(21, 05, 1996);
	Human second = new Human("Max", secondDoc, secondDate);
	humanRace[1] = second;
	Pass thirdDoc = new Pass(117);
	MyCalendar thirdDate = new MyCalendar(12, 07, 1994);
	Human third = new Human("Sam", thirdDoc, thirdDate);
	humanRace[2] = third;
	Pass fourthDoc = new Pass(137);
	MyCalendar fourthDate = new MyCalendar(11, 12, 1997);
	Human fourth = new Human("Dean", fourthDoc, fourthDate);
	humanRace[3] = fourth;
	Pass fivethDoc = new Pass(107);
	MyCalendar fivethDate = new MyCalendar(22, 04, 1992);
	Human fiveth = new Human("Jack", fivethDoc, fivethDate);
	humanRace[4] = fiveth;
	Arrays.sort(humanRace, new Comparator<Human>() {
	    @Override
	    public int compare(Human first, Human second) {
		return first.compareTo(second);
	    }
	});
	print(humanRace);

	Arrays.sort(humanRace, new Comparator<Human>() {
	    @Override
	    public int compare(Human first, Human second) {
		return first.getName().compareTo(second.getName());
	    }
	});
	print(humanRace);
    }

    private static void print(Human[] peoples) {
	System.out.println("/////////////////////////////////////////////////");
	for (int i =0; i< peoples.length;i++) {
	    System.out.println(peoples[i].toString());
	}
	System.out.println("/////////////////////////////////////////////////");
    }

}
