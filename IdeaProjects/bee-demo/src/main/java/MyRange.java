public class MyRange {
    private final String input;

    public MyRange(String input) {
        this.input = input;
    }

    public int getStart() {
        if(isStartWithInclude()) {
            return Integer.parseInt(String.valueOf(this.input.charAt(1)));
        }
        return -1;
    }

    public boolean isStartWithInclude() {
        return this.input.startsWith("[");
    }
}
