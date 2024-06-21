public class Practice_jungsuk_3 {

  public static void main(String[] args) {
    int sum = 0;
    for(int i=1; i<11;i++){
      int temp = 0;
      for(int j=1; j<=i;j++){
        System.out.print(j+" ");
        temp += j;
      }
      System.out.println("중간합:"+temp);
      sum += temp;
    }
    System.out.println("최종합:"+sum);
  }

}
