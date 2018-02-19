package slw.game.model;

import java.util.ArrayList;
import java.util.List;

public class Sequence {

    private List<Color> colors = new ArrayList<>();

    public Sequence() {
        addAColor();
    }

    public int length() {
        return colors.size();
    }

    public Color get(int index) {
        return colors.get(index);
    }

    public void addAColor() {
        Color newColor = getRandomColor();
        colors.add(newColor);
    }

    private Color getRandomColor() {
        return Color.RED;
    }

}
