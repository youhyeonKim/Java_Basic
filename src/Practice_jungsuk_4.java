public class Practice_jungsuk_4 {

  public static void main(String[] args) {
    int sum = 0;
    int num = 1;
    while(sum<100){
      if(num%2==0){
        sum += -(num);
      }
      else{
        sum += num;
      }
      num++;
    }
    System.out.println(sum+" "+num);
  }

}
