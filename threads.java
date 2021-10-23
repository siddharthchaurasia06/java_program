class a implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try{Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            } 
            System.out.println("hello");
        }    
    }
}
class b implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try{Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            } 
            System.out.println("hi");
        }
        
    }
}

class threads
{
    public static void main(String args[])
    {
        a a=new a();
        b b=new b();
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        t1.start();
        t2.start();
    }
}