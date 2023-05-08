package homeworks.hw0405.task1;
/*
Продолжить реализацию листа, реализовать несколько методов на своё усмотрение.
* */
public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Hi");
        myArrayList.add("dear");
        System.out.println("The first version of array: " + myArrayList);
        System.out.println();

        System.out.println("Size of array is: " + myArrayList.size(myArrayList.getList()));
        System.out.println();

        myArrayList.add("dear");
        myArrayList.add("friend1");
        myArrayList.add("friend2");
        myArrayList.add("friend3");
        myArrayList.add("friend4");
        myArrayList.add("friend5");
        myArrayList.add("friend6");
        myArrayList.add("friend7");
        myArrayList.add("friend8");
        myArrayList.add("friend9");
        myArrayList.add("friend10");
        myArrayList.add("friend11");
        myArrayList.add("friend12");
        myArrayList.add("friend13");
        System.out.println("Add method: " + myArrayList);
        System.out.println("Size of array is: " + myArrayList.size(myArrayList.getList()));
        System.out.println();

        myArrayList.set("my", 1);
        System.out.println("Set method: " + myArrayList);
        System.out.println("Size of array is: " + myArrayList.size(myArrayList.getList()));
        System.out.println();


        myArrayList.removeElementByIndex(1);
        System.out.println("Remove method: " + myArrayList);
        System.out.println("Size of array is: " + myArrayList.size(myArrayList.getList()));
        System.out.println();



    }
}
