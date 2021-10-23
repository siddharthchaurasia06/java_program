abstract class animal
{
    void legs()
    {
        System.out.println("has 4 legs");
    }
    abstract public void eat();
}

class lion extends animal{
    public void eat()
    {
        System.out.println("lion eats meat");
    }
}
class goat extends animal{
    public void eat()
    {
        System.out.println("goat eats meat");
    }
}


class abstraction
{
    
    public static void main(String args[]) {
        lion l=new lion();
        goat g=new goat();
        l.eat();
        l.legs();
        g.eat();
        g.legs();
    }
   
}