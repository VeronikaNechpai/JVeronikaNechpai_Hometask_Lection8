package by.epam.Lesson8.Hometask;

public class Main {
	public static void main(String[] args) {
	BankAccount Petrov=new BankAccount(100,200,300);
	BankAccount Ivanov=new BankAccount(10,20,30);
	BankAccount Sidarov=new BankAccount(100,200,300);
	 System.out.println(Petrov.toString());
     System.out.println(Ivanov.toString());
     System.out.println(Sidarov.toString());
     if(Petrov.equals(Ivanov))
         System.out.println("Petrov account equals Ivanov account");
     else
         System.out.println("Petrov account is NOT equal to Ivanov account");

     if(Petrov.hashCode() == Ivanov.hashCode())
         System.out.println("Petrov hashcode equals to Ivanov hashcode");
     else
         System.out.println("Petrov hashcode is NOT equal to Ivanov hashcode");

     if(Sidarov.equals(Petrov))
         System.out.println("Sidarov account equals to Petrov account");
     else
         System.out.println("Sidarov account is NOT equal to Petrov account");

     if(Sidarov.hashCode() == Petrov.hashCode())
         System.out.println("Sidarov hashcode equals to Petrov hashcode");
     else
         System.out.println("Sidarov hashcode is NOT equal to Petrov hashcode");
     if(Sidarov.equals(Ivanov))
         System.out.println("Sidarov account equals to Ivanov account");
     else
         System.out.println("Sidarov account is NOT equal to Ivanov account");

     if(Sidarov.hashCode() == Ivanov.hashCode())
         System.out.println("Sidarov hashcode equals to Ivanov hashcode");
     else
         System.out.println("Sidarov hashcode is NOT equal to Ivanov hashcode");
 }
}