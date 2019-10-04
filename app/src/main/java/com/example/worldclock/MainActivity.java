package com.example.worldclock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    //cities to include: Sydney, Singapore, Tokyo, London, New York


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    public void currentime(View view) {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get( Calendar.HOUR );
        int minute = calendar.get( Calendar.MINUTE );

        SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm a");

        String sydtime = date12Format.format(calendar.getTime());
//        String sydtime = String.format( "%02d", hour ) + ":" + String.format( "%02d", minute );

        Calendar SingTime = new GregorianCalendar( TimeZone.getTimeZone( "Asia/Singapore" ) );
        SingTime.setTimeInMillis( calendar.getTimeInMillis() );
        hour = SingTime.get( Calendar.HOUR );
        minute = SingTime.get( Calendar.MINUTE );
        String SingpTime = String.format( "%02d", hour ) + ":" + String.format( "%02d", minute );

        Calendar TokTime = new GregorianCalendar( TimeZone.getTimeZone( "Asia/Tokyo" ) );
        TokTime.setTimeInMillis( calendar.getTimeInMillis() );
        hour = TokTime.get( Calendar.HOUR );
        minute = TokTime.get( Calendar.MINUTE );
        String TokyTime = String.format( "%02d", hour ) + ":" + String.format( "%02d", minute );

        Calendar LonTime = new GregorianCalendar( TimeZone.getTimeZone( "Europe/London" ) );
        LonTime.setTimeInMillis( calendar.getTimeInMillis() );
        hour = LonTime.get( Calendar.HOUR );
        minute = LonTime.get( Calendar.MINUTE );
        String LondTime = String.format( "%02d", hour ) + ":" + String.format( "%02d", minute );

        Calendar Nytime = new GregorianCalendar( TimeZone.getTimeZone( "America/ New York" ) );
        Nytime.setTimeInMillis( calendar.getTimeInMillis() );
        hour = Nytime.get( Calendar.HOUR );
        minute = Nytime.get( Calendar.MINUTE );
        String Newtime = String.format( "%02d", hour ) + ":" + String.format( "%02d", minute );
        sydntime( sydtime );
        tokytime( TokyTime );
        londtime( LondTime );
        singptime( SingpTime );
        nytime( Newtime );
        twhr(sydtime);
//        twhr(TokyTime);
//        twhr(LondTime);
//        twhr(Newtime);
//        twhr(SingpTime);
//        tlhr(sydtime);
//        tlhr(TokyTime);
//        tlhr(LondTime);
//        tlhr(Newtime);
//        tlhr(SingpTime);

    }

    private void sydntime(String num) {
        TextView textView = findViewById( R.id.sydtime );
        textView.setText( num );
    }

    private void tokytime(String num) {
        TextView textView = findViewById( R.id.toktime );
        textView.setText( num );
    }

    private void londtime(String num) {
        TextView textView = findViewById( R.id.lontime );
        textView.setText( num );
    }

    private void singptime(String num) {
        TextView textView = findViewById( R.id.singtime );
        textView.setText( num );
    }

    private void nytime(String num) {
        TextView textView = findViewById( R.id.nytime );
        textView.setText( num );
    }

    //convert 12hr to 24hr
    //24 hour
    private void twhr(String time){
        SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm a");

        SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm");

        try{
         String sydtime = date24Format.format(date12Format.parse( time ));
//         String Toktime= date24Format.format(date12Format.parse( time ));
//         String londtime= date24Format.format(date12Format.parse( time ));
//         String nytime= date24Format.format(date12Format.parse( time ));
//         String singtime= date24Format.format(date12Format.parse( time ));
            sydntime(sydtime);
//            tokytime(Toktime);
//            londtime(londtime);
//            singptime(singtime);
//            nytime(nytime);
        } catch (Exception e){
            e.printStackTrace();

        }

    }
//    12 hour
//    private void tlhr(String time){
//        SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm a");
//
//        SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm");
//
//        try{
//            String sydtime= date12Format.format(date24Format.parse(time));
//            String Toktime= date12Format.format(date24Format.parse(time));
//            String londtime= date12Format.format(date24Format.parse(time));
//            String nytime= date12Format.format(date24Format.parse(time));
//            String singtime= date12Format.format(date24Format.parse(time));
//
//            sydntime(sydtime);
//            tokytime(Toktime);
//            londtime(londtime);
//            singptime(singtime);
//            nytime(nytime);
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//    }

}

