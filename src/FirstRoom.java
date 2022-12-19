public class FirstRoom extends Object {
    public FirstRoom(){
        super("Первая комната");
        Join(getName());
        object++;
    }
    public void contain(String val1, String val2, String val3){
        System.out.println("-" + getName() + " располагает в себе такие предметы, как: " + "\n" + "     " +  val1 + ", " + val2 + ", " + val3);
    }
}