
public class Pass {
    private int number;

    public Pass(int number) {
        if (number > 0) {
            this.number = number;
        } else {
            return;
        }
    }

    public int getNumber() {
        return number;
    }

}
