# Moving Average
#### Coding Question
Write an interface for a data structure that can provide the moving average of the last N elements added, add elements to the structure and get access to the elements. Provide an efficient implementation of the interface for the data structure.

#### How to build
use the given movingaverage package in 

#### Additional Details
This implementation is storing the last N numbers in an array and using a sliding window approach to calculate average.
The interface exposes 3 methods
- public MovingAverage add(int val)
    -   adds the number and returns the instance of the class
-   public double average()
    -   gets the average of the last N numbers. 
    -   If N elements are not added yet, it will return the average of M numbers added where M < N
-   public int[] getLastNElements()
    -   This returns the last N elements added (not in order).
    -   If only M elements are added yet where M < N, this will return M elements.


