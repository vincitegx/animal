package animal;
public class Animal {
    private String name;
    private String matricNo;
    private String dept;
    private String number;
    private String Gender;
    private String email;
    private int Level;
    private int age;
    public Animal(String n,String m,String d,String b,String g,String e,int l,int a){
        this.name = n;
        this.matricNo = m;
        this.dept = d;
        this.number = b;
        this.Gender = g;
        this.email = e;
        this.age = a;
        this.Level = l;
    }
public String getname(){
    return getName();
    }
 public String getMatric(){
    return getMatricNo();
    }
 public String getDept(){
     return dept;
     }
 public String getNumber(){
    return number;
    }
public String  getGender(){
    return Gender;
    }        
public String getEmail(){
    return email;
    }
public int getLevel(){
    return Level;
    }
 public int getage(){
    return getAge();
    }
    
public int AgeIncrement(int k){
        setAge(getAge() + k);
return  getAge();
}
public int LevelIncrement(int i){
        setLevel(getLevel() + i);
return  getLevel();
}
    @Override
    public String toString(){
        return("Name : "+this.getname()+"\n Department : "+this.getDept()+"\n Matric No : "+this.getMatric()
                +"\n Phone no : "+this.getNumber()+"\n Gender : "+this.getGender()+"\n Email Address : "+this.getEmail()
                +"\n Age : "+this.getage()+"\n Level : "+this.getLevel());
}   
    Animal(){        
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMatricNo() {
        return matricNo;
    }
    public void setMatricNo(String matricNo) {
        this.matricNo = matricNo;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setLevel(int Level) {
        this.Level = Level;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
  class AnimalTest{
    public static void main(String[] args) {
    // create an object    
        Animal A = new Animal("OGBODU DAVID TEGA","CSC/15/3056","COMPUTER SCIENCE","08021493815","MALE","ogbodudavid3056@gmail.com"
        ,300,18);
        System.out.println(A.toString());
                Animal B = new Animal();
         B.setName("BINUYO SIMEON OLAJIDE");
         B.setMatricNo("CSC/15/3045");
         B.setDept("COMPUTER SCIENCE");
         B.setNumber("08101290009");
         B.setGender("MALE");
         B.setEmail("dmmasterjaysay@gmail.com");
         B.setAge(22);
         B.setLevel(300);
         System.out.println();
        System.out.println("NAME : "+B.getName());
        System.out.println("MATRIC NO : "+B.getMatricNo());
        System.out.println("DEPARTMENT : "+B.getDept());
        System.out.println("PHONE NO : "+B.getNumber());
        System.out.println("GENDER : "+B.getGender());
        System.out.println("EMAIL : "+B.getEmail());
        System.out.println("AGE : "+B.getAge());
        System.out.println("LEVEL : "+B.getLevel());    
    }
}
