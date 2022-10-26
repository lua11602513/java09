/**
 * 
 */
package java09;
class Caaa { // 定義 Caaa
	private int value;

 public Caaa(){ //建構元 Caaa
	value=10;
	System.out.println("value="+value);
 }
public Caaa(int i)
 {
	 value=i;
	 System.out.println("value="+value); //輸出value的值
}
}
public class class03{
	public static void main(String args[]){
	Caaa obj1=new Caaa();
	Caaa obj2=new Caaa(12);
 }
 } 