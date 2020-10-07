 
import java.util.*;

/*
 * Class to represent a very simplified database
 * 
* Note that this program is written as the hint and is not a working program. It should be
* completed and then should be tested. You can write your own program from the scratch if 
* it is easier for you.
*/


public class SimpleDatabase {

    /*
     * ArrayList for Part A. for Part B, they should be LinkedList
     */
    private ArrayList<Shape> shapes;
    private ArrayList<Shape> storedShapes;
    
    
    /*
     * Constructor to initialize the two ArrayList's for Part A. For Part B, they should be LinkedList
     */
    public SimpleDatabase()
    {
        shapes = new ArrayList<Shape>();
        storedShapes = new ArrayList<Shape>();
    }
    

    
    /*
     * Get the list of shapes from the simple database
     * Part A: You should get an ArrayList
     * Part B: You should get a LinkedList
     */
    public ArrayList<Shape> getShapeList()
    {
        return shapes;
    }
    
    
    
    /*
     * Add a shape to the simple database
     * Part A: Add to an ArrayList
     * Part B: Add to a LinkedList
     */
    public void addShape(Shape s)
    {
        shapes.add(s);
    }

    
    /*
     * Get the latest shape added to the simple database
     * Part A: Get latest shape from ArrayList
     * Part B: Get latest shape from LinkedList
     */
    public ArrayList<Shape> getLatestShape()
    {
        return shapes;
    }
    
    /*
     * Get a shape from an index
     * Part A: Get from an index in ArrayList
     * Part B: Get from a LinkedList appropriately with the given index
     */
    public Shape getShape(int i) 
    {
        return (shapes.get(i));
    }

    
    /*
     * Store the shapes in the simple database
     * Part A: Store in ArrayList
     * Part B: Store in LinkedList
     */
    public void Store()
    {
        storedShapes = shapes;
    }
    
    /*
     * Get the stored shapes from the simple database
     * Part A: restore from ArrayList
     * Part B: restore from LinkedList
     */
    public ArrayList<Shape> getStoredShapes()
    
    {
        return storedShapes;
    }

    
    /*
     * Remove a shape from an index
     * Part A: Remove from an index in ArrayList
     * Part B: Remove from the LinkedList appropriately with the given index
     */
    
    public void RemoveShape(int index)
    {
        shapes.remove(index);
        
    }
    
}