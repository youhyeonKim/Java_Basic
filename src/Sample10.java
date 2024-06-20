import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample10 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("문자열을 입력하세요:");
    String s = br.readLine();
    //첫번째 문자 출력
    System.out.println("대문자로 변환하면 "+s.toUpperCase()+"입니다.");
    //두번째 문자 출력
    System.out.println("소문자로 변환하면"+s.toLowerCase()+"입니다.");
  }
}
