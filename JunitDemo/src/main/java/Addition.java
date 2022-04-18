public class Addition {
    public int add(int a,int b){
        return a+b;
    }
}
class Division{
    public int div(int a,int b){
        if(b==a)
            throw new ArithmeticException("B value should be non-zero number==>"+b);
        return (a/b);
    }
}

class Subtraction{
    public int sub(int c,int d){
        return c-d;
    }
}
class Multiplication{
    public int mul(int s,int h){
        return s*h;

    }
}