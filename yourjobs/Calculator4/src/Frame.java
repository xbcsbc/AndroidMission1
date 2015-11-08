import java.awt.BorderLayout;
import java.awt.FlowLayout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;


@SuppressWarnings("serial")
public class Frame extends JFrame implements ActionListener{
	private JPanel pane[];
	static JTextField tf;

	private GridLayout gl;
	private FlowLayout fl;
	private BorderLayout bl;
	
	private ButtonNum buttonNum;
	private ButtonArithmetic BtnA;
	
	static Double num1;
	static Double num2;
	static Double sum;

	
	

	
	
	@SuppressWarnings("static-access")
	Frame(String s){
		super(s);
		setSize(500,500);
		setResizable(false);
		
		num1=new Double(0.0);
		num2=new Double(0.0);
		sum=new Double(0.0);
		
		font f=new font();
		
		gl=new GridLayout(4,3,5,5);
		fl=new FlowLayout();
		bl=new BorderLayout();
		
		
		pane=new JPanel[4];
		int i;
		for(i=0;i<=3;i++){
			pane[i]=new JPanel();
		}
		
		pane[0].setLayout(bl);
		pane[2].setLayout(gl);
		pane[3].setLayout(fl);
		
		tf=new JTextField(12);
		tf.setFont(f.f1);
		tf.setHorizontalAlignment(JTextField.RIGHT);
		
		pane[1].add(tf);
		
		buttonNum=new ButtonNum();
		for(i=9;i>=1;i--){
			pane[2].add(buttonNum.btnN[i]);
		}
		pane[2].add(buttonNum.btnC);
		pane[2].add(buttonNum.btnN[0]);
		pane[2].add(buttonNum.btnP);
		
		BtnA=new ButtonArithmetic();
		for(i=0;i<=4;i++){
			pane[3].add(BtnA.btn[i]);
		}
		
		pane[0].add(pane[1], bl.NORTH);
		pane[0].add(pane[2], bl.CENTER);
		pane[0].add(pane[3], bl.SOUTH);
		
		setContentPane(pane[0]);                            
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
