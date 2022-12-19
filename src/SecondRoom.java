public class SecondRoom extends Object{
    SecondRoom(){
        super("Вторая комната");
        Join(getName());
        object++;
    }
    public void contain(String val1, String val2){
        System.out.println("-" + getName() + " располагает в себе такие предметы, как: 5 " + "\n" + "     " + val1 + "ов и " + val2);
    }
}