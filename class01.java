package java09;
class CRectangle{ //�w�q width, height
 int width;
 int height;

 public CRectangle(int w,int h)
 {
 width=w;
 height=h;
 System.out.println("constructor CRectangle(int w,int h) called");  //��X���e
 }
 public CRectangle()
 {
 width=10;  //�g�J�Ѽ�
 height=8;
System.out.println("constructor CRectangle() called");
 }
 public void show() {
	 System.out.println("width="+width);  //��Xwidth, height����
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