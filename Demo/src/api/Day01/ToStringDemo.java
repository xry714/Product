package api.Day01;

/**
 * ToString方法
 */
public class ToStringDemo {
    public static void main(String[] args) {
       //创建并声明对象
        Person person=new Person("Tom",23);
        Student student=new Student("Jcak",18);
        //Java中tostcing方法会被自动调用
        //打印对象的时候会自动调用tostring方法
        System.out.println(person);
        System.out.println(student);
    }
}
