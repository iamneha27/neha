package com.ActionDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Date_class_in_java {

	public static void main(String[] args) throws ParseException, IOException{
	/*Date date = new Date();
	System.out.println(date.toString());
	SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	System.out.println("Current Date: "+ft.format(date));*/
		
	/*	String time1= "16:00:00";
		String time2= "19:00:00";
		
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date date1= format.parse(time1);		
		Date date2= format.parse(time2);	
		long diff = date2.getTime() -  date1.getTime();
		System.out.println("Diff:"+diff);
		
		//comparing two dates directly
		
		Date date3= new Date();

		Date date4= new Date();
		int cmp=date1.compareTo(date2);
		int cmparison =date3.compareTo(date4);
		System.out.println(cmp);
		System.out.println(cmparison);*/
		
		//working on system calendar date
		
		/*Calendar calendar = new GregorianCalendar(); //1st jan 1970
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int dayofmonth = calendar.get(Calendar.DAY_OF_MONTH);
		int dayofweek = calendar.get(Calendar.DAY_OF_WEEK);
		int weekofyear = calendar.get(Calendar.WEEK_OF_YEAR);
		System.out.println(year);
		System.out.println(month);
		System.out.println(dayofmonth);
		System.out.println(dayofweek);
		System.out.println(weekofyear);
		//modifying calendar 
		
		calendar.add(Calendar.DAY_OF_MONTH,1);
		int dayofmonthupdated = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("New Day"+dayofmonthupdated);*/
		
		//read notepad file char by char
		
		FileReader fr= new FileReader("C:\\Selenium Advance\\Myfile.txt");
		BufferedReader br = new BufferedReader(fr);
		int i;
		while((i=br.read())!=-1) {
			System.out.println((char)i);
			
		}
		br.close();
		fr.close();
		
		//for write we have filewriter
		
		

	}

}
