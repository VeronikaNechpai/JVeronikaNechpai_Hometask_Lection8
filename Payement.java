package by.epam.Lesson8.Hometask;

public class Payement {
private int tovar1;
private int tovar2;
private int tovar3;
public Payement(int tovar1,int tovar2,int tovar3) {
	this.tovar1=tovar1;
	this.tovar2=tovar2;
	this.tovar3=tovar3;
}
public int getTovar1() {
	return tovar1;
}
public void setTovar1(int tovar1) {
	this.tovar1=tovar1;
}
public int getTovar2() {
	return tovar2;
}
public void setTovar2(int tovar2) {
	this.tovar2=tovar2;
}
public int getTovar3() {
	return tovar3;
}
public void setTovar3(int tovar3) {
	this.tovar3=tovar3;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + tovar1;
	result = prime * result + tovar2;
	result = prime * result + tovar3;
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
	Payement other = (Payement) obj;
	if (tovar1 != other.tovar1)
		return false;
	if (tovar2 != other.tovar2)
		return false;
	if (tovar3 != other.tovar3)
		return false;
	return true;
}
@Override
public String toString() {
	return "Payement [tovar1=" + tovar1 + ", tovar2=" + tovar2 + ", tovar3=" + tovar3 + "]";
}

}
