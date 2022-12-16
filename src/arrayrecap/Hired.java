package arrayrecap;

public class Hired extends Person{

    private String name;


    public Hired(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hired " +
                "name = '" + name + '\''
                ;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
