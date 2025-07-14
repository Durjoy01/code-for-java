
import java.time.YearMonth;
import java.util.Scanner;


public class banglacalender2 {
     static boolean isLeapYear(int n) {
        
		if ((n%4 == 0 && n%100 != 0) || n%400 == 0) {
	                           return true;
		}
		    return false;
	}
	
	static void printeachday(String startday, int daysInMonth) {
		int index = 0;
		switch(startday) {
		case "SUNDAY":
			index = 0;
			break;
		case "MONDAY":
			index = 1;
			break;
		case "TUESDAY":
			index = 2;
			break;
		case "WEDNESDAY":
			index = 3;
			break;
		case "THURSDAY":
			index = 4;
			break;
		case "FRIDAY":
			index = 5;
			break;
		case "SATURDAY":
			index = 6;
			break;
		}
		
		//System.out.println("Index: " + index);
		
		String arr[] = new String[42];
		
		for (int i = 0;i<arr.length;i++) {
			arr[i] = "";
		}
		
		int count = 1;
		for (int j = index;j<daysInMonth+index;j++) {
			arr[j] = String.valueOf(count);
			count++;
		}
		
		for (int j = 0;j<arr.length;j++) {
			
			if (arr[j]=="") System.out.print("         ");
			else {
				if (Integer.parseInt(arr[j])<10) {
					System.out.print(" " + arr[j] +  "       ");
				}
				else {
					System.out.print(arr[j] +  "       ");
				}
			}
			
			if ((j+1) % 7 == 0) System.out.println();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter year: ");
		int year = s.nextInt();
		while (!(year>=1000)) {
			System.out.print("Wrong entry. Please enter a year: ");
			year = s.nextInt();
		}
                                             System.out.print("Enter month : ");
		int month = s.nextInt();
		while(!(month>=1&&month<=12)) {
			System.out.print("Wrong entry. Please enter a month: ");
			month = s.nextInt();
		}
		
		
		
		System.out.println("YEAR: " + year);
                
                                             System.out.println("Month: "+ month);
		
		String banglamonth = "";
		switch(month){
		case 1:
			banglamonth = "MAGH";
			break;
		case 2:
			banglamonth = "FALGUN";
			break;
		case 3:
			banglamonth = "CHOITRO";
			break;
		case 4:
			banglamonth = "BOISHAKH";
			break;
		case 5:
			banglamonth = "JOISHTHO";
			break;
		case 6:
			banglamonth = "ASHAR";
			break;
		case 7:
			banglamonth = "SRABON";
			break;
		case 8:
			banglamonth = "BHADRO";
			break;
		case 9:
			banglamonth = "ASHWIN";
			break;
		case 10:
			banglamonth = "KARTIK";
			break;
		case 11:
			banglamonth = "OGROHAYON";
			break;
		case 12:
			banglamonth = "POUSH";
			break;
		}
		
		System.out.println("MONTH: " + banglamonth);
		
		System.out.println("Robi     Sum     Mongol  Budh Brihospoti   Shukra   Soni");
		
		int daysInMonth;

		if (month == 2) {                                        // February
			if (isLeapYear(year)) {
				daysInMonth = 29;
			} 
                                                                    else {
				daysInMonth = 28;
			}
		}
                                              else if (month == 4 || month == 6 ||
			month == 9 || month == 11) {
			daysInMonth = 30;
		} 
                                            else {
			daysInMonth = 31;
		}
		
		//getting first day of month
		YearMonth ym = YearMonth.of(year, month);
		String firstday = ym.atDay(1).getDayOfWeek().name();
		
		printeachday(firstday, daysInMonth);
		
	}
}