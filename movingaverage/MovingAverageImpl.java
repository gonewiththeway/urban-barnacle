package movingaverage;

/**
 * This class takes the moving average of N integers using a sliding window.
 */
public class MovingAverageImpl implements MovingAverage {
    
    private int[] elements;
    private int position;
    private int sum;
    private int count;
    
    /**
     * Constructor
     * 
     * @param n The size of the moving window N
     */
    public MovingAverageImpl(int n) {
        this.elements = new int[n];
        this.position = 0 ;
        this.sum = 0;
        this.count = 0;
    }
    
    @Override
    public MovingAverage add(int val) {
        sum -= elements[position];
        elements[position++] = val;
        if(position == elements.length) {
            position = 0;
        }
        sum += val;
        count = count == elements.length ? count : count + 1;
        return this;
    }
    
    @Override
    public double average() {
        return ((double) sum) / count;
    }
    
    @Override
    public int[] getLastNElements() {
        return elements;
    }
    
}

