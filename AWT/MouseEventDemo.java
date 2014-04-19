import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
 
public class MouseEventDemo extends Frame implements MouseListener {
 
   // Private variables
   private TextField tfMouseX; // to display mouse-click-x
   private TextField tfMouseY; // to display mouse-click-y
 
   // Constructor - Setup the UI
   public MouseEventDemo() {
      setLayout(new FlowLayout()); // "super" frame sets layout
 
      // Label
      add(new Label("X-Click: ")); // "super" frame adds component
 
      // TextField
      tfMouseX = new TextField(10); // 10 columns
      tfMouseX.setEditable(false);  // read-only
      add(tfMouseX);                // "super" frame adds component
 
      // Label
      add(new Label("Y-Click: ")); // "super" frame adds component
 
      // TextField
      tfMouseY = new TextField(10);
      tfMouseY.setEditable(false);  // read-only
      add(tfMouseY);                // "super" frame adds component
 
      addMouseListener(this);
          // "super" frame fires the MouseEvent
          // "super" frame adds "this" object as MouseEvent listener
 
      setTitle("MouseEvent Demo"); // "super" Frame sets title
      setSize(350, 100);           // "super" Frame sets initial size
      setVisible(true);            // "super" Frame shows
   }
 
   public static void main(String[] args) {
      new MouseEventDemo();  // Let the constructor do the job
   }
 
   // MouseEvent handlers
   @Override
   public void mouseClicked(MouseEvent e) {
      tfMouseX.setText(e.getX() + "");
      tfMouseY.setText(e.getY() + "");
   }
 
   @Override
   public void mousePressed(MouseEvent e) { }
   @Override
   public void mouseReleased(MouseEvent e) { }
   @Override
   public void mouseEntered(MouseEvent e) { }
   @Override
   public void mouseExited(MouseEvent e) { }
}