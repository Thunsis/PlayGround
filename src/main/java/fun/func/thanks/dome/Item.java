package fun.func.thanks.dome;

/*
    public:
    The member is accessible from any other class.
    There are no restrictions on visibility.
    protected:
    The member is accessible within its own package and by subclasses (including subclasses in different packages).
    private:
    The member is accessible only within its own class.
    It is not visible to any other class.
    default (no modifier):
    The member is accessible only within its own package.
    It is also known as package-private.
*/
public class Item {

    private String title; // protected修饰的内容可以被同一个包内或子类访问
    private int playTime;
    private Boolean gotIt = false;
    private String comment;

    public Item() {

    }

    public Item(String title, int playTime, Boolean gotIt, String comment) {
        this.title = title;
        this.playTime = playTime;
        this.gotIt = gotIt;
        this.comment = comment;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void print() {
        System.out.println(title + ":" + playTime);
    }

}
