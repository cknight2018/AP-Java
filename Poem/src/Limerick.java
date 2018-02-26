/**
 * @(#)limerick.java
 *
 *
 * @author 
 * @version 1.00 2018/2/26
 */


public class Limerick extends Poem{

    public int numLines(){
    	return 5;
    }
    public int getSyllables(int k){
    	if(k==1||k==2||k==5)
    		return 9;
    	else if(k==3||k==4)
    		return 6;
    	else 
    		return -1;
    }
    public void printRythm(){
    	System.out.println("ta-ta-ta-ta-ta-ta-ta-ta-ta\nta-ta-ta-ta-ta-ta-ta-ta-ta\nta-ta-ta-ta-ta-ta\nta-ta-ta-ta-ta-ta\nta-ta-ta-ta-ta-ta-ta-ta-ta");
    }
    
    
}