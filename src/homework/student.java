package homework;

public class student extends human {
    private String name;
    private int age;
    private String sex;
    private int studetnumber;


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getStudetnumber() {
        return studetnumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setStudetnumber(int studetnumber) {
        this.studetnumber = studetnumber;
    }

    public void introduce(){
        System.out.println("姓名："+getName());
        System.out.println("年龄："+getAge());
        System.out.println("性别:"+getSex());
        System.out.println("学号："+getStudetnumber());
    }
}
