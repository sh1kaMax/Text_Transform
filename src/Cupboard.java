public class Cupboard extends Object {
    public Cupboard(){
        super("Шкаф", Properties.SCAFANDR);
        Join(getName());
        object++;
    }
    public static class HistoryOfScafandr{
        public HistoryOfScafandr(){
            System.out.println("В этом скафандре Незнайка впервые прибыл в лунный город Давилон");
        }
    }
}
