public enum Month {
    JANUARY("Yanvar", 1),
    FEBRURAY("Fevral", 2),
    MARCH("Mart", 3),
    APRIL("Aprel", 4);

    String name;
    int ordinal;

    Month(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }
}