package interfaces.multipleImplementation;

public class BaseClassImplementation implements Interface1, Interface2 {

    @Override
    public void show() {
        System.out.println("show from BaseClassImpl");
        Interface1.super.show();
        Interface2.super.show();
    }


    public void show_test()
    {
       show_1();
    }

    public static void main(String args[]) {
        BaseClassImplementation baseObject = new BaseClassImplementation();
        baseObject.show();
        baseObject.show_1();
        baseObject.show_2();
    }
}
