package com.sawan.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtil {

	public static Date stringToDate(String d) throws ParseException
	{
		DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		Date date=dateFormat.parse(d);
		return date;		
	}
}
