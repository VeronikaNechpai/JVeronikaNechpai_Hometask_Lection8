package by.epam.Lesson8.Hometask;

import java.util.List;

public class Payment_Main {
	public static void main(String[] args) {
		PaymentList myPaymentList = new PaymentList();
		myPaymentList.add(new AddPayment("Tomato"));
		myPaymentList.add(new AddPayment("Bread"));
		myPaymentList.add(new AddPayment("Milk"));
		AddPayment findAddPayment = myPaymentList.findByContent("tovar3");
		if (findAddPayment !=null) {
			print(findAddPayment);
		}
		print(myPaymentList);
	}
	public static void print(PaymentList paymentList) {
		List<AddPayment> printNotes = paymentList.getNotes();
		System.out.println("Payment list: ");
		for (int i=0; i<printNotes.size(); i++) {
			AddPayment note=printNotes.get(i);
			print(note);
		}
	}
	public static void print (AddPayment note) {
		System.out.println("Product Name -> " + note.getAddPayment());
	}

}
