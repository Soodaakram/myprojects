
package assmnt;


public class Assmnt {

 
    public static void main(String[] args) {
       

        Student myStudent=new Student();
        System.out.println("print student ids and names");
        System.out.println("fatima's deatail");
        myStudent.insert(0, 11001100);
        myStudent.insert2("fatima",0);
        System.out.println("Yasira's detail");
        myStudent.insert(1,2200222);  
        myStudent.insert2("Yasira",1);
        System.out.println("sanjo's detail");
        myStudent.insert(2,330033);
        myStudent.insert2("sanjo",2);
        System.out.println("mahekan's detail");
        myStudent.insert(3, 440044);
        myStudent.insert2("maheekan",3);
        System.out.println("let travers the ARRAYS");
 
       myStudent.travers();
       myStudent.travers2();
       System.out.println("operation of search");
       int a=myStudent.find(11001100);
       System.out.println(a);
       String x = myStudent.find2("fatima");
       System.out.println(x);
       System.out.println("After deleting");
       myStudent.delete(2);
       myStudent.delete2(3);
       myStudent.travers();
       myStudent.travers2(); 
    
   
    }
}
 
    

