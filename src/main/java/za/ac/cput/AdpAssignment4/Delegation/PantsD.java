package za.ac.cput.AdpAssignment4.Delegation;

public class PantsD {

    // the "delegator"
    ProductD p = new ProductD();

    // create the delegate
    public void print()
    {
        p.print(); // delegation
    }

}
