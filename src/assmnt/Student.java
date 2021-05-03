
package assmnt;


public class Student {

         int nextIndex;
         int nextindex2;
        public int [] myArray=new int[4];
        public String []myArray2=new String[4];
        
        int insert(int index,int data)
        {
          myArray[index]=data;
          return data;  
        }
        String insert2(String data,int index)
        { 
           
            myArray2[index] =data;
            return data;
            
        }
        void travers()
        {
         
         for(int i=0;i<myArray.length;i++)
         {
                System.out.println("ID: "+ myArray[i]);
              
         }
        }
        void travers2()
        {
              for(int i=0;i<myArray2.length;i++)
            {
            System.out.println("Name:"+myArray2[i]);
            }
        }
        int find(int search)
        {
            for(int i=0;i<5;i++)
            {
                if(myArray[i]==search)
                {
                    return i;
                } 
            }
            
               return -1;    
        }
        String find2(String search2)
        {
            
            for(int i=0;i<5;i++)
            {
                if(myArray2[i]==search2)
                    return "searched";
            }
            
            return" not searched";
        }
        void delete(int index)
        {
            if(index>nextIndex)
            {
                return;
            }
            for(int i=index;i<nextIndex-1;i++)
            {
                myArray[i]=myArray[i+1];
            }
            nextIndex--;
        }
        void delete2(int index)
        {
            if(index>nextindex2)
            {
                return;
            }
            for(int i =index;i<nextindex2-1;i++)
            {
                myArray2[i]=myArray2[i+1];
                
            }
            nextindex2--;
        }
        
        
 }

   
