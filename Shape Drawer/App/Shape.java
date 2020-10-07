 
import java.awt.Graphics2D;
import javax.swing.JComponent ;

/*
 * Component that is inherited by other shapes 
 *   
 * Note that this program is written as the hint and is not a working program. It should be
 * completed and then should be tested. You can write your own program from the scratch if 
 * it is easier for you.
 */

public class Shape extends JComponent
{  
    
    public String colourName = "Black";
    
    /**
       Constructor that assigns colour name to shape
     */
    public Shape(String colourName)
    {  
    	this.colourName = colourName;
    }

    /**
     * Returns the shape's name
     */
    public String getShapeName()
    {
    	return "Shape";
    }
    
    /**
     * Returns the shape's colour
     */
    public String getColour()
    {
    	return colourName;
    }
    
    /**
     * No drawing is to be done
     */
    public void draw(Graphics2D g2)
    {
    	//Nothing drawn for the Shape class 
    }
    
    
}