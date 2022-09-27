package com.example.codewars.java.HumanReadableDurationFormat;

public class Main {

    public static void main(String[] args) {
        System.out.println(formatDuration(3600));
    }


    public static String formatDuration(int seconds) {
        // your code goes here
        if(seconds == 0){
            return "now";
        }
        int years = seconds / 31536000;
        seconds -= years*31536000;
        int days = seconds / 86400;
        seconds -= days*86400;
        int hours = seconds / 3600;
        seconds -= hours*3600;
        int minutes = seconds / 60;
        seconds -= minutes*60;

        String sYears = "";
        String sDays = "";
        String sHours = "";
        String sMinutes = "";
        String sSeconds = "";
        String answer = "";
        if(years != 0){
            if(years == 1){
                 sYears = "1 year";
            }else{
                sYears = years + " years";
            }
        }
        if(days != 0){
            if(days == 1){
                sDays = "1 day";
            }else{
                sDays = days + " days";
            }
        }
        if(hours != 0){
            if(hours == 1){
                sHours = "1 hour";
            }else{
                sHours = hours + " hours";
            }
        }
        if(minutes != 0){
            if(minutes == 1){
                sMinutes = "1 minute";
            }else{
                sMinutes = minutes + " minutes";
            }
        }
        if(seconds != 0){
            if(seconds == 1){
                sSeconds = "1 second";
            }else{
                sSeconds = seconds + " seconds";
            }
        }
        String YD = "";
        String DH = "";
        String HM = "";
        String MS = "";


        if(!sYears.equals("")&&!sDays.equals("")){
            YD = ", ";
        }
        if(!sDays.equals("")&&!sHours.equals("")){
            DH = ", ";
        }
        if(!sHours.equals("")&&!sMinutes.equals("")){
            HM = ", ";
        }
        if(!sMinutes.equals("")&&!sSeconds.equals("")){
            MS = " and ";
        }


        int n = 0;
        boolean hasYears = !sYears.equals("");
        if(hasYears){
            n++;
        }
        boolean hasDays = !sDays.equals("");
        if(hasDays){
            n++;
        }
        boolean hasHours = !sHours.equals("");
        if(hasHours){
            n++;
        }
        boolean hasMinutes = !sMinutes.equals("");
        if(hasMinutes){
            n++;
        }
        boolean hasSeconds = !sSeconds.equals("");
        if(hasSeconds){
            n++;
        }

        answer = sYears +YD+ sDays +DH+ sHours +HM+ sMinutes +MS+ sSeconds;
        return answer;
    }

}
