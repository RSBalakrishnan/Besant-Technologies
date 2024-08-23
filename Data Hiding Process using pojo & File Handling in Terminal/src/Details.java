import java.util.Scanner;
import org.apache.commons.io.FileUtils;
import com.pojo.*;
import java.io.File;
import java.io.IOException;
public class Details {
	
	private static File toCsv = new File("D:\\File\\pass.csv");
	private static File toTeacher = new File("D:\\File\\dataTeacher.csv");
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		while (true) {
			System.out.println(" Welcome to Detail Dashboard: \n");
			System.out.println("        FOR STUDENT:");
			System.out.println("1 . New Account Creation ");
			System.out.println("2 . Login Account \n");
			System.out.println("         FOR TEACHER:");
			System.out.println("3 . New Account Creation ");
			System.out.println("4 . Login Account ");
			System.out.println("5 . Exit ");
			System.out.println();
			System.out.println("   Enter a number to get-in ");
			int tab = sc.nextInt();
			sc.nextLine();

			switch (tab){
				case 1:
					accountCreate();
					break;
				case 2:
					studentLogin();
					break;
				case 3:
					teacherAccountCreate();
					break;
				case 4:
					teacherLogin();
					break;
				case 5:
					System.out.println("Thank you for visiting ");
					return ;
				default :
					System.out.println("You have entered wrong number,Try again. ");
		}

	}
	
	}

	public static void accountCreate() throws IOException {
		System.out.print("Enter the Student Name: ");
		String name = sc.nextLine();
		System.out.print("Enter reg Num : ");
		int reg = sc.nextInt();
		
		System.out.print("Enter Email : ");
		sc.nextLine();
		String email=sc.nextLine();
	
		System.out.print("Enter Department : ");
		String dept = sc.nextLine();
		System.out.print("Create password  : ");
		String  passcode = sc.nextLine();
		System.out.println("      Thank you   ");
		
		final Students stud = new Students(name,reg,email,dept,passcode);
		FileUtils.write(toCsv,stud.toString(),"UTF-8",true);
		
	}
	public static void teacherAccountCreate() throws IOException {
		System.out.print("Enter Teacher Name: ");
		String name = sc.nextLine();
		System.out.print("Enter id Num : ");
		int idNum = sc.nextInt();
		
		System.out.print("Enter Email : ");
		sc.nextLine();
		String email=sc.nextLine();
	
		System.out.print("Enter Subject : ");
		String subject = sc.nextLine();
		System.out.print("Create password  : ");
		String  password = sc.nextLine();
		System.out.println("      Thank you   ");
		
		final Teachers stud = new Teachers(name,idNum,email,subject,password);
		FileUtils.write(toTeacher,stud.toString(),"UTF-8",true);
		
	}
	public static void studentLogin() throws IOException {
		String line=FileUtils.readFileToString(toCsv,"UTF-8");
		String[] details = new String[5];
		details= line.split(",");
		System.out.print("Enter name: ");
		String enterName= sc.nextLine();
		System.out.print("Enter passcode: ");
		String enterPasscode  = sc.nextLine();
		int chance =3;
		int length = details.length;
		int i=0;
		while (i<length) {
		//System.out.println("Student Details:\n 1.Name  : " +details[0]+ "\n 2.Register Number: " +details[1]+"\n 3.Email Id: "+details[2]+"\n 4.Department: "+details[3]);		
			if (enterName.equals(details[i]) && enterPasscode.equals(details[i+4]))  {
				System.out.println("\n");
				System.out.println("Student Details:\n 1.Name  : " +details[i]+ "\n 2.Register Number: " +details[i+1]+"\n 3.Email Id: "+details[i+2]+"\n 4.Department: "+details[i+3]);
				System.out.println("\n");
			}
			i=i+5;		
		}if (i>length && chance >1) {
			System.out.println("Entered wrong crdentials \n  Try agin (chances - "+chance+") ");
			chance--;
			studentLogin();
		}else if (chance==1) {
			System.out.println("  Try later Only if you Remembers..");
		}
	}
	public static void teacherLogin() throws IOException {
		String line=FileUtils.readFileToString(toTeacher,"UTF-8");
		String[] details = new String[5];
		details= line.split(",");
		System.out.print("Enter name: ");
		String enterName= sc.nextLine();
		System.out.print("Enter passcode: ");
		String enterPasscode  = sc.nextLine();
		int chance =3;
		int length = details.length;
		int i=0;
		while (i<length) {
		//System.out.println("Student Details:\n 1.Name  : " +details[0]+ "\n 2.Register Number: " +details[1]+"\n 3.Email Id: "+details[2]+"\n 4.Department: "+details[3]);		
			if (enterName.equals(details[i]) && enterPasscode.equals(details[i+4]))  {
				System.out.println("\n");
				System.out.println("Teacher Details:\n 1.Name  : " +details[i]+ "\n 2.Identification Number: " +details[i+1]+"\n 3.Email Id: "+details[i+2]+"\n 4.Subject: "+details[i+3]);
				System.out.println("\n");
			}
			i=i+5;		
		}if (i>length && chance >1) {
			System.out.println("Entered wrong crdentials \n  Try agin (chances - "+chance+") ");
			chance--;
			studentLogin();
		}else if (chance==1) {
			System.out.println("  Try later Only if you Remembers..");
		}
	}

}

