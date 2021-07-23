/*
Recitation 15 - Week 8.2 - 7/22:
This is the code that the students came up with during class
The solutions to these questions are located on the slide deck which is accessible through canvas
*/

/*
PROBLEM 1 - Vector
Description: This class is implemented to be immutable: 
once the client program initializes a Vector, it cannot change any of its fields (n or data[i]) either directly or indirectly.
Immutability is a very desirable feature of a data type.
  Output:
  % java-introcs Vector
  x        = ( 1.0, 2.0, 3.0, 4.0 )
  y        = ( 5.0, 2.0, 4.0, 1.0 )
  x + y    = ( 6.0, 4.0, 7.0, 5.0 )
  10x      = ( 10.0, 20.0, 30.0, 40.0 )
  <x, y>   = 30.0 
  |x|      = 5.477225575051661
*/

//CODE:

public class Vector {
  private int len;
  private double [] vec; 
  
  
  public Vector (int len) {
    this.len = len;
    this.vec = new double [len];
  }
  
  public Vector(int len, double var0, double var1, double var2, double var3){
  	this.len = len;
    this.vec = new double[len];
    vec[0] = var0;
    vec[1] = var1;
    vec[2] = var2;
    vec[3] = var3;
  }
    
  public Vector addition(Vector v){
    double[] k = new double[4];
    
    for(int i = 0; i < 4; i++){ k[i] = this.vec[i] + v.vec[i];}
    
  	Vector finalVector = new Vector(4,k[0],k[1],k[2],k[3]);
  	return finalVector;
  }
  
  public double dotProduct(Vector v){
    double[] k = new double[4];
    
    for(int i = 0; i < 4; i++){ k[i] = this.vec[i] * v.vec[i];}
    
  	double dotProductDouble = k[0] + k[1] + k[2] + k[3];
  	return dotProductDouble;
  }
  
  public String toString() {
    return("("+ vec[0] + ","+ vec[1] + ","+ vec[2] + ","+vec[3] + ")");
      
  }
  
  
  
  
  
  
  
  
import java.util.Arrays;

public class MyVector {

  private double[] nums;

  public MyVector(double... nums) {
    this.nums = nums;
  }

  @Override
  public String toString() {
    return Arrays.toString(nums);
  }

  public MyVector adding(MyVector v) throws Exception {
    if (nums.length != v.nums.length) {
      throw new Exception("Vector lengths must be equal.");
    }
    double[] newNums = new double[nums.length];
    for (int i = 0; i < nums.length; i++) {
      newNums[i] = nums[i] + v.nums[i];
    }
    return new MyVector(newNums);
  }

  public MyVector multipliedBy(double s) {
    double[] newNums = new double[nums.length];
    for (int i = 0; i < newNums.length; i++) {
      newNums[i] = nums[i] * s;
    }
    return new MyVector(newNums);
  }

  public double dottedWith(MyVector v) throws Exception {
    if (nums.length != v.nums.length) {
      throw new Exception("Vector lengths must be equal.");
    }
    double dot = 0.0;
    for (int i = 0; i < nums.length; i++) {
      dot += (nums[i] * v.nums[i]);
    }
    return dot;
  }

  public double magnitude() {
    double m = 0;
    for (double f : nums) {
      m += f * f;
    }
    return Math.sqrt(m);
  }
}

