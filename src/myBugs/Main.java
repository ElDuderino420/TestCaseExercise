package myBugs;

public class Main {

    public static void main(String[] args) {
	// write your code here


        MyArrayListWithBugs test = new MyArrayListWithBugs();
        System.out.println(test.nextFree);
        test.add("test1");
        System.out.println(test.nextFree);

        System.out.println(test.get(0));

        System.out.println(test.remove(0));

        test.add("test2");
        test.add("test3");
        test.add("test4");
        System.out.println(test.nextFree);
        System.out.println(test.get(0));
        System.out.println(test.get(1));
        System.out.println(test.get(2));
        System.out.println(test.size());

        test.add(3,"test5");
        System.out.println(test.nextFree);

    }
}
