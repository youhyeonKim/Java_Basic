public class Practice_jungsuk_9 {

  public static void main(String[] args) {
    int num = 12345;
    int sum = 0;
    int temp;
    String str = String.valueOf(num);
    int length = str.length();
    while(num>10){
      temp = num%10;
      System.out.println(temp);
      sum += temp;
      num = num/10;
    }
    sum += num;
    System.out.print(sum);
  }
}
