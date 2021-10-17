package calculator;

class StringCalculator {

    public int add(String input) {
    	int sum=0;
    	String[] arr=input.split(",");
    	if(input.contains(",")) {
    		for(int i=0; i<arr.length; i++) {
    			sum=sum+Integer.parseInt(arr[i]);
    		}
    	}
        return sum;
    }
    
}