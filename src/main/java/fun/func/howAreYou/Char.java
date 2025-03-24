package fun.func.howAreYou;

public class Char {
    public static void main(String[] args) {
        // 字母和数字在unicode表中是顺序排列的
        // 大写字母和小写字母是分开排列的
        // 0041代表16进制数的编号
        char c = '\u0041';
        char d = 'D';
        // unicode编码排序后面那个字符
        System.out.println(d - c);
        System.out.println((int) c);
        char e = (char) (c + 'a' - 'A');
        System.out.println(e);
        c = 'a';
        e = (char) (c + 'A' - 'a');
        System.out.println(e);
        System.out.println('a' > 'A');
        System.out.println('汉' > 'a');

        // \b回退一个格子的位置
        System.out.println("abc\bd");

        // \t代表每行的固定位置（8个字符），不代表固定的字符输出数量
        System.out.println("abc\t123");
        System.out.println("a\t123");

        // \n换行 \r回车

    }
}
