package by.epam.Lesson8.Hometask;

import java.util.ArrayList;
import java.util.List;

public class PaymentList {
private List<AddPayment> notes= new ArrayList<AddPayment>();
public PaymentList() {
}
public List<AddPayment> getNotes(){
	return notes;
}
public void add(AddPayment note) {
	notes.add(note);
}
	public boolean delete(AddPayment note) {
		return notes.remove(note);
	}
	public AddPayment findByContent(String content) {
		for (AddPayment note : notes) {
			if(note.getAddPayment().equals(content)) {
				return note;
			}
		}
		return null;
}
}
