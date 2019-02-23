
package lab12;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author dizhe
 */
public class Test {
        static ArrayList<Event> events = new ArrayList<Event>();
        public static void main(String[] args) {
        
        // TODO code application logic here
            /*
            Party with friends On 25 July from 18:00 to 24:00
            Summer holiday from 11 August to 1 September
            Spring Semester from February 1 to June 14
            Competition from 21 October to 28 October
            Math Modeling from 16 Sep 20:00 to 18 sep 21:00
            */
        
           method();
        
    }
        public static void method(){
    
        LocalDateTime initialDateTime1 = LocalDateTime.of(2018, 7, 25, 18, 00);
        LocalDateTime finalDateTime1 = LocalDateTime.of(2018, 7, 25, 00, 00);
        Event Party = new Event("A party with friends",initialDateTime1,finalDateTime1);
        events.add(Party);
        
        System.out.println(events.get(0).toString());
        
        LocalDateTime initialDateTime2 = LocalDateTime.of(2018,8,11,0,0);
        LocalDateTime finalDateTime2 = LocalDateTime.of(2018,9,1,0,0);
        Event summerHoliday = new Event("A summer holiday",initialDateTime2,finalDateTime2);
        events.add(summerHoliday);
        
        System.out.println(events.get(1).toString());
        
        LocalDateTime initialDateTime3 = LocalDateTime.of(2018,2,1,0,0);
        LocalDateTime finalDateTime3 = LocalDateTime.of(2018,10,28,0,0);
        Event springSemester = new Event("The spring semester",initialDateTime3,finalDateTime3);
        events.add(springSemester);
        
        System.out.println(events.get(2).toString());
        
        LocalDateTime initialDateTime4 = LocalDateTime.of(2018,10,21,0,0);
        LocalDateTime finalDateTime4 = LocalDateTime.of(2018,10,28,00,0);
        Event Competition = new Event("A competition",initialDateTime4,finalDateTime4);
        events.add(Competition);
        
        System.out.println(events.get(3).toString());
        
        LocalDateTime initialDateTime5 = LocalDateTime.of(2018, 9, 16, 20, 0);
        LocalDateTime finalDateTime5 = LocalDateTime.of(2018, 9, 19, 21, 0);
        Event mathModeling = new Event("A math modeling content",initialDateTime5,finalDateTime5);
        events.add(mathModeling);
        
        System.out.println(events.get(4).toString());
        
        
        System.out.println("=============================");
        Event.IterateR(events);
        
        
        
        System.out.println("=============================");
        LocalDateTime search = LocalDateTime.of(2018,9,25,20,0);
        System.out.println(Event.Search(search));
        
        
        
    }
    
}
