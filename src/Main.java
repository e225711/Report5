public class Main {
  public static void main(String[] args) {
    try {
      //処理したいコード
      String str = null;
      System.out.println(str.length());
  }  catch (NullPointerException e) {
      //NullPointerExceptionが起きたときの処理
      System.out.println("NullPointerExceptionが発生");
      System.out.println(e.getMessage());
  }
  }
}
