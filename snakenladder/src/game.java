
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
class players{
public int position=1;
public String name;

}
public class game extends JFrame {
	
	/**
	 * 
	 */
	
	private int k;
	private int nop=4;
	private int point;
    private int pos;
    int flag=1;
    private int p;
	private JLabel lbl91;
	private JLabel lbl92;
	private JLabel lbl93;
	private JLabel lbl94;
	private JLabel lbl95;
	private JLabel lbl96;
	private JLabel lbl97;
	private JLabel lbl98;
	private JLabel lbl100;
	private JLabel lbl99;
	private JLabel lbl90;
	private JLabel lbl89;
	private JLabel lbl88;
	private JLabel lbl87;
	private JLabel lbl86;
	private JLabel lbl85;
	private JLabel lbl84;
	private JLabel lbl83;
	private JLabel lbl81;
	private JLabel lbl82;
	private JLabel lbl71;
	private JLabel lbl72;
	private JLabel lbl73;
	private JLabel lbl74;
	private JLabel lbl75;
	private JLabel lbl76;
	private JLabel lbl77;
	private JLabel lbl78;
	private JLabel lbl80;
	private JLabel lbl79;
	private JLabel lbl70;
	private JLabel lbl69;
	private JLabel lbl68;
	private JLabel lbl67;
	private JLabel lbl66;
	private JLabel lbl65;
	private JLabel lbl64;
	private JLabel lbl63;
	private JLabel lbl61;
	private JLabel lbl62;
	private JLabel lbl51;
	private JLabel lbl52;
	private JLabel lbl53;
	private JLabel lbl54;
	private JLabel lbl55;
	private JLabel lbl56;
	private JLabel lbl57;
	private JLabel lbl58;
	private JLabel lbl60;
	private JLabel lbl59;
	private JLabel lbl50;
	private JLabel lbl49;
	private JLabel lbl48;
	private JLabel lbl47;
	private JLabel lbl46;
	private JLabel lbl45;
	private JLabel lbl44;
	private JLabel lbl43;
	private JLabel lbl41;
	private JLabel lbl42;
	private JLabel lbl31;
	private JLabel lbl32;
	private JLabel lbl33;
	private JLabel lbl34;
	private JLabel lbl35;
	private JLabel lbl36;
	private JLabel lbl37;
	private JLabel lbl38;
	private JLabel lbl40;
	private JLabel lbl39;
	private JLabel lbl30;
	private JLabel lbl29;
	private JLabel lbl28;
	private JLabel lbl27;
	private JLabel lbl26;
	private JLabel lbl25;
	private JLabel lbl24;
	private JLabel lbl23;
	private JLabel lbl21;
	private JLabel lbl22;
	private JLabel lbl11;
	private JLabel lbl12;
	private JLabel lbl13;
	private JLabel lbl14;
	private JLabel lbl15;
	private JLabel lbl16;
	private JLabel lbl17;
	private JLabel lbl18;
	private JLabel lbl20;
	private JLabel lbl19;
	private JLabel lbl10;
	private JLabel lbl9;
	private JLabel lbl8;
	private JLabel lbl7;
	private JLabel lbl6;
	private JLabel lbl5;
	private JLabel lbl4;
	private JLabel lbl3;
	private JLabel lbl2;
	private JLabel lbl1;
	private  JLabel lblBoard;
	private JPanel contentPane;
	private JLabel head;
	private JButton rollbutton;
   
    private JLabel displayroll;
    private JLabel lblpos1;
    private JLabel lblpos2;
    private JLabel lblpos3;
    private JLabel lblrollpalyersymbol;
    private JLabel lblpos4;
    private JLabel lblplayer4symbol;
    private JLabel lblplayer3symbol;
    private JLabel lblplayer2symbol;
    private JLabel lblplayer1symbol;
    private JLabel lblplayer1;
    private JLabel lblpayer2;
    private JLabel lblplayer3;
    private JLabel lblPlayer4;
    private JLabel lblsnake;
    private JLabel lblwinningmessage;
    private JLabel lblrestartmessage;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					game frame = new game();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void dice() {
		Random rn = new Random();
		point = rn.nextInt(6)+1;

		String dice = String.valueOf(point);
		String location = "/Images/dice "+dice+".jpg";
		displayroll.setIcon(new ImageIcon(game.class.getResource(location)));
		displayroll.setVisible(true);
		}
	
	public void RemoveImage(int x){
		
		if(x == 1){
			lbl1.setVisible(false);
		}
		else if(x == 2){
			lbl2.setVisible(false);
		}
		else if(x == 3){
			lbl3.setVisible(false);
		}
		else if(x == 4){
			lbl4.setVisible(false);
		}
		else if(x == 5){
			lbl5.setVisible(false);
		}
		else if(x == 6){
			lbl6.setVisible(false);
		}
		else if(x == 7){
			lbl7.setVisible(false);
		}
		else if(x == 8){
			lbl8.setVisible(false);
		}
		else if(x == 9){
			lbl9.setVisible(false);
		}
		else if(x == 10){
			lbl10.setVisible(false);
		}
		else if(x == 11){
			lbl11.setVisible(false);
		}
		else if(x == 12){
			lbl12.setVisible(false);
		}
		else if(x == 13){
			lbl13.setVisible(false);
		}
		else if(x == 14){
			lbl14.setVisible(false);
		}
		else if(x == 15){
			lbl15.setVisible(false);
		}
		else if(x == 16){
			lbl16.setVisible(false);
		}
		else if(x == 17){
			lbl17.setVisible(false);
		}
		else if(x == 18){
			lbl18.setVisible(false);
		}
		else if(x == 19){
			lbl19.setVisible(false);
		}
		else if(x == 20){
			lbl20.setVisible(false);
		}
		else if(x == 21){
			lbl21.setVisible(false);
		}
		else if(x == 22){
			lbl22.setVisible(false);
		}
		else if(x == 23){
			lbl23.setVisible(false);
		}
		else if(x == 24){
			lbl24.setVisible(false);
		}
		else if(x == 25){
			lbl25.setVisible(false);
		}
		else if(x == 26){
			lbl26.setVisible(false);
		}
		else if(x == 27){
			lbl27.setVisible(false);
		}
		else if(x == 28){
			lbl28.setVisible(false);
		}
		else if(x == 29){
			lbl29.setVisible(false);
		}
		else if(x == 30){
			lbl30.setVisible(false);
		}
		else if(x == 31){
			lbl31.setVisible(false);
		}
		else if(x == 32){
			lbl32.setVisible(false);
		}
		else if(x == 33){
			lbl33.setVisible(false);
		}
		else if(x == 34){
			lbl34.setVisible(false);
		}
		else if(x == 35){
			lbl35.setVisible(false);
		}
		else if(x == 36){
			lbl36.setVisible(false);
		}
		else if(x == 37){
			lbl37.setVisible(false);
		}
		else if(x == 38){
			lbl38.setVisible(false);
		}
		else if(x == 39){
			lbl39.setVisible(false);
		}
		else if(x == 40){
			lbl40.setVisible(false);
		}
		else if(x == 41){
			lbl41.setVisible(false);
		}
		else if(x == 42){
			lbl42.setVisible(false);
		}
		else if(x == 43){
			lbl43.setVisible(false);
		}
		else if(x == 44){
			lbl44.setVisible(false);
		}
		else if(x == 45){
			lbl45.setVisible(false);
		}
		else if(x == 46){
			lbl46.setVisible(false);
		}
		else if(x == 47){
			lbl47.setVisible(false);
		}
		else if(x == 48){
			lbl48.setVisible(false);
		}
		else if(x == 49){
			lbl49.setVisible(false);
		}
		else if(x == 50){
			lbl50.setVisible(false);
		}


		else if(x == 51){
			lbl51.setVisible(false);
		}
		else if(x == 52){
			lbl52.setVisible(false);
		}
		else if(x == 53){
			lbl53.setVisible(false);
		}
		else if(x == 54){
			lbl54.setVisible(false);
		}
		else if(x == 55){
			lbl55.setVisible(false);
		}
		else if(x == 56){
			lbl56.setVisible(false);
		}
		else if(x == 57){
			lbl57.setVisible(false);
		}
		else if(x == 58){
			lbl58.setVisible(false);
		}
		else if(x == 59){
			lbl59.setVisible(false);
		}
		else if(x == 60){
			lbl60.setVisible(false);
		}

		else if(x == 61){
			lbl61.setVisible(false);
		}
		else if(x == 62){
			lbl62.setVisible(false);
		}
		else if(x == 63){
			lbl63.setVisible(false);
		}
		else if(x == 64){
			lbl64.setVisible(false);
		}
		else if(x == 65){
			lbl65.setVisible(false);
		}
		else if(x == 66){
			lbl66.setVisible(false);
		}
		else if(x == 67){
			lbl67.setVisible(false);
		}
		else if(x == 68){
			lbl68.setVisible(false);
		}
		else if(x == 69){
			lbl69.setVisible(false);
		}
		else if(x == 70){
			lbl70.setVisible(false);
		}

		else if(x == 71){
			lbl71.setVisible(false);
		}
		else if(x == 72){
			lbl72.setVisible(false);
		}
		else if(x == 73){
			lbl73.setVisible(false);
		}
		else if(x == 74){
			lbl74.setVisible(false);
		}
		else if(x == 75){
			lbl75.setVisible(false);
		}
		else if(x == 76){
			lbl76.setVisible(false);
		}
		else if(x == 77){
			lbl77.setVisible(false);
		}
		else if(x == 78){
			lbl78.setVisible(false);
		}
		else if(x == 79){
			lbl79.setVisible(false);
		}
		else if(x == 80){
			lbl80.setVisible(false);
		}

		else if(x == 81){
			lbl81.setVisible(false);
		}
		else if(x == 82){
			lbl82.setVisible(false);
		}
		else if(x == 83){
			lbl83.setVisible(false);
		}
		else if(x == 84){
			lbl84.setVisible(false);
		}
		else if(x == 85){
			lbl85.setVisible(false);
		}
		else if(x == 86){
			lbl86.setVisible(false);
		}
		else if(x == 87){
			lbl87.setVisible(false);
		}
		else if(x == 88){
			lbl88.setVisible(false);
		}
		else if(x == 89){
			lbl89.setVisible(false);
		}
		else if(x == 90){
			lbl90.setVisible(false);
		}

		else if(x == 91){
			lbl91.setVisible(false);
		}
		else if(x == 92){
			lbl92.setVisible(false);
		}
		else if(x == 93){
			lbl93.setVisible(false);
		}
		else if(x == 94){
			lbl94.setVisible(false);
		}
		else if(x == 95){
			lbl95.setVisible(false);
		}
		else if(x == 96){
			lbl96.setVisible(false);
		}
		else if(x == 97){
			lbl97.setVisible(false);
		}
		else if(x == 98){
			lbl98.setVisible(false);
		}
		else if(x == 99){
			lbl99.setVisible(false);
		}
		else if(x == 100){
			lbl100.setVisible(false);
		}
	} //get current player symbol
	public void currentplayersymbol(int k) {
		String location="/Images/Player "+k+".png";
		lblrollpalyersymbol.setIcon(new ImageIcon(game.class.getResource(location)));
	}
 	//display position of player
	 public void displayposition() {
		 if(flag==1)    lblpos1.setText(String.valueOf(pos));
		 else if(flag==2)    lblpos2.setText(String.valueOf(pos));
		 else if(flag==3)    lblpos3.setText(String.valueOf(pos));
		 else if(flag==4)    lblpos4.setText(String.valueOf(pos));
		 
	 }
	
	
     public void SetImage(int x, int p){ 
    	 
  

	   

		String location = "/Images/Player "+p+".png";
		
		

		if(x == 1){
			lbl1.setVisible(true);
			lbl1.setIcon(new ImageIcon(game.class.getResource(location)));
		
		}
		else if(x == 2){
			lbl2.setVisible(true);
			lbl2.setIcon(new ImageIcon(game.class.getResource(location)));
			
		}
		else if(x == 3){
			lbl3.setVisible(true);
			lbl3.setIcon(new ImageIcon(game.class.getResource(location)));
			
		}
		else if(x == 4){
			lbl4.setVisible(true);
			lbl4.setIcon(new ImageIcon(game.class.getResource(location)));
			
		}
		else if(x == 5){
			lbl5.setVisible(true);
			lbl5.setIcon(new ImageIcon(game.class.getResource(location)));
			
		}
		else if(x == 6){
			lbl6.setVisible(true);
			lbl6.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 7){
			lbl7.setVisible(true);
			lbl7.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 8){
			lbl8.setVisible(true);
			lbl8.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 9){
			lbl9.setVisible(true);
			lbl9.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 10){
			lbl10.setVisible(true);
			lbl10.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 11){
			lbl11.setVisible(true);
			lbl11.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 12){
			lbl12.setVisible(true);
			lbl12.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 13){
			lbl13.setVisible(true);
			lbl13.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 14){
			lbl14.setVisible(true);
			lbl14.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 15){
			lbl15.setVisible(true);
			lbl15.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 16){
			lbl16.setVisible(true);
			lbl16.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 17){
			lbl17.setVisible(true);
			lbl17.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 18){
			lbl18.setVisible(true);
			lbl18.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 19){
			lbl19.setVisible(true);
			lbl19.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 20){
			lbl20.setVisible(true);
			lbl20.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 21){
			//snake
			lblsnake.setVisible(true);
			lbl21.setVisible(true);
			lbl21.setIcon(new ImageIcon(game.class.getResource(location)));
			JOptionPane.showMessageDialog(null, "player "+flag+" eaten by a snake at "+x);
			lbl21.setVisible(false);
			lbl2.setVisible(true);
			lbl2.setIcon(new ImageIcon(game.class.getResource(location)));
			pos=2;
		}
		else if(x == 22){
			lbl22.setVisible(true);
			lbl22.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 23){
			//ladder 42
			lbl23.setVisible(true);
			lbl23.setIcon(new ImageIcon(game.class.getResource(location)));
			pos=42;
			JOptionPane.showMessageDialog(null, "player "+flag+" climbed the ladder from "+x+" to "+pos);
			lbl23.setVisible(false);
			lbl42.setVisible(true);
			lbl42.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 24){
			lbl24.setVisible(true);
			lbl24.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 25){
			lbl25.setVisible(true);
			lbl25.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 26){
			lbl26.setVisible(true);
			lbl26.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 27){
			//snake
			lblsnake.setVisible(true);
			lbl27.setVisible(true);
			lbl27.setIcon(new ImageIcon(game.class.getResource(location)));
			JOptionPane.showMessageDialog(null, "player "+flag+" eaten by a snake at "+x);
			lbl27.setVisible(false);
			lbl15.setVisible(true);
			lbl15.setIcon(new ImageIcon(game.class.getResource(location)));
			pos=15;
		}
		else if(x == 28){
			lbl28.setVisible(true);
			lbl28.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 29){
			lbl29.setVisible(true);
			lbl29.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 30){
			lbl30.setVisible(true);
			lbl30.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 31){
			lbl31.setVisible(true);
			lbl31.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 32){
			//ladder 51
			lbl32.setVisible(true);
			lbl32.setIcon(new ImageIcon(game.class.getResource(location)));
			pos=51;
			JOptionPane.showMessageDialog(null, "player "+flag+" climbed the ladder from "+x+" to "+pos);
			lbl32.setVisible(false);
			lbl51.setVisible(true);
			lbl51.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 33){
			lbl33.setVisible(true);
			lbl33.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 34){
			lbl34.setVisible(true);
			lbl34.setIcon(new ImageIcon(game.class.getResource(location)));
			
		}
		else if(x == 35){
			lbl35.setVisible(true);
			lbl35.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 36){
			lbl36.setVisible(true);
			lbl36.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 37){
			lbl37.setVisible(true);
			lbl37.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 38){
			lbl38.setVisible(true);
			lbl38.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 39){
			lbl39.setVisible(true);
			lbl39.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 40){
			lbl40.setVisible(true);
			lbl40.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 41){
			lbl41.setVisible(true);
			lbl41.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 42){
			lbl42.setVisible(true);
			lbl42.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 43){
			lbl43.setVisible(true);
			lbl43.setIcon(new ImageIcon(game.class.getResource(location)));
			
		}
		else if(x == 44){
			lbl44.setVisible(true);
			lbl44.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 45){
			lbl45.setVisible(true);
			lbl45.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 46){
			lbl46.setVisible(true);
			lbl46.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 47){
			//snake 
			lblsnake.setVisible(true);
			lbl47.setVisible(true);
			lbl47.setIcon(new ImageIcon(game.class.getResource(location)));
			JOptionPane.showMessageDialog(null, "player "+flag+" eaten by a snake at "+x);
			lbl47.setVisible(false);
			lbl29.setVisible(true);
			lbl29.setIcon(new ImageIcon(game.class.getResource(location)));
			pos=29;
		}
		else if(x == 48){
			lbl48.setVisible(true);
			lbl48.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 49){
			lbl49.setVisible(true);
			lbl49.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 50){
			lbl50.setVisible(true);
			lbl50.setIcon(new ImageIcon(game.class.getResource(location)));
		}


		else if(x == 51){
			lbl51.setVisible(true);
			lbl51.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 52){
			lbl52.setVisible(true);
			lbl52.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 53){
			lbl53.setVisible(true);
			lbl53.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 54){
			lbl54.setVisible(true);
			lbl54.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 55){
			lbl55.setVisible(true);
			lbl55.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 56){
			//snake 37
			lblsnake.setVisible(true);
			lbl56.setVisible(true);
			lbl56.setIcon(new ImageIcon(game.class.getResource(location)));
			JOptionPane.showMessageDialog(null, "player "+flag+" eaten by a snake at "+x);
			lbl56.setVisible(false);
			lbl37.setVisible(true);
			lbl37.setIcon(new ImageIcon(game.class.getResource(location)));
			pos=37;
		}
		else if(x == 57){
			lbl57.setVisible(true);
			lbl57.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 58){
			lbl58.setVisible(true);
			lbl58.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 59){
			lbl59.setVisible(true);
			lbl59.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 60){
			lbl60.setVisible(true);
			lbl60.setIcon(new ImageIcon(game.class.getResource(location)));
		}

		else if(x == 61){
			//ladder 79
			lbl61.setVisible(true);
			lbl61.setIcon(new ImageIcon(game.class.getResource(location)));
			pos=79;
			JOptionPane.showMessageDialog(null, "player "+flag+" climbed the ladder from "+x+" to "+pos);
			lbl61.setVisible(false);
			lbl79.setVisible(true);
			lbl79.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 62){
			lbl62.setVisible(true);
			lbl62.setIcon(new ImageIcon(game.class.getResource(location)));
			
		}
		else if(x == 63){
			lbl63.setVisible(true);
			lbl63.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 64){
			lbl64.setVisible(true);
			lbl64.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 65){
			//ladder 84
			lbl65.setVisible(true);
			lbl65.setIcon(new ImageIcon(game.class.getResource(location)));
			pos=84;
			JOptionPane.showMessageDialog(null, "player "+flag+" climbed the ladder from "+x+" to "+pos);
			lbl65.setVisible(false);
			lbl84.setVisible(true);
			lbl84.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 66){
			lbl66.setVisible(true);
			lbl66.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 67){
			lbl67.setVisible(true);
			lbl67.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 68){
			lbl68.setVisible(true);
			lbl68.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 69){
			lbl69.setVisible(true);
			lbl69.setIcon(new ImageIcon(game.class.getResource(location)));
			
		}
		else if(x == 70){
			lbl70.setVisible(true);
			lbl70.setIcon(new ImageIcon(game.class.getResource(location)));
		}

		else if(x == 71){
			lbl71.setVisible(true);
			lbl71.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 72){
			lbl72.setVisible(true);
			lbl72.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 73){
			lbl73.setVisible(true);
			lbl73.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 74){
			//snake 46
			lblsnake.setVisible(true);
			lbl74.setVisible(true);
			lbl74.setIcon(new ImageIcon(game.class.getResource(location)));
			JOptionPane.showMessageDialog(null, "player "+flag+" eaten by a snake at "+x);
			lbl74.setVisible(false);
			lbl46.setVisible(true);
			lbl46.setIcon(new ImageIcon(game.class.getResource(location)));
			pos=46;
		}
		else if(x == 75){
			//ladder 96
			lbl75.setVisible(true);
			lbl75.setIcon(new ImageIcon(game.class.getResource(location)));
			pos=96;
			JOptionPane.showMessageDialog(null, "player "+flag+" climbed the ladder from "+x+" to "+pos);
			lbl75.setVisible(false);
			lbl96.setVisible(true);
			lbl96.setIcon(new ImageIcon(game.class.getResource(location)));
			
		}
		else if(x == 76){
			lbl76.setVisible(true);
			lbl76.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 77){
			lbl77.setVisible(true);
			lbl77.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 78){
			lbl78.setVisible(true);
			lbl78.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 79){
			lbl79.setVisible(true);
			lbl79.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 80){
			lbl80.setVisible(true);
			lbl80.setIcon(new ImageIcon(game.class.getResource(location)));
		}

		else if(x == 81){
			lbl81.setVisible(true);
			lbl81.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 82){
			lbl82.setVisible(true);
			lbl82.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 83){
			lbl83.setVisible(true);
			lbl83.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 84){
			lbl84.setVisible(true);
			lbl84.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 85){
			lbl85.setVisible(true);
			lbl85.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 86){
			lbl86.setVisible(true);
			lbl86.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 87){
			lbl87.setVisible(true);
			lbl87.setIcon(new ImageIcon(game.class.getResource(location)));
			
		}
		else if(x == 88){
			lbl88.setVisible(true);
			lbl88.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 89){
			lbl89.setVisible(true);
			lbl89.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 90){
			//snake 
			lblsnake.setVisible(true);
			lbl90.setVisible(true);
			lbl90.setIcon(new ImageIcon(game.class.getResource(location)));
			JOptionPane.showMessageDialog(null, "player "+flag+" eaten by a snake at "+x);
			lbl90.setVisible(false);
			lbl52.setVisible(true);
			lbl52.setIcon(new ImageIcon(game.class.getResource(location)));
			pos=52;
		}

		else if(x == 91){
			lbl91.setVisible(true);
			lbl91.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 92){
			lbl92.setVisible(true);
			lbl92.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 93){
			lbl93.setVisible(true);
			lbl93.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 94){
			lbl94.setVisible(true);
			lbl94.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 95){
			lbl95.setVisible(true);
			lbl95.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 96){
			lbl96.setVisible(true);
			lbl96.setIcon(new ImageIcon(game.class.getResource(location)));
			
		}
		else if(x == 97){
			lbl97.setVisible(true);
			lbl97.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 98){
			lbl98.setVisible(true);
			lbl98.setIcon(new ImageIcon(game.class.getResource(location)));
		}
		else if(x == 99){
			//snake 41
			lblsnake.setVisible(true);
			lbl99.setVisible(true);
			lbl99.setIcon(new ImageIcon(game.class.getResource(location)));
			JOptionPane.showMessageDialog(null, "player "+flag+" eaten by a snake at "+x);
			lbl99.setVisible(false);
			lbl41.setVisible(true);
			lbl41.setIcon(new ImageIcon(game.class.getResource(location)));
			pos=41;
		}
		else if(x == 100){
			lbl100.setVisible(true);
			lbl100.setIcon(new ImageIcon(game.class.getResource(location)));
		}
	}
	/**
	 * Create the frame.
	 */
	public game() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(game.class.getResource("/images/Snake0.png")));
		
		
		initialize();
	}
		
	public void initialize() {
		// to get the correct number of players.
		try{  JOptionPane.showMessageDialog(null, "Welcome!! to Snake and Ladder game developed by Ankit Joshi");
			do{				
				JOptionPane.showMessageDialog(null, "Players must be between 2-4!");
				nop = Integer.parseInt(JOptionPane.showInputDialog("Enter No of players"));
			}while(nop < 2 || nop > 4);
		}catch(Exception e){
			
			System.exit(0);// exit
		}

		
		
		//array of objects of players
		players[] player= new players[6];
		for( p=1;p<5;p++) {
			player[p]=new players();
		}
	
		try{
				
				for(p=1;p<=nop;p++) {
    					player[p].name = JOptionPane.showInputDialog("Enter Name of Player "+ String.valueOf(p)+" :");
					
				}
			}catch(Exception e){
				player[p].name="player "+p;
			}
	
				
		
		
		
		
		
	   //  design of windows frame.
		setTitle("SNAKE AND LADDER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(4000,900);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		// declaring label for snake and ladder board boxes.
		lbl1 = new JLabel("");
		lbl1.setBounds(92, 576, 60, 60);
		contentPane.add(lbl1);

		 lbl2 = new JLabel("");
		lbl2.setBounds(151, 576, 60, 60);
		contentPane.add(lbl2);

		 lbl3 = new JLabel("");
		lbl3.setBounds(211, 576, 60, 60);
		contentPane.add(lbl3);

		 lbl4 = new JLabel("");
		lbl4.setBounds(271, 576, 60, 60);
		contentPane.add(lbl4);

		 lbl5 = new JLabel("");
		lbl5.setBounds(331, 576, 60, 60);
		contentPane.add(lbl5);

		 lbl6 = new JLabel("");
		lbl6.setBounds(393, 576, 60, 60);
		contentPane.add(lbl6);

		 lbl7 = new JLabel("");
		lbl7.setBounds(453, 576, 60, 60);
		contentPane.add(lbl7);

		 lbl8 = new JLabel("");
		lbl8.setBounds(511, 576, 60, 60);
		contentPane.add(lbl8);

		 lbl9 = new JLabel("");
		lbl9.setBounds(572, 576, 60, 60);
		contentPane.add(lbl9);

		 lbl10 = new JLabel("");
		lbl10.setBounds(630, 576, 60, 60);
		contentPane.add(lbl10);

		 lbl19 = new JLabel("");
		lbl19.setBounds(151, 517, 60, 60);
		contentPane.add(lbl19);

		 lbl20 = new JLabel("");
		lbl20.setBounds(92, 517, 60, 60);
		contentPane.add(lbl20);

		 lbl18 = new JLabel("");
		lbl18.setBounds(211, 517, 60, 60);
		contentPane.add(lbl18);

		 lbl17 = new JLabel("");
		lbl17.setBounds(271, 517, 60, 60);
		contentPane.add(lbl17);

		 lbl16 = new JLabel("");
		lbl16.setBounds(331, 517, 60, 60);
		contentPane.add(lbl16);

		 lbl15 = new JLabel("");
		lbl15.setBounds(393, 517, 60, 60);
		contentPane.add(lbl15);

		 lbl14 = new JLabel("");
		lbl14.setBounds(453, 517, 60, 60);
		contentPane.add(lbl14);

		 lbl13 = new JLabel("");
		lbl13.setBounds(511, 517, 60, 60);
		contentPane.add(lbl13);

		 lbl12 = new JLabel("");
		lbl12.setBounds(572, 517, 60, 60);
		contentPane.add(lbl12);

		 lbl11 = new JLabel("");
		lbl11.setBounds(630, 517, 60, 60);
		contentPane.add(lbl11);

		 lbl22 = new JLabel("");
		lbl22.setBounds(151, 457, 60, 60);
		contentPane.add(lbl22);

		 lbl21 = new JLabel("");
		lbl21.setBounds(92, 457, 60, 60);
		contentPane.add(lbl21);

		 lbl23 = new JLabel("");
		lbl23.setBounds(211, 457, 60, 60);
		contentPane.add(lbl23);

		 lbl24 = new JLabel("");
		lbl24.setBounds(271, 457, 60, 60);
		contentPane.add(lbl24);

		 lbl25 = new JLabel("");
		lbl25.setBounds(331, 457, 60, 60);
		contentPane.add(lbl25);

		 lbl26 = new JLabel("");
		lbl26.setBounds(393, 457, 60, 60);
		contentPane.add(lbl26);

		 lbl27 = new JLabel("");
		lbl27.setBounds(453, 457, 60, 60);
		contentPane.add(lbl27);

		 lbl28 = new JLabel("");
		lbl28.setBounds(511, 457, 60, 60);
		contentPane.add(lbl28);

		 lbl29 = new JLabel("");
		lbl29.setBounds(572, 457, 60, 60);
		contentPane.add(lbl29);

		 lbl30 = new JLabel("");
		lbl30.setBounds(630, 457, 60, 60);
		contentPane.add(lbl30);

		 lbl39 = new JLabel("");
		lbl39.setBounds(151, 396, 60, 60);
		contentPane.add(lbl39);

		 lbl40 = new JLabel("");
		lbl40.setBounds(92, 396, 60, 60);
		contentPane.add(lbl40);

		 lbl38 = new JLabel("");
		lbl38.setBounds(211, 396, 60, 60);
		contentPane.add(lbl38);

		 lbl37 = new JLabel("");
		lbl37.setBounds(271, 396, 60, 60);
		contentPane.add(lbl37);

		 lbl36 = new JLabel("");
		lbl36.setBounds(331, 396, 60, 60);
		contentPane.add(lbl36);

		 lbl35 = new JLabel("");
		lbl35.setBounds(393, 396, 60, 60);
		contentPane.add(lbl35);

		 lbl34 = new JLabel("");
		lbl34.setBounds(453, 396, 60, 60);
		contentPane.add(lbl34);

		 lbl33 = new JLabel("");
		lbl33.setBounds(511, 396, 60, 60);
		contentPane.add(lbl33);

		 lbl32 = new JLabel("");
		lbl32.setBounds(572, 396, 60, 60);
		contentPane.add(lbl32);

		 lbl31 = new JLabel("");
		lbl31.setBounds(630, 396, 60, 60);
		contentPane.add(lbl31);

		 lbl42 = new JLabel("");
		lbl42.setBounds(151, 335, 60, 60);
		contentPane.add(lbl42);

		 lbl41 = new JLabel("");
		lbl41.setBounds(92, 335, 60, 60);
		contentPane.add(lbl41);

		 lbl43 = new JLabel("");
		lbl43.setBounds(211, 335, 60, 60);
		contentPane.add(lbl43);

		 lbl44 = new JLabel("");
		lbl44.setBounds(271, 335, 60, 60);
		contentPane.add(lbl44);

		 lbl45 = new JLabel("");
		lbl45.setBounds(331, 335, 60, 60);
		contentPane.add(lbl45);

		 lbl46 = new JLabel("");
		lbl46.setBounds(393, 335, 60, 60);
		contentPane.add(lbl46);

		 lbl47 = new JLabel("");
		lbl47.setBounds(453, 335, 60, 60);
		contentPane.add(lbl47);

         lbl48 = new JLabel("");
		lbl48.setBounds(511, 335, 60, 60);
		contentPane.add(lbl48);

		 lbl49 = new JLabel("");
		lbl49.setBounds(572, 335, 60, 60);
		contentPane.add(lbl49);

		 lbl50 = new JLabel("");
		lbl50.setBounds(630, 335, 60, 60);
		contentPane.add(lbl50);

		 lbl59 = new JLabel("");
		lbl59.setBounds(151, 277, 60, 60);
		contentPane.add(lbl59);

		 lbl60 = new JLabel("");
		lbl60.setBounds(92, 277, 60, 60);
		contentPane.add(lbl60);

		 lbl58 = new JLabel("");
		lbl58.setBounds(211, 277, 60, 60);
		contentPane.add(lbl58);

		 lbl57 = new JLabel("");
		lbl57.setBounds(271, 277, 60, 60);
		contentPane.add(lbl57);

		 lbl56 = new JLabel("");
		lbl56.setBounds(331, 277, 60, 60);
		contentPane.add(lbl56);

		 lbl55 = new JLabel("");
		lbl55.setBounds(393, 277, 60, 60);
		contentPane.add(lbl55);

		 lbl54 = new JLabel("");
		lbl54.setBounds(453, 277, 60, 60);
		contentPane.add(lbl54);

		 lbl53 = new JLabel("");
		lbl53.setBounds(511, 277, 60, 60);
		contentPane.add(lbl53);

		 lbl52 = new JLabel("");
		lbl52.setBounds(572, 277, 60, 60);
		contentPane.add(lbl52);

		 lbl51 = new JLabel("");
		lbl51.setBounds(630, 277, 60, 60);
		contentPane.add(lbl51);

		 lbl62 = new JLabel("");
		lbl62.setBounds(151, 217, 60, 60);
		contentPane.add(lbl62);

		 lbl61 = new JLabel("");
		lbl61.setBounds(92, 217, 60, 60);
		contentPane.add(lbl61);

		 lbl63 = new JLabel("");
		lbl63.setBounds(211, 217, 60, 60);
		contentPane.add(lbl63);

		 lbl64 = new JLabel("");
		lbl64.setBounds(271, 217, 60, 60);
		contentPane.add(lbl64);

		 lbl65 = new JLabel("");
		lbl65.setBounds(331, 217, 60, 60);
		contentPane.add(lbl65);

		 lbl66 = new JLabel("");
		lbl66.setBounds(393, 217, 60, 60);
		contentPane.add(lbl66);

		 lbl67 = new JLabel("");
		lbl67.setBounds(453, 217, 60, 60);
		contentPane.add(lbl67);

		 lbl68 = new JLabel("");
		lbl68.setBounds(511, 217, 60, 60);
		contentPane.add(lbl68);

		 lbl69 = new JLabel("");
		lbl69.setBounds(572, 217, 60, 60);
		contentPane.add(lbl69);

		 lbl70 = new JLabel("");
		lbl70.setBounds(630, 217, 60, 60);
		contentPane.add(lbl70);

		 lbl79 = new JLabel("");
		lbl79.setBounds(151, 157, 60, 60);
		contentPane.add(lbl79);

		 lbl80 = new JLabel("");
		lbl80.setBounds(92, 157, 60, 60);
		contentPane.add(lbl80);

		 lbl78 = new JLabel("");
		lbl78.setBounds(211, 157, 60, 60);
		contentPane.add(lbl78);

		 lbl77 = new JLabel("");
		lbl77.setBounds(271, 157, 60, 60);
		contentPane.add(lbl77);

		 lbl76 = new JLabel("");
		lbl76.setBounds(341, 157, 50, 60);
		contentPane.add(lbl76);

		 lbl75 = new JLabel("");
		lbl75.setBounds(393, 157, 60, 60);
		contentPane.add(lbl75);

		 lbl74 = new JLabel("");
		lbl74.setBounds(453, 157, 60, 60);
		contentPane.add(lbl74);

		 lbl73 = new JLabel("");
		lbl73.setBounds(511, 157, 60, 60);
		contentPane.add(lbl73);

		 lbl72 = new JLabel("");
		lbl72.setBounds(572, 157, 60, 60);
		contentPane.add(lbl72);

		 lbl71 = new JLabel("");
		lbl71.setBounds(630, 157, 60, 60);
		contentPane.add(lbl71);

		 lbl82 = new JLabel("");
		lbl82.setBounds(151, 97, 60, 60);
		contentPane.add(lbl82);

		 lbl81 = new JLabel("");
		lbl81.setBounds(92, 97, 60, 60);
		contentPane.add(lbl81);

		 lbl83 = new JLabel("");
		lbl83.setBounds(211, 97, 60, 60);
		contentPane.add(lbl83);

		 lbl84 = new JLabel("");
		lbl84.setBounds(271, 97, 60, 60);
		contentPane.add(lbl84);

		 lbl85 = new JLabel("");
		lbl85.setBounds(331, 97, 60, 60);
		contentPane.add(lbl85);

		 lbl86 = new JLabel("");
		lbl86.setBounds(393, 97, 60, 60);
		contentPane.add(lbl86);

		 lbl87 = new JLabel("");
		lbl87.setBounds(453, 97, 60, 60);
		contentPane.add(lbl87);

		 lbl88 = new JLabel("");
		lbl88.setBounds(511, 97, 60, 60);
		contentPane.add(lbl88);

		 lbl89 = new JLabel("");
		lbl89.setBounds(572, 97, 60, 60);
		contentPane.add(lbl89);

		 lbl90 = new JLabel("");
		lbl90.setBounds(630, 97, 60, 60);
		contentPane.add(lbl90);

		 lbl99 = new JLabel("");
		lbl99.setBounds(151, 38, 60, 60);
		contentPane.add(lbl99);

		 lbl100 = new JLabel("");
		lbl100.setBounds(92, 38, 60, 60);
		contentPane.add(lbl100);

		 lbl98 = new JLabel("");
		lbl98.setBounds(211, 38, 60, 60);
		contentPane.add(lbl98);

		 lbl97 = new JLabel("");
		lbl97.setBounds(271, 38, 60, 60);
		contentPane.add(lbl97);

		 lbl96 = new JLabel("");
		lbl96.setBounds(331, 38, 60, 60);
		contentPane.add(lbl96);

		 lbl95 = new JLabel("");
		lbl95.setBounds(393, 38, 60, 60);
		contentPane.add(lbl95);

		 lbl94 = new JLabel("");
		lbl94.setBounds(453, 38, 60, 60);
		contentPane.add(lbl94);

		 lbl93 = new JLabel("");
		lbl93.setBounds(511, 38, 60, 60);
		contentPane.add(lbl93);

		 lbl92 = new JLabel("");
		lbl92.setBounds(572, 38, 60, 60);
		contentPane.add(lbl92);

		 lbl91 = new JLabel("");
		lbl91.setBounds(630, 38, 60, 60);
		contentPane.add(lbl91);
		
		// snake and ladder board label
		 lblBoard = new JLabel("");
		lblBoard.setBounds(92, 38, 600, 600);
        contentPane.add(lblBoard);
        lblBoard.setIcon(new ImageIcon(game.class.getResource("/images/Board Small 600 600.png")));
       
        // game title label
        head = new JLabel("");
        head.setIcon(new ImageIcon(game.class.getResource("/images/head.png")));
        head.setBounds(773, 61, 571, 74);
        contentPane.add(head);
        
      
       
        
        // declaring labels for player names
        
        lblplayer1 = new JLabel(player[1].name);
        lblplayer1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 32));
        lblplayer1.setBounds(773, 217, 108, 49);
        contentPane.add(lblplayer1);
        
        
        lblpayer2 = new JLabel(player[2].name);
        lblpayer2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 32));
        lblpayer2.setBounds(773, 299, 122, 49);
        contentPane.add(lblpayer2);
        
        
        
        lblplayer3 = new JLabel(player[3].name);
        lblplayer3.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 32));
        lblplayer3.setBounds(773, 380, 122, 42);
        contentPane.add(lblplayer3);
        
        lblPlayer4 = new JLabel(player[4].name);
        lblPlayer4.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 32));
        lblPlayer4.setBounds(773, 457, 122, 42);
        contentPane.add(lblPlayer4);
        
     
        // declaring player symbol label to indicate whose chance it is.
        
        lblrollpalyersymbol = new JLabel("");
        lblrollpalyersymbol.setIcon(new ImageIcon(game.class.getResource("/images/player 1.png")));
        lblrollpalyersymbol.setBounds(1311, 321, 50, 74);
        contentPane.add(lblrollpalyersymbol);
        
        
        // declaring labels for player symbols
        lblplayer1symbol = new JLabel("");
        lblplayer1symbol.setIcon(new ImageIcon(game.class.getResource("/images/player 1.png")));
        lblplayer1symbol.setBounds(921, 217, 50, 60);
        contentPane.add(lblplayer1symbol);
        
        lblplayer2symbol = new JLabel("");
        lblplayer2symbol.setIcon(new ImageIcon(game.class.getResource("/images/player 2.png")));
        lblplayer2symbol.setBounds(921, 296, 60, 52);
        contentPane.add(lblplayer2symbol);
        
       
        
        lblplayer3symbol = new JLabel("");
        lblplayer3symbol.setIcon(new ImageIcon(game.class.getResource("/images/player 3.png")));
        lblplayer3symbol.setBounds(921, 380, 50, 60);
        contentPane.add(lblplayer3symbol);
       
        
        lblplayer4symbol = new JLabel("New label");
        lblplayer4symbol.setIcon(new ImageIcon(game.class.getResource("/images/player 4.png")));
        lblplayer4symbol.setBounds(921, 457, 50, 49);
        contentPane.add(lblplayer4symbol);
        
        
        // declaring labels for players position
        
        lblpos1 = new JLabel("1");
        lblpos1.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 33));
        lblpos1.setBounds(1007, 233, 80, 60);
        contentPane.add(lblpos1);
        
        lblpos2 = new JLabel("1");
        lblpos2.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 33));
        lblpos2.setBounds(1007, 304, 80, 60);
        contentPane.add(lblpos2);
        
        lblpos3 = new JLabel("1");
        lblpos3.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 32));
        lblpos3.setBounds(1007, 388, 80, 49);
        contentPane.add(lblpos3);
        
     
        
        lblpos4 = new JLabel("1");
        lblpos4.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 33));
        lblpos4.setBounds(1007, 457, 80, 60);
        contentPane.add(lblpos4);
        
      //setting players according to number of players.
      		if(nop==2) {
      			lblplayer3.setVisible(false);
      			lblplayer3symbol.setVisible(false);
      			lblpos3.setVisible(false);
      			lblPlayer4.setVisible(false);
      			lblplayer4symbol.setVisible(false);
      			lblpos4.setVisible(false);
      					
      		}
      		if(nop==3) {
      			lblPlayer4.setVisible(false);
      			lblplayer4symbol.setVisible(false);
      			lblpos4.setVisible(false);
      		}
      
        
        
        
        
        
        
        //restart button
        JButton btnRestart = new JButton("RESTART");
        btnRestart.setFont(new Font("Tahoma", Font.PLAIN, 28));
        btnRestart.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int confirm = JOptionPane.showConfirmDialog(null, "Do you want to Restart?", "Restart!!!", JOptionPane.YES_NO_OPTION);
				if(confirm == JOptionPane.YES_OPTION){
					dispose();
					game frame = new game();
					frame.setVisible(true);
				}
        	}
        });
        btnRestart.setBounds(768, 693, 203, 42);
        contentPane.add(btnRestart);
        
        
        //roll button
        rollbutton = new JButton("ROLL");
        rollbutton.setForeground(Color.WHITE);
        rollbutton.setBackground(Color.RED);
        rollbutton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 40));
        rollbutton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		lblsnake.setVisible(false);		
        		if(flag==nop+1) {
        			flag=1;
        		
        		}
        		k=flag+1;
        		
        		if(flag==nop) {
        			k=1;
        		}
        		currentplayersymbol(k);
        		
        		
        		RemoveImage(player[flag].position);
        		
        		dice();
        		player[flag].position+=point;
        	   
        		
        		if(player[flag].position==100) {
        			JOptionPane.showMessageDialog(null, "player "+flag+" WON!!!");
        			lblwinningmessage.setText("PLAYER "+flag+" WON");
        			 lblrestartmessage.setVisible(true);
        			rollbutton.setVisible(false);
        			lblrollpalyersymbol.setVisible(false);
        			
        		}
        		 if((player[flag].position>100)) {
        			player[flag].position-=point;//no change in position.
        		}
        		
        		pos=player[flag].position;
        		SetImage(pos,flag);
        		displayposition();
        		player[flag].position=pos;
        		
        		
        		
        		flag++;
        		
        	
        			
        		
        		
        	}
        });
        
        
        
        rollbutton.setBounds(1249, 408, 172, 60);
        contentPane.add(rollbutton);
        
        displayroll = new JLabel("");
        displayroll.setForeground(Color.YELLOW);
        displayroll.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 73));
        displayroll.setBounds(304, 646, 152, 124);
        contentPane.add(displayroll);
        
        JLabel lblNewLabel = new JLabel("DEVELOPED BY\r\nANKIT JOSHI");
        lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
        lblNewLabel.setBounds(995, 681, 499, 74);
        contentPane.add(lblNewLabel);
        
        lblsnake = new JLabel("");
        lblsnake.setIcon(new ImageIcon(game.class.getResource("/images/snakeGIF2.gif")));
        lblsnake.setBounds(1064, 380, 157, 137);
        contentPane.add(lblsnake);
        lblsnake.setVisible(false);
        
        lblwinningmessage = new JLabel("");
        lblwinningmessage.setForeground(Color.BLUE);
        lblwinningmessage.setFont(new Font("Tw Cen MT Condensed", Font.BOLD | Font.ITALIC, 38));
        lblwinningmessage.setBounds(1168, 529, 271, 107);
        contentPane.add(lblwinningmessage);
        
        lblrestartmessage = new JLabel("Press restart to play once more");
        lblrestartmessage.setFont(new Font("Verdana", Font.PLAIN, 24));
        lblrestartmessage.setBounds(711, 640, 401, 31);
        contentPane.add(lblrestartmessage);
        lblrestartmessage.setVisible(false);
       
        
       
		
		
		
		
	}
		}

		



