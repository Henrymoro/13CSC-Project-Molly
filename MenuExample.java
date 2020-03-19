
/**
 * Write a description of class MenuExample here.
 *
 * @author Molly Henry
 * @version V2 4/03/20
 */

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class MenuExample extends JFrame
{
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    
    /**
     * Constructor for objects of class MenuExample
     */
    public MenuExample()
    {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("The window is called:");
        String windowName = inputStream.nextLine();
        System.out.println("The dimensions are:");
        int dimensionsX = Integer.parseInt(inputStream.nextLine());
        int dimensionsY = Integer.parseInt(inputStream.nextLine());
        
        setTitle(windowName);
        
        this.getContentPane().setPreferredSize(new Dimension(dimensionsX,dimensionsY));
        
        menuBar=new JMenuBar();
        this.setJMenuBar(menuBar);
        
        menu = new JMenu("Numbers");
        menuBar.add(menu);
        
        menuItem=new JMenuItem("The First");
        menu.add(menuItem);
        menuItem=new JMenuItem("The Second");
        menu.add(menuItem);
        menuItem=new JMenuItem("The Third");
        menu.add(menuItem);
        
        menu = new JMenu("Words");
        menuBar.add(menu);
        
        menuItem=new JMenuItem("The Apple");
        menu.add(menuItem);
        menuItem=new JMenuItem("The Banana");
        menu.add(menuItem);
        menuItem=new JMenuItem("The Carrot");
        menu.add(menuItem);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.pack();
        this.toFront();
        this.setVisible(true);
        
        
    }
}
