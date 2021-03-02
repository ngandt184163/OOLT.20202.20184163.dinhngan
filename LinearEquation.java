// The first-degree equation (linear equation) with one variable: ax+b=c;
import javax.swing.JOptionPane;
public class LinearEquation{
	public static void main(String[] args){
		String strA, strB, strC;
		String strNotification="phuong trinh: ";

		strA=JOptionPane.showInputDialog(null,"ax+b=c\n a = ","Input a", JOptionPane.INFORMATION_MESSAGE);
		strNotification+=strA+"x+";
		strB=JOptionPane.showInputDialog(null,"b = ","Input b", JOptionPane.INFORMATION_MESSAGE);
		strNotification+=strB+"=";
		strC=JOptionPane.showInputDialog(null,"c = ","Input c", JOptionPane.INFORMATION_MESSAGE);
		strNotification+=strC+".";

		double a = Double.parseDouble(strA);
		double b = Double.parseDouble(strB);
		double c = Double.parseDouble(strC);
		if(a!=0){
			double x=(c-b)/a; //ax=c-b
			strNotification+="\nco nghiem la x = "+x;
		}
		else if(c-b==0){
			strNotification+="\nco vo so nghiem!!";
		}else{
			strNotification+="\nvo nghiem!!";
		}
		
		JOptionPane.showMessageDialog(null, strNotification, "Result", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
