public class StringOperations {
    public static void main(String[] args){

        String str1 = "Something Is Better";
        String str2 = " Than Nothing";

        //concatenation
        System.out.println(str1+str2);
        System.out.println(str1.concat(str2));

        //Length
        System.out.println(str1.length());
        System.out.println(str2.length());

        //Substring
        String subs = str1.substring(0,9);
        System.out.println(subs);

        //CharAT
        char charat = str1.charAt(8);
        System.out.println(charat);

        //toUpperCase() , toLowerCase()
        System.out.println(str1.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println(str1.toUpperCase() + str2.toLowerCase());

        //equals()
        if (str2.equals(" Than Nothing")){
            System.out.println("ITS EQUAL.....");
        }
        if (!str2.equals(str1)){
            System.out.println("ITS NOT EQUAL.....");
        }

        //equalsIgnoreCase()
        if (str2.equalsIgnoreCase(" than nothing")){
            System.out.println("ITS EQUAL.....");
        }

        //compareTo()
        int comp = str2.compareTo(str1);
        System.out.println(comp);


        //indexOf()
        int index = str1.indexOf("Better");
        System.out.println("Index is : "+ index);

        //contains()
        if (str2.contains("Than")){
            System.out.println("it contains 'Than'");
        }

        //join()
        String[] words = {"hey","its","saturday"};
        System.out.println(String.join(" * ",words));


    }
}
