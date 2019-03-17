package za.ac.cput.AdpAssignment4;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.AdpAssignment4.Delegation.PantsD;
import za.ac.cput.AdpAssignment4.Delegation.ProductD;
import za.ac.cput.AdpAssignment4.Encapsulation.Person;
import za.ac.cput.AdpAssignment4.Inheritance.Pants;
import za.ac.cput.AdpAssignment4.Inheritance.Product;
import za.ac.cput.AdpAssignment4.Polymorphism.LoanInterest;
import za.ac.cput.AdpAssignment4.Polymorphism.Student;
import za.ac.cput.AdpAssignment4.Polymorphism.UnderGrad;

public class OOPTest {


    @Test
    public void encapsulationTest() {

        Person p = new Person();
        p.setName("Mike");
        Assert.assertEquals("Mike",p.getName());

    }

    @Test

    public void inheritanceTest(){

        Pants pt = new Pants("Jean",350,"Blue",32);
        Assert.assertEquals("Pants",pt.getType());

    }
    @Test

    public void delegateTest(){

        PantsD pts = new PantsD();
        pts.print();


    }

    @Test

    public void polyTest(){

        Student und = new UnderGrad("John","2137",200);
        Student s = und;
        //LoanInterest l =und;
        Assert.assertEquals(24,((UnderGrad) und).interest(),0);


    }



}

