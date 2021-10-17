package calculator;

class StringCalculator {

    public int add(String input) {
    	int sum=0;
    	String[] arr=input.split(",");
    	//for input contains only two numbers
    	if(input.contains(",") && arr.length==2){
    		for(int i=0; i<arr.length; i++) {
    			sum=sum+Integer.parseInt(arr[i]);
    		}
    	}
    	// for input contains more than two numbers
    	else if(input.contains(",")) {
    		for(int i=0; i<arr.length; i++) {
    			sum=sum+Integer.parseInt(arr[i]);
    		}
    	} 
    	// if input contains only one number
    	else if(input.length()>=1) {
    		return Integer.parseInt(input);
    	}
        return sum;
    }
    
}