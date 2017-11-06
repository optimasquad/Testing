package com.example.jatinmahajan.smash;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by jatinmahajan on 05/11/17.
 */

public class DatabaseQuery {


    public List<EventObjects> getAllFutureEvents(Date mDate) {
       /* Calendar calDate = Calendar.getInstance();
        Calendar dDate = Calendar.getInstance();
        calDate.setTime(mDate);

        int calDay = calDate.get(Calendar.DAY_OF_MONTH);
        int calMonth = calDate.get(Calendar.MONTH) + 1;
        int calYear = calDate.get(Calendar.YEAR);*/

        List<EventObjects> events = new ArrayList<>();


        events.add(new EventObjects(1, "ESB Failed", new java.util.Date(), new java.util.Date()));



     /*   String query = "select * from events";
       // Cursor cursor = this.getDbConnection().rawQuery(query, null);
        if (cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(0);

                int id = cursor.getInt(0);
                String message = cursor.getString(cursor.getColumnIndexOrThrow("message"));
                String startDate = cursor.getString(cursor.getColumnIndexOrThrow("reminder"));
                String endDate = cursor.getString(cursor.getColumnIndexOrThrow("end"));
                //convert start date to date object
                Date reminderDate = convertStringToDate(startDate);
                Date end = convertStringToDate(endDate);
                dDate.setTime(reminderDate);
                int dDay = dDate.get(Calendar.DAY_OF_MONTH);
                int dMonth = dDate.get(Calendar.MONTH) + 1;
                int dYear = dDate.get(Calendar.YEAR);

                if (calDay == dDay && calMonth == dMonth && calYear == dYear) {
                    events.add(new EventObjects(id, message, reminderDate, end));
                }
            } while (cursor.moveToNext());
        }
      //  cursor.close();

        */

        return events;
    }

  /*  private Date convertStringToDate(String dateInString) {
        DateFormat format = new SimpleDateFormat("d-MM-yyyy HH:mm", Locale.ENGLISH);
        Date date = null;
        try {
            date = format.parse(dateInString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }*/
}