package com.m2i.entity.vol;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateVol {
    public static Date dateFromString(String strDate){
    	Date date = null;
		try {
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			date = format.parse(strDate);
		} catch (ParseException e) {
			System.err.println(e.getMessage());
		}
    	return date;
    }
}
