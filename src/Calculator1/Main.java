package  Calculator1;
import java.math.BigInteger;
import java.util.Stack;

import javax.script.*;

import javafx .application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;

/*
 * @author rania && Doaa &&Menna &&Nada
 */
public class Main  extends Application
{
	/**
	 *Calculator Buttons .
	 */
	TextField t; 
	Button ac, del, sin, cos,tan; Button sinh;  Button openbracket;
	Button log;  Button ln;   Button sqrt;  Button e1;   Button a3;
	Button num7; Button num8; Button num9;  Button div; Button cosh;
	Button num4; Button num5; Button num6;  Button mal; Button x1;
	Button num1; Button num2; Button num3;  Button muns;Button pi;
	Button dot;  Button num0; Button equal; Button add; 
	           Button closedbracket;   Button tanh;
	
	

	/**
	 * 
	 *
	 * this function takes in a st and design the GUI.
	 * @param st Stage
	 */
@Override
public void start (Stage st)
{
  
	BorderPane bp=new BorderPane();
	
	
	t=new TextField(" "); 
    t.setEditable(false);
	/*t.setStyle("-fx-background-color:black;");
    t.setStyle("-fx-color:white;");*/
	t.setPrefSize(270, 70);
	t.setAlignment(Pos.CENTER_RIGHT);
	t.setStyle("-fx-font-size:20;");
    bp.setTop(t);
    
	
	HBox h1=new HBox();
	ac=new Button("Ac");ac.setPrefSize(195, 40);ac.setStyle("-fx-color:#a63730;-fx-font-size:18;");
	del=new Button("DEL");del.setPrefSize(60, 40);del.setStyle("-fx-color:#9ca2a2;-fx-font-size:18;");
	
   	h1.getChildren().addAll(ac,del);
	h1.setSpacing(8);
	
	HBox h2=new HBox();
	num7=new Button(" 7 ");num7.setPrefSize(60, 40);num7.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	num8=new Button(" 8 ");num8.setPrefSize(60, 40);num8.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	num9=new Button(" 9 ");num9.setPrefSize(60, 40);num9.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	mal =new Button(" * ");mal.setPrefSize(60, 40);mal.setStyle("-fx-color:#9ca2a2;-fx-font-size:18;");
	h2.getChildren().addAll(num7,num8,num9,mal);
	h2.setSpacing(8);
	

	HBox h3=new HBox();
	num4=new Button(" 4 ");num4.setPrefSize(60, 40);num4.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	num5=new Button(" 5 ");num5.setPrefSize(60, 40);num5.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	num6=new Button(" 6 ");num6.setPrefSize(60, 40);num6.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	muns =new Button(" - ");muns.setPrefSize(60, 40);muns.setStyle("-fx-color:#9ca2a2;-fx-font-size:18;");
	h3.getChildren().addAll(num4,num5,num6,muns);
	h3.setSpacing(8);
	
	HBox h4=new HBox();
    num1=new Button(" 1 ");num1.setPrefSize(60, 40);num1.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	num2=new Button(" 2 ");num2.setPrefSize(60, 40);num2.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	num3=new Button(" 3 ");num3.setPrefSize(60, 40);num3.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	add =new Button(" + ");add.setPrefSize(60, 40);add.setStyle("-fx-color:#9ca2a2;-fx-font-size:18;");
	h4.getChildren().addAll(num1,num2,num3,add);
	h4.setSpacing(8);
	
	HBox h5=new HBox();
    dot=new Button(" . ");dot.setPrefSize(60, 40);dot.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	num0=new Button(" 0 ");num0.setPrefSize(60, 40);num0.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	div=new Button(" ÷ ");div.setPrefSize(60, 40);div.setStyle("-fx-color:#9ca2a2;-fx-font-size:18;");

	equal=new Button(" = ");equal.setPrefSize(60, 40);equal.setStyle("-fx-color:#db7628;-fx-font-size:18;");
	h5.getChildren().addAll(dot,num0,equal,div);
	h5.setSpacing(8);
	
	VBox vx=new VBox();
	vx.getChildren().addAll(h1,h2,h3,h4,h5);
	bp.setRight(vx);
	vx.setSpacing(10);
	
	
	HBox h6=new HBox();
    sin=new Button("sin");sin.setPrefSize(60, 40);sin.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	cos=new Button("cos");cos.setPrefSize(60, 40);cos.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	tan=new Button("tan");tan.setPrefSize(60, 40);tan.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	h6.getChildren().addAll(sin,cos,tan);
	h6.setSpacing(8);
	
	HBox h7=new HBox();
        log=new Button("log");log.setPrefSize(60, 40);log.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	ln=new Button("ln");ln.setPrefSize(60, 40);ln.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	e1=new Button("e");e1.setPrefSize(60, 40);e1.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	h7.getChildren().addAll(log,ln,e1);
	h7.setSpacing(8);
	
	HBox h8=new HBox();
	sqrt =new Button("sqrt");sqrt.setPrefSize(60, 40);sqrt.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	a3 =new Button("%");a3.setPrefSize(60, 40);a3.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	x1=new Button("x!");x1.setPrefSize(60, 40);x1.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	h8.getChildren().addAll(sqrt,a3,x1);
	h8.setSpacing(8);
	
	HBox h9=new HBox();
	pi=new Button(" PI ");pi.setPrefSize(60, 40);pi.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	closedbracket =new Button("(");closedbracket.setPrefSize(60, 40);closedbracket.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	openbracket =new Button(")");openbracket.setPrefSize(60, 40);openbracket.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	h9.getChildren().addAll(closedbracket,openbracket,pi);
	h9.setSpacing(8);
	
	HBox h10=new HBox();
	sinh =new Button("sinh");sinh.setPrefSize(60, 40);sinh.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	cosh =new Button("cosh");cosh.setPrefSize(62, 40);cosh.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	tanh =new Button("tanh");tanh.setPrefSize(60, 40);tanh.setStyle("-fx-color:#e7e7e7;-fx-font-size:18;");
	h10.getChildren().addAll(sinh,cosh,tanh);
	h10.setSpacing(8);
	
	VBox vx2=new VBox();
	vx2.getChildren().addAll(h6,h10,h8,h7,h9);
	bp.setLeft(vx2);
	vx2.setSpacing(10);
	 
	   
	   num1.setOnAction(e->{t.setText(t.getText()+"1");});
	   num2.setOnAction(e->{t.setText(t.getText()+"2");});
	   num3.setOnAction(e->{t.setText(t.getText()+"3");});
	   num4.setOnAction(e->{t.setText(t.getText()+"4");});
	   num5.setOnAction(e->{t.setText(t.getText()+"5");});
	   num6.setOnAction(e->{t.setText(t.getText()+"6");});
	   num7.setOnAction(e->{t.setText(t.getText()+"7");});
	   num8.setOnAction(e->{t.setText(t.getText()+"8");});
	   num9.setOnAction(e->{t.setText(t.getText()+"9");});
	   num0.setOnAction(e->{t.setText(t.getText()+"0");});
	   dot.setOnAction(e->{t.setText(t.getText()+".");});
	   equal.setOnAction(e->{calculate(t.getText());});
	   div.setOnAction(e->{t.setText(t.getText()+" / ");});
	   mal.setOnAction(e->{t.setText(t.getText()+" * ");});
	   add.setOnAction(e->{t.setText(t.getText()+" + ");});
	   muns.setOnAction(e->{t.setText(t.getText()+" - ");});
	   sqrt.setOnAction(e->{t.setText(t.getText()+"sqrt( ");});
	   ac.setOnAction(e->{t.setText(" ");});
	   del.setOnAction(e->{
		   if(t.getText().length()>1)
			   t.setText(t.getText().substring(0, t.getText().length()-1));}
	   );
	   sin.setOnAction(e->{t.setText(t.getText()+"sin( ");});
	   cos.setOnAction(e->{t.setText(t.getText()+"cos( ");});
	   tan.setOnAction(e->{t.setText(t.getText()+"tan( ");});
	   sinh.setOnAction(e->{t.setText(t.getText()+"sinh( ");});
	   cosh.setOnAction(e->{t.setText(t.getText()+"cosh( ");});
	   tanh.setOnAction(e->{t.setText(t.getText()+"tanh( ");});
	   log.setOnAction(e->{t.setText(t.getText()+"log( ");});
	   ln.setOnAction(e->{t.setText(t.getText()+"ln( ");});
	   a3.setOnAction(e->{t.setText(t.getText()+" % ");});  //%
	   x1.setOnAction(e->{t.setText(t.getText()+" )!");});  //!
	   pi.setOnAction(e->{t.setText(t.getText()+" PI ");});  
	   openbracket.setOnAction(e->{t.setText(t.getText()+" ) ");});
	   closedbracket.setOnAction(e->{t.setText(t.getText()+" ( ");});
	  
	   
	  
	     Scene sc=new Scene(bp,480,315);
	     st.setScene(sc);
	     st.show();
   
}

	
	    	/**
	    	 * @param args String
	    	 * Lunch code
	    	 */
    
    public static void main(String[] args) {
		launch(args);
	}

    /////////////////////////////////////
    /**
     * this function takes in exp and calculate scientific functions
     * @param exp String
     */
    private void calculate(String exp)
    {
		double cal = 0;
		exp = exp.replaceAll("PI", ""+Math.PI);
		

		Stack st = new Stack();
		st.push('(');
		try
		{
			for(int i=0;i<exp.length();i++)
			{
				if(exp.charAt(i)==')') 
				{
					String s = ")";
					while(!st.peek().equals('('))
						s = st.pop() + s;
					s = st.pop() + s;
					if(st.peek().equals('t')) 			//sqrt()
					{
						while(!st.peek().equals('s')) 
							st.pop();st.pop();
						st.push(Math.sqrt(evaluateExp(s)));						
					}
					else if(st.peek().equals('g'))    //log() or ln()
					{
						st.pop();
						if(st.peek().equals('o'))    // log()
						{
							st.pop();st.pop();
							st.push(Math.log10(evaluateExp(s)));	
						}
						/*else    					//lg()
						{
							st.pop();
							st.push(Math.log10(evaluateExp(s))/Math.log10(2));
						}*/
					}
					
					
					else if(st.peek().equals('h'))    //cosh or sinh or tanh
					{
						st.pop();st.pop();st.pop();
						if(st.peek().equals('s'))    //sinh
						{
							st.pop();
							st.push(Math.sinh(evaluateExp(s)));	
						}
						else if(st.peek().equals('c'))  //cosh
						{
							st.pop();
							st.push(Math.cosh(evaluateExp(s)));	
						}
						else if(st.peek().equals('t'))   //tanh
						{
							st.pop();
							st.push(Math.tanh(evaluateExp(s)));	
						}
					}
					else if(st.peek().equals('n'))     //sin or  tan
					{
						st.pop();
						if(st.peek().equals('l'))   					//ln()
						{
							st.pop();
							st.push(Math.log10(evaluateExp(s))/Math.log(evaluateExp(s)));
							
						}
						else{
						st.pop();
						if(st.peek().equals('s'))   	//sin
						{
							st.pop();
							st.push(Math.sin(Math.toRadians(evaluateExp(s))));	
						}
						else if(st.peek().equals('t'))   //tan
						{
							st.pop();
							st.push(Math.tan(evaluateExp(s)));	
						}
						}
					}
					//////////
					
					
					else if(st.peek().equals('s'))   // cos
					{
						st.pop();st.pop();st.pop();
						st.push(Math.cos(evaluateExp(s)));
					}
					else if(exp.charAt(i+1)=='^')    // ()^2
					{
						st.push(Math.pow(evaluateExp(s),2));
						i+=2;
					}
					else if(exp.charAt(i+1)=='!')    // ()!
					{
						BigInteger factorial = new BigInteger("1");
						long last_num = (long) evaluateExp(s);
						for(long k=1; k<= last_num;k++)
							factorial=factorial.multiply(new BigInteger(""+k));
						st.push(factorial);
						i++;
					}
					else
						st.push(evaluateExp(s)); //( + * - / )
				}
				else
					st.push(exp.charAt(i));
			}
		String s = " ) ";
		while(!st.isEmpty())
			s = st.pop() + s;
	    cal = evaluateExp(s);
		}
		catch(Exception e)
		{
			t.setText("Error");return ;
		}
    	if(new Double(cal).isInfinite())
    		{t.setText(" Infinity");}
    	else
    		{t.setText(" "+cal);}
    }
    /**
     * this function takes in exp and calculate Basic operation in priority
     * @param exp String
     */
    private double evaluateExp(String exp)
    {
    	boolean contain_operand = true;
    	exp = exp.replace("(", "");
	   	exp = exp.replace(")", "");
    	while(contain_operand)
    	{
		 	char last;
		   	double op1=0,op2=0;
		   	exp = exp.replaceAll("  ", " ");
		   	contain_operand = exp.contains(" + ") || exp.contains(" - ") ||
    			exp.contains(" * ") || exp.contains(" / ") ||exp.contains(" % ");
		   	if(contain_operand)
		   	{
			   	String[] op = exp.split(" ");
			   	if(op[1].equals("-"))
			   	{
			   		exp = exp.replace(" ", "");
			   		return new Double(exp.substring(0));
			   	}
			   	//handle the first operation
			   	op1 = new Double(op[1]);
			   	last = op[2].charAt(0);
			   	op2 = new Double(op[3]);
			   	//handle and calculate the next operation
			   	for(int i = 4;i<op.length;i++)
			   	{
			   		if(op[i].charAt(0)=='+' || op[i].charAt(0)=='-')
			   		{
			 			switch(last)
			   			{
			   				case'+':op1 += op2; break;
			   				case'-':op1 -= op2; break;
			   				case'*':op1 *= op2; break;
			   				case'/':op1 /= op2; break;
			   				case'%':op1 %= op2; break;
			   			}
			   			op2 = new Double(op[i+1]);
			   			last = op[i].charAt(0);
			   		}
			   		else if(op[i].charAt(0)=='*' || op[i].charAt(0)=='/' || op[i].charAt(0)=='%')
			   		{
			   			if(op[i].charAt(0) == '*')
			   				op2 *= new Double(op[i+1]);
			   			else if(op[i].charAt(0) == '/')
			   				op2 /= new Double(op[i+1]);
			   			else 
			   				op2 %= new Double(op[i+1]);
			   		}
			   	}		    	
			   	//calculate the last operation in priority
			   	switch(last)
				{
					case'+':op1 += op2; break;
					case'-':op1 -= op2; break;
					case'*':op1 *= op2; break;
					case'/':op1 /= op2; break;
					case'%':op1 %= op2; break;
				}		    	
			   	exp = ""+op1;	
			   	}
		     }
    		return new Double(exp);
    	}

}