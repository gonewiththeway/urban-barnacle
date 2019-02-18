package movingaverage;


/**
 * This provides the moving average of the last N elements added, 
 * add elements to the structure and get access to the elements.
 */
public interface MovingAverage {
    /**
     * This methods add an integer to the list of number.
     * 
     * @param val number to be added to the interface
     * @return the instance of the class itself
     */
    public MovingAverage add(int val);
    
    /**
     * This method returns the moving average of the last N elements added
     * If N elements are not added yet, it will return the average of M numbers added
     * where M is less than N
     * 
     * @return double containing the moving average
     */
    public double average();
    
    /**
     * This returns the last N elements added (not in order).
     * If only M elements are added yet where M is less than N, this will return M elements.
     * 
     * @return last N elements added.
     */
    public int[] getLastNElements();
}
