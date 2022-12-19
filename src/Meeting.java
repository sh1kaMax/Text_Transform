public class Meeting extends Object{
    public Meeting(){
        super("Заседание");
        object++;
    }
    public void companyHire(Hire instance){
        instance.hire("конторе");
    }
    public void makeMeeting(String person1, String person2){
        System.out.print(person1 + " и " + person2 + " устроили заседание " );
        companyHire(new Hire() {
            @Override
            public void hire(String val1) {
                System.out.println("в " + val1 + ", которую они наняли");
            }
        });
    }
}
