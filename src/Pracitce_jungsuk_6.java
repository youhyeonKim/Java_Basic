public class Pracitce_jungsuk_6 {

  public static void main(String[] args) {
    int sum;
    for(int i=1; i<=6;i++){
      sum = 0;
      for(int j=1; j<=6; j++){
        sum = i+j;
        if(sum ==6){
          System.out.println("("+i+","+j+")");
        }
      }
    }
  }

}
