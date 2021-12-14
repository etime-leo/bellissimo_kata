import com.kata.Tamagotchi;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class TamagotchiTest {


    @Test
    void feeding_Tamagotchi_should_decrease_its_hungriness() {
        Tamagotchi tamagotchi = new Tamagotchi();

        int initialHungriness = tamagotchi.getHungriness();
        tamagotchi.feed();

        assertThat(tamagotchi.getHungriness()).isEqualTo(initialHungriness - 1);
    }
}
