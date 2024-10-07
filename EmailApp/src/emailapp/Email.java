package emailapp;

import java.util.Scanner;

public class Email {
private String firstName;
private String lastName;
private String email;
private String department;
private int mailboxCapacity=500;
private String password;
private int randomPassword;
private int defaultPasswordLength=10;
private int depChoice;
private String alternativeEmail;
private String companySuffix="anycompany.com";

//Constructor to receive first name and last name
public Email(String firstName,String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
	
//Call a method asking for the department
	this.department = setDepartment();
	
// combine elements to generate mail
email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;

	
// call a method that returns a random password
this.password = randomPassword(defaultPasswordLength);

}


// Ask for department
private String setDepartment() {
	System.out.println("New worker: "+firstName+". DEPARTMENT CODES\n1 for sales\n2 for development\n3 for accounting\n0 for none\n Enter the department code: ");
	Scanner in = new Scanner(System.in);
	depChoice = in.nextInt();
	if(depChoice ==1) {return "sales";}
	else if(depChoice ==2) {return "dev";}
	else if(depChoice ==3) {return "acct";}
	else {return "";}
}
//Generate random password
private String randomPassword(int length) {
	String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	char[] password = new char[length];
	for (int i=0; i<length; i++) {
	int rand = (int)(Math.random()*passwordSet.length());
	password[i] = passwordSet.charAt(rand);
	}
	return new String(password);
   }
//Set the mailbox capacity
public void setmailboxCapacity (int capacity){
	this.mailboxCapacity = capacity;
}

//Set the alternative email
public void setalternativeEmail(String alternativeEmail){
	this.alternativeEmail = alternativeEmail;
}
//Change the password
public void setchangePassword(String password){
	this.password = password;
}
public int getmailboxCapacity(){return mailboxCapacity;}
public String getalternativeEmail(){return alternativeEmail;}
public String getpassword(){return password;}

public String showinfo() {
	return "DISPLAY NAME: "+ firstName+" "+lastName+
			"\nCOMPANY EMAIL: "+email+
			"\nMAILBOX CAPACITY: "+mailboxCapacity+ "mb";
}
}
