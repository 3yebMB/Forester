import java.util.HashMap;
import java.util.Map;

public class Counter {
    private char[] input;

    public Counter(char[] input) {
        this.input = input;
    }

    public void info() {
        String str = new String(input);
        String[] tmp = str.split("\r\n |\r\n| "); // разбиваем лес, на отдельные деревья
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < tmp.length; i++) {
            Integer current = hm.get(Integer.valueOf(tmp[i]));
            hm.put(Integer.valueOf(tmp[i]), current == null ? 1 : current + 1);
        } // подсчитываем кол-во деревьев

        System.out.println("Лесник обошёл лес и подсчитал все деревья :");
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            System.out.printf("\t%s (%d) - %d\r\n", getTreeName(entry.getKey()), entry.getKey(), entry.getValue());
        }
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
