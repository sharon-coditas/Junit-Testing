import org.junit.Test;

import static org.junit.Assert.*;

public  class AdditionTest {
    @Test
    public void testAdd(){
        //Arrange
        Addition obj_a=new Addition();

        //Act
        //int sum=obj_a.add(5,5);

        //Assert
        assertEquals(11,obj_a.add(6,5));
    }
    @Test
    public void testDiv(){
        Division obj_d=new Division();
        assertEquals("sucess",5,obj_d.div(10,2));
    }
    @Test
    public  void testSub(){
        Subtraction obj_s= new Subtraction();
        assertEquals("success",3,obj_s.sub(9,6));
    }

    @Test
    public  void testMul(){
        Multiplication obj_m= new Multiplication();
        assertEquals("Success",4,obj_m.mul(2,2));
    }

}