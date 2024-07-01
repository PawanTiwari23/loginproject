import java.awt.*;
class Login extends Frame
{
Login()
{
this.setSize(300,300);
this.setVisible(true);
this.setLayout(new FlowLayout());


Label l1=new Label("User Name");
Label l2=new Label("password");

TextField tf1=new TextField(15);
TextField tf2=new TextField(15);

Button b1=new Button("Login");
Button b2=new Button("Cancel");
add(l1);
add(tf1);
add(l2);
add(tf2);
add(b1);
add(b2);
}
public static void main(String [] args)
{
new Login();
}
}