import models.Skyscraper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SkyscraperTest {
    Skyscraper skyscraper;

    @BeforeEach
    public void setUp(){
        skyscraper = new Skyscraper("TallThing", true);
    }

    @Test
    public void canGetNumberOfFloors(){
        assertThat(skyscraper.getNumberOfFloors()).isEqualTo(256);

    }

    @Test
    public void canInspect() {
        String result = skyscraper.inspect(true);
        assertThat(result).isEqualTo("TallThing has been inspected which is true");
    }
}
