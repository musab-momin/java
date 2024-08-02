package Enumerations;

public enum SeverityLevel {
    LOW(1, "L"),
    MEDIUM(2, "M"),
    HIGH(3, "H"),
    CRITICAL(4, "C");

    private final int levelCode;
    private String shortForm;

    SeverityLevel(int levelCode, String shortForm) {
        this.levelCode = levelCode;
        this.shortForm = shortForm;
    }

    public int getLevelCode() {
        return levelCode;
    }

    public String getShortForm() {
        return shortForm;
    }

    // @Override
    // public String toString() {
    // return "SeverityLevel{" +
    // "name=" + name() +
    // ", levelCode=" + levelCode +
    // '}';
    // }
}