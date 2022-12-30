public class Main{
    public static void main(String[] args){

    }


    private static void findPath(int src, int target, int addend, int mult, String path) {
        if (src > target){
            return;
        }
        if (src ==  target) {
            System.out.println(path + " = " + target);
            return;
        }

        findPath(src: src + addend, target, addend, mult, path: path + " " + )
        findPath(src: src + mult, target, addend, mult, path: path + " " +  )
    }
}