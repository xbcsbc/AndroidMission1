import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonArithmetic implements ActionListener{
	JButton btn[];
	static String last;
	
	ButtonArithmetic(){
		font f=new font();
		btn=new JButton[5];
		String s[]={"+","-","*","/","="};
		int i;
		for(i=0;i<=4;i++){
			btn[i]=new JButton(s[i]);
			btn[i].setFont(f.f1);
			btn[i].addActionListener(this);
		}
		last=new String();
		
	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if((e.getActionCommand().equals("+"))||(e.getActionCommand().equals("-"))
				||(e.getActionCommand().equals("*"))||(e.getActionCommand().equals("/"))){
		    
			last=e.getActionCommand();
			
			Frame.num1=Frame.num1.parseDouble(Frame.tf.getText());
			
			Frame.tf.setText("");
			
			
		}
		if(e.getActionCommand().equals("=")){
			
			Frame.num2=Frame.num2.parseDouble(Frame.tf.getText());
			
			switch(last){
			case "+":Frame.sum=Frame.num1+Frame.num2;break;
			case "-":Frame.sum=Frame.num1-Frame.num2;break;
			case "*":Frame.sum=Frame.num1*Frame.num2;break;
			case "/":Frame.sum=Frame.num1/Frame.num2;break;
			default :break;
			}
			
			Frame.tf.setText(Frame.sum.toString());
		}
		
			
		
		
	}
	
	
	

}
