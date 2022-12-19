public class Miga extends Object implements Offer {
    public Miga(){
        super("Мига");
        Join(getName());
        object++;
    }

    @Override
    public void makeOffer(String val1) {
        System.out.println("-На этом " + val1 + " " + getName() + " внес предложение пустить в продажу два миллиона акций");
    }
}
