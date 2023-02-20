public class Model {
    private String name;
    private int age;
    private String address;
    private String num_phone;
    public Model(){};
    public Model(String name, int age, String address, String num_phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.num_phone = num_phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getNum_phone() {
        return num_phone;
    }
    public void setNum_phone(String num_phone) {
        this.num_phone = num_phone;
    }
    @Override
    public String toString() {
        return "Model [name=" + name + ", age=" + age + ", address=" + address + ", num_phone=" + num_phone + "]";
    };
    public void do_something(){
        
    }
    public void do_something1(){
        
    }
}
