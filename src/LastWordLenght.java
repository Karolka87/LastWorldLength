public class LastWordLenght {
    public static void main(String[] args) {
        String[] tab = new String[3];
        String firstSentence = tab[0] = "Bookstore is closed since two weeks ago ";


        System.out.println(((firstSentence.split(" "))[firstSentence.split(" ").length - 1]).length());


    }
}
