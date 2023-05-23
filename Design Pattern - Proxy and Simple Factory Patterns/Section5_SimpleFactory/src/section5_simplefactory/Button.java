
package section5_simplefactory;


public abstract class Button {
    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
      public abstract String getType();
}
