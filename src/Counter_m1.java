public class Counter_m1 {
    private char[] input;

    public Counter_m1(char[] input) {
        this.input = input;
    }

    public void info() {
        System.out.println("");
    }

    private String getTreeName(int i) {
        String name = null;
        switch (i) {
            case 1 : name = "Ель"; break;
            case 2 : name = "Сосна"; break;
            case 3 : name = "Кедр"; break;
            case 4 : name = "Берёза"; break;
            case 5 : name = "Осина"; break;
            case 379 : name = "Пальма"; break;
            default: name = "Неизвестное дерево";
        }
        return name;
    }
}
