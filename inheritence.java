class a
{
    public void a()
    {
        System.out.println("a");
    }
}
class b extends a
{
    public void b()

    {
        super.a();
        System.out.println("b");
    }
    public void c()
    
    {
        this.a();
        System.out.println("c");
    }
}



public class inheritence extends b
{
     public static void main(String args[]) {
        
        b obj=new b();
        obj.b();
        obj.c();
        
    }
}