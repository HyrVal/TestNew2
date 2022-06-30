public class MethodsObject extends Object{
  private String name;
  private int age ;

    public MethodsObject(String name, int age){
    this.name = name;
    this.age = age;
}
    public String toHashKode() {
        return  Integer.toHexString(hashCode());
    }

    public String toStringHashKode() {
        return getClass().getName() + Integer.toHexString(hashCode());
    }

    @Override

//    @Override - переопределение метода заданного по умолчанию,
//    в данном случае toString:
//    public String toString() {
//    return super super.toString()
//    }

    public String toString() {
        return "My name is " + name + " " + age + " years old";
    }

    public boolean equals(Object obj){
    return (this == obj);
}

}
