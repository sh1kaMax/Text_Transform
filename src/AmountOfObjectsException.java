public class AmountOfObjectsException extends Exception {
    public AmountOfObjectsException(int n){
        System.out.println("Недопустимое количество объектов: " + n);
    }
}
