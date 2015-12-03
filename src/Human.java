
public class Human implements Comparable<Human> {
    private final String name;
    private Pass document;
    private final MyCalendar date;

    public Human(String name, Pass document, MyCalendar date) {
	this.name = name;
	this.document = document;
	this.date = date;
    }

    public String getName() {
	return name;
    }

    public Pass getPass() {
	return document;
    }

    public void setDocuments(Pass newDocument) {
	document = newDocument;
    }

    public MyCalendar getDateBorn() {
	return date;
    }

    @Override
    public int compareTo(Human other) {
	Human people = other;
	if (people.getDateBorn().year - date.year > 0) {
	    return 1;
	}
	if (people.getDateBorn().year - date.year < 0) {
	    return -1;
	}
	if (people.getDateBorn().year - date.year == 0) {
	    if (people.getPass().getNumber() - document.getNumber() > 0) {
		return -1;
	    }
	    if (people.getPass().getNumber() - document.getNumber() < 0) {
		return 1;
	    }
	    if (people.getPass().getNumber() - document.getNumber() > 0) {
		return 0;
	    }
	}
	return 0;
    }

    @Override
    public String toString() {
	StringBuilder stringBuilder = new StringBuilder();
	stringBuilder.append(name.toString());
	stringBuilder.append(" ");
	stringBuilder.append(Integer.toString(document.getNumber()));
	stringBuilder.append(" ");
	stringBuilder.append(date.day);
	stringBuilder.append(date.month);
	stringBuilder.append(date.year);
	return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object object) {
	if (getClass() != object.getClass()) {
	    return false;
	}
	Human other = (Human) object;
	if ((name == other.getName()) && (document.getNumber() == other.getPass().getNumber())
		&& (date == other.getDateBorn())) {
	    return true;
	}
	return false;
    }

}
