import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;


/*
* Component that draws an ellipse based on mouse position
* 
* Note that this program is written as the hint and is not a working program. It should be
* completed and then should be tested. You can write your own program from the scratch if 
* it is easier for you.
*/
public class EllipseShape extends Shape
{  

    private int xCoord, yCoord;
    private final int RADIUS = 20;
    
    /**
        Constructor to create an ellipse based on the mouse coordinates given from the drawPanel
     */
    public EllipseShape(int xCoordinate, int yCoordinate, String colour)
    {
        super(colour);
        xCoord = xCoordinate;
        yCoord = yCoordinate;
    }
   

    /**
     * Returns the shape's name
     */
    public String getShapeName()
    {
        return "Ellipse";
    }
    
    
    /**
     * Return the x-coordinate of the mouse position for the ellipse
     */
   public int getX()
   {
       return xCoord;
   }
    
    /**
     * Return the y-coordinate of the mouse position for the ellipse
     */
   public int getY()
   {
       return yCoord;
    }

    /**
     *  Draw an ellipse
     */    
    public void draw(Graphics2D g2)
    {
        
        Ellipse2D.Double ellipse = new Ellipse2D.Double(getX(), getY(), RADIUS, RADIUS);
        String colour = super.getColour();
       if(colour.equalsIgnoreCase("blue"))
        {
        g2.setColor(Color.BLUE);
        g2.fill(ellipse);
        }
        else if(colour.equalsIgnoreCase("red"))
        {
            g2.setColor(Color.RED);
           g2.fill(ellipse);
        }
         else if(colour.equalsIgnoreCase("cyan"))
        {
            g2.setColor(Color.CYAN);
           g2.fill(ellipse);
        }
         else if(colour.equalsIgnoreCase("green"))
        {
            g2.setColor(Color.GREEN);
           g2.fill(ellipse);
        }
         else if(colour.equalsIgnoreCase("purple"))
        {
            g2.setColor(Color.MAGENTA);
           g2.fill(ellipse);
        }
        else if(colour.equalsIgnoreCase("orange"))
        {
            g2.setColor(Color.ORANGE);
           g2.fill(ellipse);
        }
        else if(colour.equalsIgnoreCase("yellow"))
        {
            g2.setColor(Color.YELLOW);
           g2.fill(ellipse);
        }
        else{ g2.setColor(Color.BLACK);
            g2.fill(ellipse);
        }
       
        g2.draw(ellipse);
    }
    
}