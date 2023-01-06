//71. Simplify Path
import java.util.Stack;

public class Simplify_Path_71 {

    public static void main(String[] args) {

    }

    static class Solution {
        public String simplifyPath(String path) {
            String[] dirs = path.split("/");
            Stack<String> stack = new Stack<>();

            for (String dir : dirs) {
                if (dir.isEmpty() || dir.equals(".")) continue;
                if (dir.equals("..")) {
                    if (!stack.isEmpty())
                        stack.pop();
                } else {
                    stack.push(dir);
                }
            }

            return "/" + String.join("/", stack);
        }
    }

}
