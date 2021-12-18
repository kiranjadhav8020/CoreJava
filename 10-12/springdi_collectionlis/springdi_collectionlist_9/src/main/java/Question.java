import java.util.Iterator;  
import java.util.List;  
  
public class Question{  
private int id;  
private String name;  
private List<String> answers; 
private List<String> tags; 
  
public Question() {}  
public Question(int id, String name, List<String> answers, List<String> tags) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.answers = answers;  
    this.tags=tags;
    System.out.println("Question() constructor invoked");
}  
  
public void displayInfo(){  
    System.out.println(id+" "+name);  
    System.out.println("answers are:");  
    for(Iterator<String> itr=answers.iterator();itr.hasNext();){  
        System.out.println(itr.next());  
    } 
    System.out.println("Tags are:");  
    for(Iterator<String> itr=tags.iterator();itr.hasNext();){  
        System.out.println(itr.next());  
    } 
}  
  
}