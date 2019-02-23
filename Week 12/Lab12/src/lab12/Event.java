
package lab12;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import static lab12.Test.events;

/**
 *
 * @author dizhe
 */
public class Event {
    
        /**
     * @param args the command line arguments
     */
    
    
    private LocalDate initialDate;
    private LocalDate finalDate;
    private LocalDateTime initialDateTime;
    private LocalDateTime finalDateTime;
    private String eventName;

    

    
    //constructor
    public Event(String eventName,LocalDateTime initialDateTime,LocalDateTime finalDateTime){
        this.eventName = eventName;
        this.initialDateTime = initialDateTime;
        this.finalDateTime = finalDateTime;
    }
    
    
    
    //Method
    public long calculatePeriod(Event event){
        long dayDiff= Duration.between(this.initialDateTime,this.finalDateTime).getSeconds();
        System.out.println("The period of days are: "+ dayDiff);
        return dayDiff;
    }

    
    @Override
    public String toString(){
        return "The event has been constructed with initial date and time of "+this.initialDateTime + " and the final date and time of "+this.finalDateTime;
    
    }
    
    
    public static void IterateR(ArrayList<Event> events){
        Iterator<Event> it = events.iterator();
        Event event;
        int duration;
        
        while(it.hasNext()){
            event = it.next();
            duration = LengthOfDuration(event);
            if(duration >86400){
                System.out.println("Event: " + event.getName()+" was on the date "+
                        event.getInitialDateTime().toLocalDate() + " to " + event.getFinalDateTime().toLocalDate());
            }else{
                System.out.println("Event: "+ event.getName()+" was on "+ event.getInitialDateTime().toLocalDate()+
                        " from "+ event.getInitialDateTime().toLocalTime() + " till "+ event.getFinalDateTime().toLocalTime());
            }
        
        
        }
        
        
    }
    public static int LengthOfDuration(Event event){
        event.getInitialDateTime();
        int duration = (int) Duration.between(event.getInitialDateTime(),event.getFinalDateTime()).getSeconds();
        return duration;
    }
    
    public static boolean Search(LocalDateTime object){
        boolean search = false;
        Event event;
        Iterator<Event> iterator = events.iterator();
        
        while(iterator.hasNext()){
            event = iterator.next();
            int duration = LengthOfDuration(event);
            if(event.getInitialDateTime().equals(object) ){
                search = true;
                
                if(duration >86400){
                    System.out.println("Event: " + event.getName()+" was on the date "+
                        event.getInitialDateTime().toLocalDate() + " to " + event.getFinalDateTime().toLocalDate());
                }else{
                    System.out.println("Event: "+ event.getName()+" was on "+ event.getInitialDateTime().toLocalDate()+
                        " from "+ event.getInitialDateTime().toLocalTime() + " till "+ event.getFinalDateTime().toLocalTime());
                    }
                
                break;
            }
        }
        
        
        if(search == false){
            System.out.println("Looking for the event that happens on "+ object+"\n"+"No event on the chosen date on "+ object);
            
        }

    return search;
    }
    
    
    public LocalDateTime getInitialDateTime(){
    return initialDateTime;
    }
    
    public LocalDateTime getFinalDateTime(){
    return finalDateTime;
    }
    
    public String getName(){
    return eventName;
    }
}




