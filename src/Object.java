public abstract class Object implements showName, showProperty {
    public static int object;
    private String name;
    private Properties property;
    public Object(String name) {
        this.name = name;
    }
    public Object(String name, Properties property){
        this.name = name;
        this.property = property;
    }
    protected void Join(String name) {
        System.out.println(name + " в истории");
    }
    public String getName() {
        return this.name;
    }

    public void getProperty(){
        if(!this.property.equals(Properties.AMAZING) &
                !this.property.equals(Properties.GLADKO) &
                    !this.property.equals(Properties.MONEY) &
                        !this.property.equals(Properties.SCAFANDR) &
                            !this.property.equals(Properties.FIREPROOFMONEY)) throw new PropertyException(this.property);
        if (this.property.equals(Properties.GLADKO)){
            System.out.println("*" + getName() + " имеет гладкую полированную крышку");
        }
        if (this.property.equals(Properties.AMAZING)){
            System.out.println("*" + getName() + " в роскошной золоченой раме с изображением каких-то непонятных цветных кривулек и загогуленок");
        }
        if (this.property.equals(Properties.SCAFANDR)){
            System.out.println("*" + getName() + " с прозрачной стеклянной дверцей, внутри которого хранится Незнайкин скафандр");
        }
        if (this.property.equals(Properties.MONEY)){
            System.out.println("*" + "Каждый " + getName() + " хранит в себе акции на один миллион фертингов");
        }
        if (this.property.equals(Properties.FIREPROOFMONEY)){
            System.out.println("*" + getName() + " предназначен для хранения денег");
        }
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Object object = (Object) obj;
        if (property != object.property){
            return false;
        }
        if (name != null ? name.equals(object.name) : object.name != null){
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}