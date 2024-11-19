package baseball.constant;

public enum Constant {
    NUMBER_LENGTH(3);


    private final int constant;

    private Constant(int constant) {
        this.constant = constant;
    }

    public int getConstant() {
        return constant;
    }
}
