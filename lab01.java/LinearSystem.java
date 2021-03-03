//The system of first-degree equations (linear system) with two variables ax+by=c;

import javax.swing.JOptionPane;
public class LinearSystem{
	public static void main(String[] args){
		String strA1, strB1, strC1, strA2, strB2, strC2;
		String strNotification="he phuong trinh: ";

		strA1=JOptionPane.showInputDialog(null,"pt 1: ax+by=c\n a = ","Input a1", JOptionPane.INFORMATION_MESSAGE);
		strNotification+=strA1+"x+";
		strB1=JOptionPane.showInputDialog(null,"b = ","Input b1", JOptionPane.INFORMATION_MESSAGE);
		strNotification+=strB1+"y=";
		strC1=JOptionPane.showInputDialog(null,"c = ","Input c1", JOptionPane.INFORMATION_MESSAGE);
		strNotification+=strC1+";\n";

		strA2=JOptionPane.showInputDialog(null,"pt 2: ax+by=c\n a = ","Input a2", JOptionPane.INFORMATION_MESSAGE);
		strNotification+=strA2+"x+";
		strB2=JOptionPane.showInputDialog(null,"b = ","Input b2", JOptionPane.INFORMATION_MESSAGE);
		strNotification+=strB2+"y=";
		strC2=JOptionPane.showInputDialog(null,"c = ","Input c2", JOptionPane.INFORMATION_MESSAGE);
		strNotification+=strC2+".";

		double a1 = Double.parseDouble(strA1);
		double b1 = Double.parseDouble(strB1);
		double c1 = Double.parseDouble(strC1);

		double a2 = Double.parseDouble(strA2);
		double b2 = Double.parseDouble(strB2);
		double c2 = Double.parseDouble(strC2);

		double x, y;
		if((a1==0 && b1==0)||(a2==0 && b2==0))
			strNotification+="\nko phai pt bac nhat 2 an!!";
		else if(((a1/a2)==(b1/b2) && (a1/a2)==(c1/c2)) || ((a1==0 && a2==0)&&(b1/b2)==(c1/c2)) || ((b1==0 && b2==0)&&(a1/a2)==(c1/c2)))
			strNotification+="\nHe phuong trinh co vo so nghiem!!";
		else if(((a1/a2)==(b1/b2) && (a1/a2)!=(c1/c2)) || ((a1==0 && a2==0)&&(b1/b2)!=(c1/c2)) || ((b1==0 && b2==0)&&(a1/a2)!=(c1/c2)))
			strNotification+="\nHe phuong trinh vo nghiem!!";
		else if(a1==0 && b2==0){ 
			x= c2/a2;
			y= c1/b1;
			strNotification+="\nHe phuong trinh co nghiem: x = "+x+" va y = "+y+"!!";
		}else if(b1==0 && a2==0){
			x=c1/a1;
			y=c2/b2;
			strNotification+="\nHe phuong trinh co nghiem: x = "+x+" va y = "+y+"!!";
		}
		else if(b1==0||b2==0){
			y=(c2/a2-c1/a1)/(b2/a2-b1/a1);
			x= (c1-b1*y)/a1;
			strNotification+="\nHe phuong trinh co nghiem: x = "+x+" va y = "+y+"!!";
		}
		else{
			x=(c2/b2-c1/b1)/(a2/b2-a1/b1);
			y= (c1-a1*x)/b1;
			strNotification+="\nHe phuong trinh co nghiem: x = "+x+" va y = "+y+"!!";
		}
		JOptionPane.showMessageDialog(null, strNotification, "Result", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
