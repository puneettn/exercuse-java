package Java_9_17;

public class Question_10 {
    //Demonstrate the use of repeat, strip, isBlank, indent,
    // transform, stripIndent, translateEscapes, formatted String methods.
    public static void main(String[] args) {
        String str = "This is a beautiful Company !!!";
        System.out.println(str.repeat(2));

        String complexWhitespacesString = "\u2005\u2005\u2005\u2005  This is a strange string  ";
        System.out.println(complexWhitespacesString.strip());

        System.out.println("\n\u2005   ".isBlank());
        System.out.println("\n\u2005   ".isEmpty());


        String multiLineString = """
                This is line 1.
                      This is line 2.
                """;
        System.out.println(multiLineString);

        String html =
                        "\t<html>\n"+
                        "\t\t<body>\n"+
                        "\t\t\t<p>Hello World</p>\n"+
                        "\t\t</body>\n"+
                        "\t<html>";

        System.out.println(html);
        System.out.println(html.stripIndent());

        System.out.println("\"Hello \\n world \"");
        System.out.println("\"Hello \\n world \"".translateEscapes());

        System.out.println(String.format("Java %s","17"));
        System.out.println("Java %s".formatted("17"));

        String multiLine = """
                This is line 1.\
                This is line 2.
                """;

        System.out.println(multiLine);
    }
}