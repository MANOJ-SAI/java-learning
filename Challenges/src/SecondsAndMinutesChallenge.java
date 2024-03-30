public class SecondsAndMinutesChallenge {

    public static String getDurationString(int seconds){
        if(seconds>=0){
            int min = seconds/60;
            return getDurationString(min,seconds%60);
        }
        return "Invalid value";
    }

    public static String getDurationString(int minutes,int seconds){
        if(minutes>=0 && (seconds>=0 && seconds<=59)){
            int hr=minutes/60;
            return hr+"h "+minutes%60+"m "+seconds%60+"s";
        }
        return "Invalid Value";
    }
}
