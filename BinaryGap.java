public class Main {

  public static int solution(int N) {
    
    String bStr = Integer.toBinaryString(N);
    
    int mGap = 0;
    int cGap = 0;
    
    for(char c : bStr.toCharArray()) {
     
      if(c == '0') {
          cGap++;
      } else {
          if(cGap>mGap){
          	mGap = cGap;
          }
          cGap = 0;
      }
    }

    return mGap;
  }
      
  public static void main(String[] args) {
  	int n = 200000000;
    int result = solution(n);
		
	System.out.println(result);
  }
}
