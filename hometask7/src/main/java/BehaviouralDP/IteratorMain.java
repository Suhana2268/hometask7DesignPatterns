package BehaviouralDP;

public class IteratorMain {
	public static void main(String[] args) {  
        Names nm = new Names();  
          
        for(Iterator itr = nm.getIterator(); itr.hasNext();){  
            String name = (String)itr.next();  
            System.out.println("Name of the person : " + name);  
         }      
  }  

}
