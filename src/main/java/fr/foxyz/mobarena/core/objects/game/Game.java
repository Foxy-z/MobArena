package fr.foxyz.mobarena.core.objects.game;

import fr.foxyz.mobarena.core.objects.arena.Arena;

import java.util.*;

public class Game {

    private final Arena arena;
    private final List<Wave> waves;

    private final Set<UUID> players;
    private final Set<UUID> operators;

    public Game(Arena arena) {
        this.arena = arena;
        this.waves = new LinkedList<Wave>();
        this.players = new LinkedHashSet<UUID>();
        this.operators = new LinkedHashSet<UUID>();
    }
}
