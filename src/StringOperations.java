public class StringOperations {
    public static void main(String[] args) {
        String first = "Something Is Better";
        String second = " Than Nothing";

        System.out.println(first + second);
        System.out.println(first.concat(second));
        System.out.println(first.length());
        System.out.println(second.length());
        String substring = first.substring(0, 9);
        System.out.println(substring);
        char ch = first.charAt(8);
        System.out.println(ch);
        System.out.println(first.toUpperCase());
        System.out.println(second.toLowerCase());
        System.out.println(first.toUpperCase() + second.toLowerCase());

        if (second.equals(" Than Nothing")) {
            System.out.println("ITS EQUAL.....");
        }
        if (!second.equals(first)) {
            System.out.println("ITS NOT EQUAL.....");
        }
        if (second.equalsIgnoreCase(" than nothing")) {
            System.out.println("ITS EQUAL.....");
        }

        int compare = second.compareTo(first);
        System.out.println(compare);
        int index = first.indexOf("Better");
        System.out.println("Index : " + index);
        if (second.contains("Than")) {
            System.out.println("it contains 'Than'");
        }

        String[] parts = {"hey", "its", "saturday"};
        System.out.println(" *" + String.join(" *", parts));
    }
}