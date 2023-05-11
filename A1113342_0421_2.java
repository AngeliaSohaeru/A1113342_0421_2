import java.util.Scanner;

public class A1113342_0421_2{
    public static void main(String[] args){
        int year, month, date;

        System.out.print("Enter a calendar date (YYYY/MM/DD or MM/DD/YYYY): ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String[] line = input.split("/");
        if(line.length == 3 && line[0].length() == 4){
            year = Integer.parseInt(line[0]);
            month = Integer.parseInt(line[1]);
            date = Integer.parseInt(line[2]);
        } else if(line.length == 3 && line[2].length() == 4){
            year = Integer.parseInt(line[2]);
            month = Integer.parseInt(line[0]);
            date = Integer.parseInt(line[1]);
        } else{
            System.out.println("Invalid date.");
            return;
        }

        System.out.println("Year: " + year + "\t" + "Month: " + month + "\t" + "Date: " + date);
    }
}