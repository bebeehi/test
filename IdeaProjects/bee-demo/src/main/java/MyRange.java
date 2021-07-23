import java.util.List;

public class MyRange {
    private final String input;

    public MyRange(String input) {
        this.input = input;
    }

    public int getStart() {
        int result = 0;
        if(isStartWithInclude()) {
            result = Integer.parseInt(String.valueOf(this.input.charAt(1)));
        } else {
            result = Integer.parseInt(String.valueOf(this.input.charAt(1))) + 1;
        }
        return result;
    }

    public boolean isStartWithInclude() {
        return this.input.startsWith("[");
    }

    public boolean isEndWithInclude() {
        return this.input.endsWith("]");
    }

    public int getEnd() {
        if(isEndWithInclude()) {
            return this.input.charAt(3) - 48;
        }
        return this.input.charAt(3) - 49;
    }

    public String getResult() {
        int stratNumber = getStart();
        int endNumber = getEnd();
        String response = new String();
        int firstLoop = 1;
        for (int i = stratNumber; i <= endNumber; i++) {
            if(firstLoop > 1) {
                response = response + "," + (String.valueOf(i));
            } else {
                response = String.valueOf(i);
            }
            firstLoop++;
        }
        return response;
    }
}
