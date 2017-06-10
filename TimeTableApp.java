package practice;
import java.util.Scanner;
public class TimeTableApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		TimeTable tt=new TimeTable();
	boolean quit= true;
		
		do{
			
			
		System.out.println("===============Main Menu==============");
	    System.out.println("(1) Add a class to my time table");
        System.out.println("(2) View the class at a specific period");
        System.out.println("(3) Print the entire time table");
        System.out.println("(4) Exit the program");
        System.out.println("===============Main Menu==============");
        int input=scanner.nextInt();
        
    /////////////////////////////////////////    
        switch(input){
        case 1:
           System.out.println("Please enter the day to add the class.");
            String day = scanner.next();
           System.out.println("Please enter the period to add the class.");
           int period = scanner.nextInt();
           System.out.println("Please enter the name of the class. ");
           String name1 = scanner.nextLine();
           String name = scanner.nextLine();
           System.out.println("Please enter the name of the tutor. ");
           
           String tutor =scanner.nextLine();
           System.out.println("Please enter the name of the room. ");
           String room = scanner.nextLine();
           
           boolean success=tt.setSchedule(day, period, name , tutor, room);
           if(success==true)
        	   System.out.println("Class successfully added");
           else
        	   System.out.println("Class was NOT successfully added");
           
           break;
        case 2:
           System.out.println("Please enter the day of the class:");
           day = scanner.next();
           System.out.println("Please enter the period of the class:");
           period = scanner.nextInt();
           System.out.println("At that time you have ..."+"\n"+(tt.getSchedule(day, period)).getDetails());
           break;
        case 3:
           System.out.println(tt);
           break;
        case 4:
           quit=false;
           break;
        default:
           System.out.println("WRONG INPUT");
           break;
        }
              
////////////////////////////////////////////////////////////
        
        	
        
		}while(quit);
		
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
