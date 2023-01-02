import java.awt.*;  
import java.awt.event.*;
import java.util.Random;
class NumberGuess extends Frame implements ActionListener
{  
	int n,count=0;
	TextField tf;
	Label l,l1,l2;
	Button b;
	int i;
	public NumberGuess(int nn)
	{  

		i=0;
		n=nn;
		l2=new Label("Guess the number between 0 & 20");
		tf=new TextField();
		l=new Label("Please Enter Your Guess");
		l1=new Label("                                      ");
		b=new Button("click me"); 
		l2.setBounds(10,50,500,30);
		l.setBounds(10,80,200,30);
		tf.setBounds(250,80,200,30); 
		b.setBounds(70,120,80,30);// setting button position  
		l1.setBounds(10,150,200,30);
		add(l2);
		add(l);
		add(tf);
		add(b);//adding button into frame
		l1.setBounds(100,150,500,30);
		add(l1);
		b.addActionListener(this);
		setSize(500,500);//frame size 300 width and 300 height  
		setLayout(null);//no layout manager  
		setVisible(true);//now frame will be visible, by default not visible  
		addWindowListener(new WindowAdapter()
		{  
            public void windowClosing(WindowEvent e) 
            {  
                dispose(); 
            }
        });  
	}  
	public void actionPerformed(ActionEvent ae)
	{
		
      	boolean flag=false;
      	int ug=Integer.parseInt(tf.getText());
        if(n==ug)
         {
            l1.setText("Correct");
            flag=true;
            //break;

         }
         else if(ug<n)
         {
            l1.setText("Sorry!! your guess is less than the number");
            i++;
            
         }
         else
         {

            l1.setText("Sorry!! your guess is greater than the number");
            i++;
         }
         if(flag==false && i>2)
         {
         	l1.setText ("Better Luck Next Time !! the number was "+n);
         	b.setEnabled(false);
         }
      

	}
	public static void main(String args[])
	{  
		Random r = new Random();
      	int n=r.nextInt(20);
      	NumberGuess f=new NumberGuess(n);  
	}
}  