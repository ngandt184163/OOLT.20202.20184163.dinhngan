//The second-degree equation with one variable ax^2+bx+c=0
import java.lang.Math;
import javax.swing.JOptionPane;
public class SecondDegreeEquation{
	public static void main(String[] args){
		String strA, strB, strC;
		String strNotification="phuong trinh bac 2: ";

		strA=JOptionPane.showInputDialog(null,"a(x^2)+bx+c=0\n a = ","Input a", JOptionPane.INFORMATION_MESSAGE);
		strNotification+=strA+"(x^2)+";
		strB=JOptionPane.showInputDialog(null,"b = ","Input b", JOptionPane.INFORMATION_MESSAGE);
		strNotification+=strB+"x+";
		strC=JOptionPane.showInputDialog(null,"c = ","Input c", JOptionPane.INFORMATION_MESSAGE);
		strNotification+=strC+"=0.";

		double a = Double.parseDouble(strA);
		double b = Double.parseDouble(strB);
		double c = Double.parseDouble(strC);
		if(a==0){
			strNotification+="\nkp ptrinh bac 2!!";
			JOptionPane.showMessageDialog(null, strNotification, "Result", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		double delta, x1, x2;
		delta=b*b-4*a*c;
		if(delta<0)
			strNotification+="\nptr vo nghiem!!";
		else if(delta==0){
			x1=(-b)/(2*a);
			strNotification+="\nptr co 1 ngiem x = "+x1;
		}else{
			x1=(-b-Math.sqrt(delta))/(2*a);
			x2=(-b+Math.sqrt(delta))/(2*a);
			strNotification+="\nptr co 2 nghiem: x1 = "+x1+"\nx2 = "+x2;
		}
		
		JOptionPane.showMessageDialog(null, strNotification, "Result", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}