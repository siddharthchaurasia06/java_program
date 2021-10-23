interface animal
{
    public void legs();
    public void eat();
    public void live();

}



class cat implements animal{
    public void legs(){
        System.out.println("cat has 4 legs");
    }
    public void eat(){
        System.out.println("cat eats meat and vegitables");
    }
    public void live(){
        System.out.println("cat live in house");
    }
}

class interfaces{
    public static void main(String args[])
    {
        cat c=new cat();
        c.legs();
        c.eat();
        c.live();
    }
}