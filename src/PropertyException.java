public class PropertyException extends RuntimeException{
    PropertyException(Properties property){
        super("Нету такого свойства," + property);
    }
}
