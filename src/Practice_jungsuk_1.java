public class Practice_jungsuk_1 {
  public static void main(String[] args) {
    //1-1
    int num = 0 ;
    char ch = 'a';
    if (num > 10 && num < 20) {
      System.out.println(true);
    }//1-2
    if (ch != ' ' || ch != '\t') {
      System.out.println(true);
    }
    //1-3
    if (ch == 'x' || ch != 'X') {
      System.out.println(true);
    }
    //1-4
    if (ch > '0' && ch < '9') {
      System.out.println(true);
    }
    //1-5
    if (Character.toLowerCase(ch)> 'a' && Character.toLowerCase(ch) < 'z') {
      System.out.println(true);
    }
    //1-6
    if(num%400==0 || ((num%4==0) && (num%100!=0))){
      System.out.println(true);
    }
  }

}
