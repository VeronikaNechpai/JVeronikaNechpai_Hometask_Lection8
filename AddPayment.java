package by.epam.Lesson8.Hometask;

public class AddPayment {
public String note;
public AddPayment(String note) {
	this.note=note;
}
public String getAddPayment() {
	return note;
}
public void setAddPayment(String note) {
	this.note=note;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((note == null) ? 0 : note.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	AddPayment other = (AddPayment) obj;
	if (note == null) {
		if (other.note != null)
			return false;
	} else if (!note.equals(other.note))
		return false;
	return true;
}
@Override
public String toString() {
	return "AddPayment [note=" + note + "]";
}

}
