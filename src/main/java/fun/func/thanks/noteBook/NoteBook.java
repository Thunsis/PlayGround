package fun.func.thanks.noteBook;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Value {
    private int value;

    public int get() {
        return value;
    }

    public void set(int value) {
        this.value = value;
    }
}

public class NoteBook {

    private ArrayList<String> notes = new ArrayList<String>();
    // 用来存放String的一个ArrayList，泛型类，一种容器
    // 容器类有两个类型：容器的类型，如ArrayList，元素的类型，如String

    public void add(String s) {

        notes.add(s);
    }

    public void add(String s, int location) {

        notes.add(location, s);

    }

    public int getSize() {

        return notes.size();

    }

    public String getNote(int index) {

        return notes.get(index);
    }


    public void deleteNote(int index) {

        notes.remove(index);

    }

    public String[] list() {
        String[] a = new String[notes.size()];
//        for (int i = 0; i < notes.size(); i++) {
//            a[i] = notes.get(i);
//        }
        notes.toArray(a);
        return a;
    }



    public static void main(String[] args) {

        NoteBook nb = new NoteBook();
        System.out.println(nb.getSize());
        nb.add("first");
        nb.add("second");
        System.out.println(nb.getSize());
        System.out.println(nb.getNote(0));
        System.out.println(nb.getNote(1));

        nb.add("third", 1);
        System.out.println(nb.getNote(0));
        System.out.println(nb.getNote(1));
        nb.deleteNote(0);
        System.out.println(nb.getNote(0));
        nb.add("second");
        nb.add("third");
        String[] a = nb.list();
        for (String s : a) {
            System.out.println(s);
        }

        int[] ia = new int[10];
        String[] sa = new String[10];
        System.out.println(ia[0]);
        System.out.println(sa[0]);
        // 对象数组的每一项都是每项指代的对象的管理者而非对象本身
        // 在对象数组内的某一项所管理的对象被初始化之前，其值为null，null没有长度，会报错，null+a = nulla
        for (int i: ia) {
            System.out.println(i);
        }
        for (int i: ia) {
            i = 1;
        } // 基本元素数组在for-each循环中赋值不会起作用，因为for-each的每一项都是复制品
        for (int i: ia) {
            System.out.println(i);
        }


        Value[] v = new Value[10];

        for (int i = 0; i < v.length; i++) {
            v[i] = new Value();
            v[i].set(i);
        } //在对象数组内的某一项所管理的对象都需要先经过初始化，才能对其进行其他操作
        for (Value s: v) {
            System.out.println(s.get());
        }

        for (Value s: v) {
            s.set(0);
        } // mutable对象数组在for-each循环中赋值会起作用，因为for-each的Elements hold a reference(not a copied) to the actual Value object, not the objects themselves
        for (Value s: v) {
            System.out.println(s.get());
        }

        String[] a2 = new String[10];

        for (int i = 0; i < a2.length; i++) {
            a2[i] = ""+i;
        } //在对象数组内的某一项所管理的对象都需要先经过初始化，才能对其进行其他操作
        for (String s: a2) {
            System.out.println(s);
        }

        for (String s: a2) {
            s = " 0";
        } // immutable对象数组在for-each循环中赋值不会起作用，因为for-each的Elements holds a copy of the reference to the String object, not the objects themselves.
        // And since it is immutable, meaning once a String object is created, it cannot be changed.

        for (String s: a2) {
            System.out.println(s);
        }

        ArrayList<String> note = new ArrayList<String>();
        note.add("first");
        note.add("second");
        for (String s: note) {
            System.out.println(s);
        } // 容器也可以用for-each


//        Here is the summary of the differences between int[], String[], and Value[] in Java:
//        int[]:
//        Stores primitive int values.
//        Elements are directly stored in the array.
//                Default value for uninitialized elements is 0.
//        String[]:
//        Stores references to String objects.
//                Elements are references to String objects, not the objects themselves.
//                Default value for uninitialized elements is null.
//                String is immutable, so the objects themselves cannot be modified.
//        The loop variable in a for-each loop holds a copy of the reference to the String object, and assigning a new value to the loop variable does not change the original array element.
//        Value[]:
//        Stores references to Value objects (a user-defined class).
//        Elements are references to Value objects, not the objects themselves.
//                Default value for uninitialized elements is null.
//                Value is mutable, so the objects themselves can be modified.
//        The loop variable in a for-each loop holds a reference to the actual Value object, and modifying the object through this reference will affect the original object in the array.
    }
}

