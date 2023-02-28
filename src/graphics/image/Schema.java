package graphics.image;

public class Schema implements TextColorSchema {
    private final char[] digits;

    public Schema(char[] digits) {
        this.digits = digits;
    }

    @Override
    public char convert(int color) {
        int i = (int) Math.round((double)(color * (digits.length - 1) / 255));
        return digits[i];
    }

}
