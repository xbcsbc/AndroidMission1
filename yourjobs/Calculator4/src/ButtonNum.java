import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonNum implements ActionListener{
    static JButton btnN[];
    JButton btnP;
    JButton btnC;
    
	ButtonNum(){
		font f=new font();
		
		btnN=new JButton[10];
		btnP=new JButton(".");
		btnP.setFont(f.f1);
		btnP.addActionListener(this);
		btnC=new JButton("c");
		btnC.setFont(f.f1);
		btnC.addActionListener(this);
		Integer i=new Integer(0);    
		for(i=0;i<=9;i++){
			btnN[i]=new JButton(i.toString());
			btnN[i].addActionListener(this);
			btnN[i].setFont(f.f1);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s=e.getActionCommand();
		String sb=Frame.tf.getText();
		
		
		sb=sb.concat(s);
			
		
		
		Frame.tf.setText(sb);
		
		if(e.getActionCommand().equals("c")){
			Frame.tf.setText("");
		
	       }
			
			
	}
	
}
