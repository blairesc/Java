import java.util.Scanner; //uses for Scanner
import java.io.*; //use for file

public class HomeworkFour {

	public static void main(String[] args) throws IOException {		
		Scanner input = new Scanner (System.in);

		//File Output
		String name, phoneNumber, country;
		FileWriter fileWriter = new FileWriter("homework.csv", true); //append
		PrintWriter printWriter = new PrintWriter(fileWriter);
		System.out.print("Name: ");
		name = input.nextLine();
		System.out.print("Phone Number: ");
		phoneNumber = input.nextLine();
		System.out.print("Country: ");
		country = input.nextLine();
		printWriter.println(name + ", " + phoneNumber + ", " + country);
		fileWriter.close();

		//File Input
		FileReader fileReader = new FileReader("homework.csv");
		Scanner fileIn = new Scanner(fileReader);	
		while (fileIn.hasNext()) {
			System.out.println(fileIn.nextLine());
		}
		fileReader.close();
		
	}

}
