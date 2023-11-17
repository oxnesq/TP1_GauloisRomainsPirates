public enum Grade {
    CHEF (1),
    CENTURION (2),
    LEGIONNAIRE(3);

    private int valueGrade;
    Grade(int i) {
        this.valueGrade=i;
    }

    public int getValueGrade() {
        return valueGrade;
    }
}
