package fun.func.thanks.noteBook;

import java.lang.reflect.Array;
import java.util.ArrayList;

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

    }
}
