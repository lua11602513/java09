/**
 * 
 */
package java09;
class CAdd{
public static void add2n(int n){
	int sum=0; //將sum的值預設為0
	for(int i=1;i<=n;i++)
	sum+=i; //將sum的值加總起來
	System.out.println("1+2+...+"+n+"="+sum); //輸出數值
}
}

public class class06{
public static void main(String args[]) {
	CAdd.add2n(5);
	CAdd.add2n(10);
}
 } 