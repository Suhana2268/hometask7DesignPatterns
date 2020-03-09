package CreationalDP;

public class BuilderMain {
	public static void main(String args[]){  
		   BiryaniBuilder bsBuilder=new BiryaniBuilder();  
		   BiryaniSelect bs1=bsBuilder.buildVegBiryaniB();  
		   bs1.displayItems();  
		  
		   BiryaniSelect bs2=bsBuilder.buildNonVegBiryaniB();  
		   bs2.displayItems();  
		 }

}
