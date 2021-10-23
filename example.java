class A
{
    public void c(int x,int y)

    {
        
        System.out.println(x+y);
    }
    public void c(int x,int y,int z)
    
    {
        System.out.println(x+y+z);
    }
    public void c(int y)
    
    {
        System.out.println(y);
    }
}



public class example
{
     public static void main(String args[]) {
        
        A obj=new A();
        obj.c(1,2);
        obj.c(1,2,3);
        obj.c(1);
        
    }
}