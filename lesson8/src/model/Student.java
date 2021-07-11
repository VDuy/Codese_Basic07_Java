package model;

abstract public class Student implements InterfaceStudent{
    protected int ID;
    protected String name;
    protected String address;

    abstract public void showInfo();
    abstract public void inputInfo();

    public Student (int ID, String name, String address){
        this.ID = ID;
        this.name = name;
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
