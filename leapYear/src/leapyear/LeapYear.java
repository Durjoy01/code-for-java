//Name:Durjoy barua
//Id:2131766642
//date:16/06/2022
package leapyear;
public class LeapYear {
    public static void main(String[] args) {
        int a=(int)(1990+ Math.random()*(2020-1990+1));
         if (a%400==0 || a%100!=0 && a%4==0)
         {
             System.out.print( a+" is a leap year");
         }
         else{
             System.out.println(a+" is a not leap year");
         }
    }
    
}