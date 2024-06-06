package Ders_11;

public class M_03_JavaRenkKodlari {
    public static void main(String[] args) {
        System.out.println("Normal metin");
        System.out.println(TerminalColors.RED + "Kırmızı metin" + TerminalColors.RESET);
        System.out.println(TerminalColors.GREEN + "Yeşil metin" + TerminalColors.RESET);
        System.out.println(TerminalColors.YELLOW + "Sarı metin" + TerminalColors.RESET);
        System.out.println(TerminalColors.BLUE + "Mavi metin" + TerminalColors.RESET);
        System.out.println(TerminalColors.PURPLE + "Mor metin" + TerminalColors.RESET);
        System.out.println(TerminalColors.CYAN + "Camgöbeği metin" + TerminalColors.RESET);
        System.out.println(TerminalColors.WHITE + "Beyaz metin" + TerminalColors.RESET);
        System.out.println(TerminalColors.BOLD + "Kalın metin" + TerminalColors.RESET);
        System.out.println(TerminalColors.UNDERLINE + "Altı çizgili metin" + TerminalColors.RESET);

    }

    public class TerminalColors {
        // Renkli metin oluşturmak için ANSI kaçış karakterleri kullanılır.
        public static final String RESET = "\u001B[0m";
        public static final String BLACK = "\u001B[30m";
        public static final String RED = "\u001B[31m";
        public static final String GREEN = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
        public static final String BLUE = "\u001B[34m";
        public static final String PURPLE = "\u001B[35m";
        public static final String CYAN = "\u001B[36m";
        public static final String WHITE = "\u001B[37m";
        public static final String BOLD = "\u001B[1m";
        public static final String UNDERLINE = "\u001B[4m";
    }

}
