public class practice1 {
    public static void main(String[] args) {
        String str = "이강인이 처음 우승을 했다.우승은 처음했지만 즐거웠다.";

        System.out.println(str.indexOf("처음"));
        System.out.println(str.lastIndexOf("처음"));
        System.out.println(str.indexOf("처음" , 3));
    }
}
