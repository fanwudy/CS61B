 public class LeapYear{

 	public int year;
 	public LeapYear(int x){
 		year = x;
 	}

 	public String ISLeapYearQ(){
 		if((year % 400) == 0){
 			return " is ";
 		}
 		else if(((year % 4) == 0) && ((year % 100) != 0)){
 				return " is ";
 			}
 			else return " is not ";
 		}

 	

 	public static void main(String[] args) {
 		int year = 1994;
 		LeapYear y1 = new LeapYear(year);
 		System.out.println(year + y1.ISLeapYearQ() + "leap year");
 	}
 }