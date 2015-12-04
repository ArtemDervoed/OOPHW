
public class MyCalendar {
    private int day;
    private  int month;
    private int year;

    public MyCalendar(int d, int m, int y) {
        if ((d <= 31) && (m <= 12) && (d > 0) && (m > 0) && (y > 0)) {
            day = d;
            month = m;
            year = y;
        } else {
            return;
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    public String getFullDate() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toString(day));
        stringBuilder.append(".");
        stringBuilder.append(Integer.toString(month));
        stringBuilder.append(".");
        stringBuilder.append(Integer.toString(year));
        return stringBuilder.toString();
    }

}
