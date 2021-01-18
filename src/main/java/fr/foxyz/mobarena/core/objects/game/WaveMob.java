package fr.foxyz.mobarena.core.objects.game;

import fr.foxyz.mobarena.core.objects.mob.MobTemplate;

public class WaveMob {

    private final MobTemplate template;

    private final int count;
    private final int delay;

    public WaveMob(MobTemplate template, int count, int delay) {
        this.template = template;
        this.count = count;
        this.delay = delay;
    }
}
