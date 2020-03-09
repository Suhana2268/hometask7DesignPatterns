package CreationalDP;

import java.util.ArrayList;  
import java.util.List;  
public class BiryaniSelect {  
	private List<Packing> items=new ArrayList<Packing>();  
	public void addItem(Packing packs) {    
		items.add(packs);  
    }  
	public void getCost(){  
		for (Packing packs : items) {  
			packs.price();  
        }   
    }  
	public void displayItems(){  
		for (Packing packing : items){  
			System.out.print("Biryani Type : "+packing.pack());  
            System.out.println(", Price : "+packing.price());  
         }       
		}     
}