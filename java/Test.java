public class Test{
  public static void main(String[] args) {
        try {
            System.out.println(SecurityUtility.antiXSS("<script>alert(1);<script>")); //Dangerous Input
            System.out.println(SecurityUtility.antiXSS("<h1>Hello</h1>")); //Dangerous Input
            System.out.println(SecurityUtility.antiXSS("Hello")); //Hello
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
