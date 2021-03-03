// viết chương trình tính tổng, hiệu, tích, thương của 2 số thực được nhập vào từ người dùng
// (TH số chia khác 0)
import javax.swing.JOptionPane;
public class calculate{
	public static void main(String[] args) {
		String strNum1, strNum2;
		String strNotification="You've just entered ";

		strNum1=JOptionPane.showInputDialog(null,"Please input the first number: ","Input the first number", JOptionPane.INFORMATION_MESSAGE);
		strNotification+=strNum1+" and ";
		strNum2=JOptionPane.showInputDialog(null,"Please input the sercond number: ","Input the first number", JOptionPane.INFORMATION_MESSAGE);
		strNotification+=strNum2;

		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);

		double tong=num1+num2;
		strNotification+="\ntong = "+tong;
		double hieu=num1-num2;
		strNotification+="\nhieu = "+hieu;
		double tich=num1*num2;
		strNotification+="\ntich = "+tich;
		if(num2==0){
			strNotification+="\nnum2=0 -> ko the thuc hien phep chia";
			JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		}else{
			double thuong=num1/num2;
			strNotification+="\nthuong = "+thuong;
			JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		}

		System.exit(0);
	}
}