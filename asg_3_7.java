//21CE029 : MAHEE GADHIYA
//PART : 3
//PRACTICAL : 7
package com.info;
interface TestInterface
{
    // abstract method
    public void square(int a);
  
    // default method
    default void show()
    {
      System.out.println("Default Method Executed");
      System.out.println();
      System.out.println("Created By MAHEE GADHIYA : 21CE029");
    }
}
  
class TestClass implements TestInterface
{
    // implementation of square abstract method
    public void square(int a)
    {
        System.out.println(a*a);
    }
}
public class asg_3_7{
    public static void main(String args[])
    {
        TestClass d = new TestClass();
        d.square(17);
  
        // default method executed
        d.show();
    }
}

