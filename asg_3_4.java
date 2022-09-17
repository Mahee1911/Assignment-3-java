//21CE029 : MAHEE GADHIYA
//PART : 3
//PRACTICAL : 4
package com.info;
class a {
    public void hello() {
        System.out.println("Hello! this is original function");
    } }
class b extends a {
    @Override
    public void hello() {
        System.out.println("Hello! this is overriden function");
    }
}
public class asg_3_4 {
    public static void main(String[] args){      
    b obj = new b();      
    obj.hello(); 
    a obj2 = new a();     
    obj2.hello(); 
    System.out.println();
    System.out.println("Created By MAHEE GADHIYA : 21CE029");
  }
}

