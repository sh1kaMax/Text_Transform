public class Company extends Object{
    public Company(){
        super("Контора");
        Join(getName());
        object++;
    }
    public void contain(String val1, String val2){
        System.out.println("-" + getName() + " содержит в себе: " + "\n" + "     " + val1 +", " + val2);
    }
}
