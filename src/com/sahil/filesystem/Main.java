import com.sahil.filesystem.Directory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("/", null);
        root.setParent(root);
        Directory d1 = new Directory("a", root);
        String path = d1.getParent().pwdRecursive();
        if(path.isEmpty()){
            System.out.print("/");
        }else {
            System.out.print(path);
        }
        System.out.print(validateAlphaNumeric("s"));
    }

    public static Boolean validateAlphaNumeric(String value) {
        return value.matches("[a-zA-Z0-9]");
    }
}