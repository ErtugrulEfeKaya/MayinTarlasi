
package mayintarlasi;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class resim extends mayinTarlasi{
    
    
    
  public ImageIcon mayin(){
   java.net.URL dosya = getClass().getResource("mayin.jpg");
   ImageIcon resim = new ImageIcon(dosya);
   return resim;
 }   
  public ImageIcon flag(){
      java.net.URL dosya2=getClass().getResource("Flag.png");
      ImageIcon reesim=new ImageIcon(dosya2);
   return reesim;   
  }
}
