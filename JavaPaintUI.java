import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.concurrent.TimeUnit;
import java.lang.*;


class JavaPaintUI extends JFrame implements Runnable{
	Boolean b  = false;
	int a = 0;
	Thread t;
	String name;
	private JPanel jPanel2;
	Graphics g;
   // public JavaPaintUI(String threadname) {
	

		//name = threadname; 

		

		//System.out.println("New thread: " + t);
		//t.start();
		
	//}

        //initComponents();
		//this.setVisible(true);
		/*while(a == 0){
			
			if(b == true){
				try{
					TimeUnit.SECONDS.sleep(1);  
					snap();
					
				}
				catch(Exception e){
					e.printStackTrace();
				}
				
				a = 2;
			}*/
			/*else{
				try{
					TimeUnit.SECONDS.sleep(1);  
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}*/
			
		//}
	public void run(){
			
			//private void initComponents() {
		class Panel2 extends JPanel {

			Panel2() {
			
				setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
				pack();
				setResizable(false);
				//paintComponent(g);
			}

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
		
				int x = 100,y = 120;
				int xp[] = {x-40,x-60,x-40,x,x+20,x,x-40,x-20,x};
				int yp[] = {y-20,y-20,y,y,y-20,y-20,y-20,y-40,y-20};
				int npoints = 7;
			
    
	
				for(int i =0;i<8;i++){
					g.drawLine(xp[i],yp[i],xp[i+1],yp[i+1]);
				}  
				
				
				
            
			}
		}
		jPanel2 = new Panel2();
		//jPanel2.paintComponent(g);
		jPanel2.setBackground(new java.awt.Color(255, 255, 255));
		jPanel2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        

        
		this.setContentPane(jPanel2);
       
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		this.setVisible(true);
		//b = true;
		try{
			java.lang.Thread.sleep(1000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
			    
//}
	/*public class snapy implements Runnable{
		String tname;
		/*public snapy(String tnam){
			tname = tnam;
			t = new Thread(this, tname);

			System.out.println("New thread: " + t);
		}*/
		/*public void run(){
			
			try{
					getsavesnap(jPanel2,"sav1.png");
			}
			catch(Exception e){
					e.printStackTrace();
			}
			

			public void BufferedImage getscreenshot(JComponent com)throws Exception{
			
				Point p = new Point(0,0);
				SwingUtilities.convertPointToScreen(p,jPanel2);
				Rectangle region = jPanel2.getBounds();
				region.x = p.x;
				region.y = p.y;
				BufferedImage img =  new Robot().createScreenCapture(region);
				return img;
			}
			
			
			public void getsavesnap(JComponent com,String file)throws Exception{
				BufferedImage image = getscreenshot(com);
				ImageIO.write(image, "png", new File(file));
			} 	 
   

				
		}
	}
   */ public static void main(String args[]) {
		Thread t1 = new Thread(new JavaPaintUI(),"painting");
		Thread t2 = new Thread(new snapy(),"snapping");
        //JavaPaintUI jp = new JavaPaintUI("painting");
		//snapy ss = new snapy("snapping");
		t1.start();
		
		t2.start();
		
		
        		
    }
	

}
	/*class snapy implements Runnable{
		String tname;
		
		/*public snapy(String tnam){
			tname = tnam;
			t = new Thread(this, tname);

			System.out.println("New thread: " + t);
		}*/
		/*public void run(){
			
			try{
					getsavesnap(JavaPaintUI.jPanel2,"sav1.png");
			}
			catch(Exception e){
					e.printStackTrace();
			}
			

			public void BufferedImage getscreenshot(JComponent com)throws Exception{
			
				Point p = new Point(0,0);
				SwingUtilities.convertPointToScreen(p,jPanel2);
				Rectangle region = JavaPaintUI.jPanel2.getBounds();
				region.x = p.x;
				region.y = p.y;
				BufferedImage img =  new Robot().createScreenCapture(region);
				return img;
			}
			
			
			public  void getsavesnap(JComponent com,String file)throws Exception{
				BufferedImage image = getscreenshot(com);
				ImageIO.write(image, "png", new File(file));
			} 	 
   

				
		}
	}
	*/
    
   
    

	
