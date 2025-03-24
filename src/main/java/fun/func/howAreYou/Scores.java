package fun.func.howAreYou;

public class Scores {
    public static void main (String[] args) {
        int[] scores = {87,93,75,92,83,100,74,88};
        System.out.println(scores.length);
        // 遍历数组时使用length具有很好的可扩展性
        for (int i = 1; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();

        // 变量为拥有者
        int c = 5;
        // 数组变量为管理者
        int[] a = new int[10];
        a[0] = 5;
        int[] b = a;
        System.out.println(a[0]);
        b[0] = 16;
        System.out.println(b[0]);
        System.out.println(a[0]);

        /*
        数组变量是数组的管理者而非数组本身
        数组变量之间的赋值是管理权的授予
        数值变量相等意味着他们管理者同一个数组
        所以判断两个数组内所有元素是否相等，不能直接用==，要依次遍历所有数组元素来对比
         */
        int[] a1 = {1,2,3,4,5};
        int[] a2=a1;
        for (int i = 0; i < a2.length; i++){
            a2[i] ++;
        }
        for (int i = 0; i < a1.length; i++){
            System.out.println(a1[i]);
        }

        int[] e = {1,2,3,4,5};
        int[] f = e;
        int[] g = {1,2,3,4,5};

        System.out.println(e==f);
        System.out.println(e==g);

        int[] h = {1,2,3,4,5};
        int[] j = new int[h.length];
        for (int i=0;i<j.length;i++) {
            j[i] = h[i];
        }
        for (int i=0;i<j.length;i++) {
            System.out.println(j[i]);
        }
        System.out.println(h==j);

        boolean isEqual = true;
        for (int i=0; i<j.length; i++) {
            if (j[i]!=h[i]) {
                isEqual = false;
                break;
            }
        }
        System.out.println(isEqual);

    }
}
