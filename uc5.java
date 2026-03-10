public class OOPSBannerUC5 {
    public static void main(String[] args) {

        // Declare and initialize banner lines using inline array initialization
        String[] banner = {
            String.join("  ",
                    "*   *",
                    " *** ",
                    " *** ",
                    "* ***"),
            String.join("  ",
                    "*   *",
                    "*   *",
                    "*   *",
                    "* * *"),
            String.join("  ",
                    "*   *",
                    "*   *",
                    "*   *",
                    "*   *"),
            String.join("  ",
                    "*   *",
                    "*   *",
                    "*   *",
                    "*   *"),
            String.join("  ",
                    "*   *",
                    " *** ",
                    " *** ",
                    "*   *")
        };

        // Loop to print each banner line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
