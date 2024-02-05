import java.util.Scanner;
public class QTwo{
    private Scanner sc1;
    private Scanner sc2;
    private Scanner sc3;
    private int minutes,hours,seconds;
    
    public QTwo(){
        sc1 = new Scanner(System.in);
        sc2 = new Scanner(System.in);
        sc3 = new Scanner(System.in);
        minutes = sc1.nextInt();
        hours = sc2.nextInt();
        seconds = sc3.nextInt();
        if(minutes>60){
         System.out.println("invalid minutes");
         while(minutes<=60){
            System.out.println("enter minutes again:");
            minutes=sc1.nextInt();
         }
        }
        if(hours>60){
            System.out.println("invalid hours");
            while (hours<=60) {
                System.out.println("enter valid hours:");
                hours=sc2.nextInt();
            }
        }
        if(seconds>60){
            System.out.println("invalid seconds");
            while(seconds<=60){
                System.out.println("enter valid seconds");
                seconds=sc3.nextInt();
            }
        }
    }
    public static void Time(int hours1,int hours2,int minutes1,int minutes2,int seconds1,int seconds2){       
        int totalHours=hours1 + hours2;
        int totalMinutes= minutes1 + minutes2;
        int totalSeconds= seconds1 + seconds2;
        System.out.println(totalHours+":" +totalMinutes+":"+totalSeconds+":" );
        
    }

    public static void main(String[] args){     
          QTwo time1 = new QTwo();
          QTwo time2 = new QTwo();
          Time(time1.hours, time1.minutes, time1.seconds, time2.hours, time2.minutes, time2.seconds);
    }
   
    
}