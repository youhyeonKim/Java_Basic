public class Sample8 {

  public static void main(String[] args) {
    MyPoint mp1 = new MyPoint(101,2);

  }

}
class MyPoint{
  private int x;
  private int y;
  public MyPoint(){
    x = 0;
    y = 0;
  }
  public MyPoint(int px, int py){
    if(px >100 || py >100){
      System.out.println("좌표 범위를 벗어났습니다.");
      return;
    }
    x = px;
    y = py;

  }

  public void setX(int px){
    if(px >100){
      System.out.println("X좌표 범위를 벗어났습니다.");
      return;
    }
    x = px;
  }
  public void setY(int py){
    if(py >100){
      System.out.println("Y좌표 범위를 벗어났습니다.");
      return;
    }
    y = py;
  }
  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }
}

