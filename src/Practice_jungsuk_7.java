public class Practice_jungsuk_7 {

  public static void main(String[] args) {
    String str = "12345";
    int sum = 0;
    for(int i=0; i<str.length();i++){
      sum += Integer.parseInt(String.valueOf(str.charAt(i)));
    }
    System.out.println("sum="+sum);
  }
}
