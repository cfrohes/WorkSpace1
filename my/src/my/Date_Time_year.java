package my;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date_Time_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM|dd|yyyy");
		LocalDate date= LocalDate.parse(input,formatter);
		String DayOfWeek=date.getDayOfWeek().toString();
		System.out.println(DayOfWeek);
	}

}
