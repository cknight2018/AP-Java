/**
 * @(#)Haiku.java
 *
 *
 * @author 
 * @version 1.00 2018/2/26
 */


public class Haiku extends Poem{

    public int numLines(){
    	return 3;
    }
    public int getSyllables(int k){
    	switch(k){
    		case 1:
    			return 5;
    		case 2:
    			return 7;
    		case 3: 
    			return 5;
    		default:
    			return -1;
    	}	
    }
    public void printRythm(){
    	System.out.println("ta-ta-ta-ta-ta\nta-ta-ta-ta-ta-ta-ta\nta-ta-ta-ta-ta");
    }
}