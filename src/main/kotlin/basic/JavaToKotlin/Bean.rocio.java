package basic.JavaToKotlin;

public class Bean{
    private final String name;
    private final int age;

    public Bean(String n, int a){
        name = n;
        age = a;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}