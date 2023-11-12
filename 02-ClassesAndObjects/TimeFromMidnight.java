public class TimeFromMidnight {
   
    public void main(String[] args){
        int hours = 15;
        int minutes = 47;
        int totalmin = 60*hours + minutes;
        int totalsec = totalmin*60;
        
        
        System.out.printf("time: %d:%d", hours, minutes);
        System.out.printf("minutes from midnight", totalmin );
        System.out.printf("seconds from midnight", totalsec);
    }
}
