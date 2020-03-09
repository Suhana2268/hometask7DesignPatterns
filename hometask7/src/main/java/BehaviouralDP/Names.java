package BehaviouralDP;
public class Names implements IteratorCon {  
public String name[]={"Rishi Agarwal", 
							"Reshma",
								"Sathwik",
								"Rajesh"};   
      
@Override  
    public Iterator getIterator() {  
        return new NamesIterate() ;  
    }  
    private class NamesIterate implements Iterator{  
        int i;  
        @Override  
        public boolean hasNext() {  
            if (i<name.length){  
                return true;  
            }  
            return false;  
        }  
        @Override  
        public Object next() {  
            if(this.hasNext()){  
                return name[i++];  
            }  
            return null;      
        }  
    }  
}  