package slw.game.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ColorSequenceGeneratorTest {

    private ColorSequenceGenerator gen;

    @Test
    public void basic(){
        gen = new ColorSequenceGenerator();
        Sequence seq = gen.createSequence();
        assertNotNull(seq);
        assertEquals(1, seq.length());
        Color color = seq.get(0);
        assertEquals(Color.RED, color);
        seq.addAColor();
        assertEquals(2, seq.length());
    }
}
