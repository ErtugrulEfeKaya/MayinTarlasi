package mayintarlasi;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import sun.awt.RepaintArea;


public class Ekran extends mayinTarlasi{
    protected int kareSayisi=10;
    protected int mayin=12;
    Date startDate = new Date();
    public int sec = 0;
    
    JFrame frm=new JFrame("Mayın Tarlası");
    public static void main(String [] args){
       
        Ekran al=new Ekran();
        al.ilkFrame();        
        
   }
   public void ilkFrame(){
    
      frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frm.getContentPane().add(new mayinYerlestirme(10,12).getContent());
      frm.setSize(550,400);
      frm.setLocationRelativeTo(null);
      frm.setVisible(true);
      frm.setResizable(false);
      JMenuBar menuBar=new JMenuBar();
      menuBar.setBackground(Color.white);
      menuBar.setSize(550,100);
      oyunMenubar(menuBar);
      frm.setJMenuBar(menuBar);
                JLabel label=new JLabel("");
                label.setSize(500,20);
                label.setVisible(true);
                label.setFont(new Font("Tahoma", Font.PLAIN,70));
      
      
   }
   

  public void oyunMenubar(JMenuBar menuBar){        
        JMenu dosya=new JMenu("Ayarlar");
        menuBar.add(dosya);
        JMenuItem yeniOyun=new JMenuItem("Yeni oyun");
        dosya.add(yeniOyun);
        yeniOyun.setBackground(Color.orange);
        JMenuItem kolay=new JMenuItem("Kolay");
        dosya.add(kolay);
        kolay.setBackground(Color.yellow);
        JMenuItem orta=new JMenuItem("Orta");
        dosya.add(orta);
        orta.setBackground(Color.green);
        JMenuItem zor=new JMenuItem("Zor");
        zor.setBackground(Color.red);
        dosya.add(zor);
        JMenuItem ozel=new JMenuItem("Özel");
        ozel.setBackground(Color.magenta);
        dosya.add(ozel);
        JMenuItem cikis=new JMenuItem("Çıkıs");
        dosya.add(cikis);
        cikis.setBackground(Color.gray);
        
        cikis.addActionListener(new ActionListener() {
          
            @Override
             public void actionPerformed(ActionEvent e) {
               System.exit(0);                      
                  }
            }); 
        
        yeniOyun.addActionListener(new ActionListener() {
            
            @Override
             public void actionPerformed(ActionEvent e) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                 
                Ekran al=new Ekran();
                JFrame frm=new JFrame("Oyun");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.getContentPane().add(new mayinYerlestirme(10,12).getContent());
                frm.setSize(550,400);
                frm.setLocationRelativeTo(null); 
                frm.setVisible(true);
                frm.setResizable(false);
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);

                al.oyunMenubar(menuBar);
                al.frm=frm;

                  }
            }); 
            
        
        kolay.addActionListener(new ActionListener() {
           
            @Override
             public void actionPerformed(ActionEvent e) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                Ekran al=new Ekran();
                JFrame frm=new JFrame("Kolay Mayın Tarlası");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.getContentPane().add(new mayinYerlestirme(9,7).getContent());
                frm.setSize(450,350);
                frm.setLocationRelativeTo(null);
                frm.setVisible(true);
                frm.setResizable(false);
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar); 
                al.frm=frm;
                  }
            }); 
        
        orta.addActionListener(new ActionListener() {
           
            @Override
             public void actionPerformed(ActionEvent e) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                Ekran al=new Ekran();
                JFrame frm=new JFrame("Orta Mayın Tarlası");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.getContentPane().add(new mayinYerlestirme(13,23).getContent());
                frm.setSize(700,450);
                frm.setLocationRelativeTo(null);
                frm.setVisible(true);  
                frm.setResizable(false);
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar);  
                al.frm=frm;
                  }
            }); 
        
        zor.addActionListener(new ActionListener() {
           
            @Override
             public void actionPerformed(ActionEvent e) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                Ekran al=new Ekran();
                JFrame frm=new JFrame("Zor Mayın Tarlası");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.getContentPane().add(new mayinYerlestirme(19,62).getContent());
                frm.setSize(1050,600);
                frm.setLocationRelativeTo(null);
                frm.setVisible(true);  
                frm.setResizable(false);
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar);   
                al.frm=frm;
             }
            }); 
        ozel.addActionListener(new ActionListener() {
           
            @Override
             public void actionPerformed(ActionEvent e) {
                Scanner klavye=new Scanner(System.in);
                 
                int kare = Integer.parseInt(JOptionPane.showInputDialog("Kare Sayısını Giriniz:"));
                int mayın = Integer.parseInt(JOptionPane.showInputDialog("Mayın Sayısını Giriniz:"));
                 
                
                 
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                Ekran al=new Ekran();
                JFrame frm=new JFrame("Özel Mayın Tarlası");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.getContentPane().add(new mayinYerlestirme(kare,mayın).getContent());
                frm.setSize(kare*55,kare*45);
                frm.setLocationRelativeTo(null);
                frm.setVisible(true); 
                frm.setResizable(false);
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar);
                al.frm=frm;
                  }
            }); 
  }
  
  
}


