public class Next {
    public static void main(String[] args){
        String a = "hello";
        String b = "world";
        String temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a +" "+ b);
    }
}
