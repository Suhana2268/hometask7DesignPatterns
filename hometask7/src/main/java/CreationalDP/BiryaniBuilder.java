package CreationalDP;

public class BiryaniBuilder {
        public BiryaniSelect buildVegBiryaniB(){   
           BiryaniSelect fds=new BiryaniSelect();  
           fds.addItem(new VegBiryani());  
           return fds;  
    }  
    public BiryaniSelect buildNonVegBiryaniB(){  
    	BiryaniSelect fds=new BiryaniSelect();  
    	fds.addItem(new NonVegBiryani());  
    	return fds;  
    }  
}
	
