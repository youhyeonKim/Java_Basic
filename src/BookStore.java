import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookStore {
  public static void main(String[] args) throws IOException {
    System.out.println("***********************************");
    System.out.println("*****Welcome to Shopping Mall******");
    System.out.println("******Welcome to Book Market*******");
    System.out.println("***********************************");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean flag = true;
    String name;
    while(flag){
      System.out.println("1. 고객 정보 확인하기\t4. 바구니에 항목 추가하기");
      System.out.println("2. 장바구니에 상품 목록 보기\t5. 장바구니의 항목 수량 줄이기");
      System.out.println("3. 장바구니 비우기\t6. 장바구니의 항목 삭제하기");
      System.out.println("7. 영수증 표시하기\t8. 종료");
      System.out.println("***********************************");
      System.out.print("메뉴 번호를 선택해주세요");
      int num = Integer.parseInt(br.readLine());
      switch (num){
        case 1:
          System.out.println("고객정보 확인하기");

          break;
        case 2:
          System.out.println("장바구니 비우기");
          break;
        case 3:
          System.out.println("장바구니 상품 목록");
          break;
      }
    }
  }

}
