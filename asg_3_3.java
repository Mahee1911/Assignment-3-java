//21CE029 : MAHEE GADHIYA
//PART : 3
//PRACTICAL : 3
package com.info;
interface p{ 
    String owner = "Mahee Gadhiya";     
    public void work(); 
}  
interface p1 extends p {     
    String thing1 = "house";     
    public void whatIsIt(); 
}  
interface p2 extends p{     
    String thing2 = "car";     
    public void whatIsThis(); 
} 
interface p12 extends p1,p2{    
    String tax = "20%";     
    public void tax(); 
} 
class abc implements p12{ 
    @Override 
    public void work(){ 
        System.out.println("Owner : " + owner);     
    } 
    @Override 
    public void whatIsIt(){ 
        System.out.println("Material Owned : " + thing1); 
    }  
    public void whatIsThis(){ 
        System.out.println("Material Owned : " + thing2); 
    } 
    public void tax(){ 
        System.out.println("Tax paid per year : " + tax); 
    } 
} 
    public class asg_3_3 {     
        public static void main(String[] args) {         
            abc obj = new abc();         
            obj.work();         
            obj.whatIsIt();        
            obj.whatIsThis();         
            obj.tax(); 

            System.out.println();
            System.out.println("Created By MAHEE GADHIYA : 21CE029");
    } 
} 
