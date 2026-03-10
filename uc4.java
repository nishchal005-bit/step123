public class OOPSBanner {

    public static void main(String[] args) {

        // String array storing each line of the banner
        String[] banner = {
            " *****    *****    *****    ***** ",
            "*     *  *     *  *     *  *     *",
            "*     *  *     *  *     *  *     *",
            "*     *  *     *  *     *  *     *",
            "*     *  *     *  *     *  *     *",
            " *****    *****    *****    ***** "
        };

        // Loop to print each line
        for (int i = 0; i < banner.length; i++) {
            System.out.println(banner[i]);
        }
    }
}
