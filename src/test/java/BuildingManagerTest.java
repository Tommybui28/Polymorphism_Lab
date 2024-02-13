import models.BuildingManager;
import models.Skyscraper;
import models.Warehouse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BuildingManagerTest {
    BuildingManager buildingManager;

    @BeforeEach
    public void setUp(){
        buildingManager = new BuildingManager();
    }

    @Test
    public void canCountStructure(){
        assertThat(buildingManager.countStructureTypes()).isEqualTo(0);
    }

    @Test
    public void canAddStructure(){
        Skyscraper skyscraper = new Skyscraper("TallThing", true);
        Warehouse warehouse = new Warehouse("Amazon", 1000.25, false);

        buildingManager.canAddStructure(skyscraper);
        buildingManager.canAddStructure(warehouse);

        assertThat(buildingManager.countStructureTypes()).isEqualTo(2);

    }

}
