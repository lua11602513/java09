package java09;
class CRectangle{ //定義 width, height
 int width;
 int height;

 public CRectangle(int w,int h)
 {
 width=w;
 height=h;
 System.out.println("constructor CRectangle(int w,int h) called");  //輸出內容
 }
 public CRectangle()
 {
 width=10;  //寫入參數
 height=8;
System.out.println("constructor CRectangle() called");
 }
 public void show() {
	 System.out.println("width="+width);  //輸出width, height的值
	 System.out.println("height="+height);
}
 }
 public class class01 {
 public static void main(String args[]) {
	 CRectangle rec1=new CRectangle(5,2);
	 rec1.show();
	 CRectangle rec2=new CRectangle();
	 rec2.show();
 }
 } 