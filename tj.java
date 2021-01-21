import java.util.*;

public class tj {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       String str = scn.next();
       String str1 = scn.next();
       char[]a = new char[str.length()];
     char[]a1 = new char[str1.length()];
       
       for(int i = 0;i<str.length();i++)
       { a[i] = str.charAt(i);}
         for(int i = 0;i<str1.length();i++)
       { a1[i] = str1.charAt(i);}
       
       sort(a);
       sort(a1);
       
    boolean y =   compare(a,a1);
       if( y== true)
       {System.out.print("words matched");}
       else
       {System.out.print("words  not matched");}
       
       
      
    }
    
    public static void sort(char a[])
    {
          
        for(int i = 0;i<a.length;i++)
        {for(int j = i+1;j<a.length;j++)
        {
            int min = a[i];

        if(a[j]<a[i])
        { char temp = a[i];
            a[i]=a[j];
            a[j] = temp;
        }
        
        }
        }
    }
    
public static boolean compare(char a[],char a1[])
{       int i = 0;
int j = 0;

     
        while(i<a.length && j<a1.length )
        {  if (a[i] != a1[j])
            {
                
                return false;
            }
            else 
            {
                i++;
                j++;
            }
           // System.out.println("alphabets matched");
        } 
        return true;
}
}