package by.epam.Lesson8.Hometask;

public class BankAccount {
private int usdAccount;
private int euroAccount;
private int rubAccount;

public BankAccount(int usdAccount, int euroAccount, int rubAccount) {
	this.usdAccount=usdAccount;
	this.euroAccount=euroAccount;
	this.rubAccount=rubAccount;
}
public int getUsdAccount() {
	return usdAccount;
}
public void setUsdAccount(int usdAccount) {
	this.usdAccount=usdAccount;
}
public int getEuroAccount() {
	return euroAccount;
}
public void setEuroAccount(int euroAccount) {
	this.euroAccount=euroAccount;
}
public int getRubAccount() {
	return rubAccount;
}
public void setRubAccount(int rubAccount) {
	this.rubAccount=rubAccount;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + euroAccount;
	result = prime * result + rubAccount;
	result = prime * result + usdAccount;
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
	BankAccount other = (BankAccount) obj;
	if (euroAccount != other.euroAccount)
		return false;
	if (rubAccount != other.rubAccount)
		return false;
	if (usdAccount != other.usdAccount)
		return false;
	return true;
}
@Override
public String toString() {
	return "BankAccount [usdAccount=" + usdAccount + ", euroAccount=" + euroAccount + ", rubAccount=" + rubAccount
			+ "]";
}

}
