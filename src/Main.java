public class Main {
    public static void main(String[] args) throws AmountOfObjectsException {
        Company h1 = new Company();
        FirstRoom h2 = new FirstRoom();
        SecondRoom h3 = new SecondRoom();
        Table h4 = new Table();
        Painting h5 = new Painting();
        Cupboard h6 = new Cupboard();
        Chest h7 = new Chest();
        FireproofCupboard h8 = new FireproofCupboard();
        Miga h9 = new Miga();
        Julio h10 = new Julio();
        Meeting h11 = new Meeting();
        System.out.println();
        {
            class HowMany{
                HowMany(int amount) throws AmountOfObjectsException {
                    if(amount < 0) throw new AmountOfObjectsException(amount);
                    System.out.println("В истории участвует: " + amount + " объектов");
                }
                }

            HowMany howMany = new HowMany(Object.object);
        }
        System.out.println();
        h1.contain(h2.getName(), h3.getName());
        h2.contain(h4.getName(), h5.getName(), h6.getName());
        h4.getProperty();
        h5.getProperty();
        h6.getProperty();
        Cupboard.HistoryOfScafandr history = new Cupboard.HistoryOfScafandr();
        h3.contain(h7.getName(), h8.getName());
        h7.getProperty();
        h8.getProperty();
        h11.makeMeeting(h9.getName(), h10.getName());
        h9.makeOffer(h11.getName());
    }
}