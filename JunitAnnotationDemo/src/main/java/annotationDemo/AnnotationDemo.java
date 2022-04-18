package annotationDemo;

import org.junit.*;

public class AnnotationDemo {
    static int beforeClassCount=1;
    static  int afterClassCount=1;
    static int beforeCount=1;
    static int afterCount=1;

    @Before //it will execute for 5 times as we have 5 test cases
    public   void setup(){
        System.out.println("Execution count of before method is::"+beforeCount++);

    }
    @BeforeClass//this will execute only once at begin
    public static  void setUpclass(){
        System.out.println("Execution count of beforeClass method is :"+beforeClassCount++);


    }
    @Test
    public  void test1(){
        System.out.println("\tCode for test1 method goes here");
    }

    @Test
    public  void test2(){
        System.out.println("\tCode for test2 metod goes here");

    }
    @Test
    public  void test3(){
        System.out.println("\tCode for test3 metod goes here");

    }
    @Test
    public  void test4(){
        System.out.println("\tCode for test4 metod goes here");

    }

    @Test
    public  void test5(){
        System.out.println("\tCode for test5 metod goes here");

    }
    @After//it will execute everytime test case is executed for 5 times
    public  void tearDown(){
        System.out.println("Execution count of after method:"+afterCount++);
    }

    @AfterClass //this method will execute only once at the end
    public  static  void tearDownClass(){
        System.out.println("Execution count of afterclass method is :"+afterClassCount++);
    }


}
/*output:

"C:\Program Files\Java\jdk-11.0.9\bin\java.exe" -ea -Didea.test.cyclic.buffer.size=1048576 "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=55376:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\plugins\junit\lib\junit5-rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\plugins\junit\lib\junit-rt.jar;C:\Users\Coditas\Downloads\JunitAnnotationDemo\target\classes;C:\Users\Coditas\.m2\repository\junit\junit\4.13.2\junit-4.13.2.jar;C:\Users\Coditas\.m2\repository\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar" com.intellij.rt.junit.JUnitStarter -ideVersion5 @w@C:\Users\Coditas\AppData\Local\Temp\idea_working_dirs_junit.tmp @C:\Users\Coditas\AppData\Local\Temp\idea_junit.tmp -socket55375
        Execution count of before method is::1
        Code for test1 method goes here
        Execution count of after method:1
        Execution count of before method is::2
        Code for test2 metod goes here
        Execution count of after method:2
        Execution count of before method is::3
        Code for test3 metod goes here
        Execution count of after method:3
        Execution count of before method is::4
        Code for test4 metod goes here
        Execution count of after method:4
        Execution count of before method is::5
        Code for test5 metod goes here
        Execution count of after method:5
        Execution count of afterclass method is :1
        Execution count of beforeClass method is :1

 */

