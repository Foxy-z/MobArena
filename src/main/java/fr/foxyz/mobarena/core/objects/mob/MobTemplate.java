package fr.foxyz.mobarena.core.objects.mob;

import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

public class MobTemplate {

    private final EntityType mobType;
    private final ItemStack[] armors;

    public MobTemplate(EntityType mobType, ItemStack[] armors) {
        this.mobType = mobType;
        this.armors = armors;
    }


}
