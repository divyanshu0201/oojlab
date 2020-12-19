import java.awt.*;
import java.awt.event.*;

public class TestFieldDemo extends Frame
	implements ActionListener{
			TextField name,pass;
			public TextFieldDemo(){
				setLayout(new Flowlayout());
				Label namep=new Label("Name: ", Label.RIGHT);
				Label passp=new Label("Password: ",Label.RIGHT);
				name=new TextField(12);
				pass=new TextField(8);
				pass.setEchoChar('?');
				
				add(namep);
				add(name);
				add(passp);
				add(pass);
				
				name.addActionListener(this);
				pass.addActionListener(this);
				
				addWindowListener(new WindowAdapter(){
					public void WindowClosing(WindowEvent we){
						System.exit(0);
					}
			});
	}
	public void actionperformed(ActionEvent ae){
		repaint();
	}

	public coid paint(Graphics g){
		g.drawString("Name: "+name.getText(),20,100);
		g.drawString("Selected text in name: "+name.getSelectedText(),20,120);
		g.drawString("Password: "+pass.getText(),20,140);
	}
	public static void main(String[] args){
		TextFieldDemo appwin=new TestFieldDemo();
		
		appwin.setSize(new Dimension(380,180));
		appwin.setTitle("TextFieldDemo");
		appwin.setVisible(true);
	 }
	}
					
