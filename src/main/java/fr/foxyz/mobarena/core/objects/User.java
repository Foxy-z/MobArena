package fr.foxyz.mobarena.core.objects;

import java.util.*;

public class User {

    private final UUID uuid;

    private static final Map<UUID, User> USERS = new LinkedHashMap<UUID, User>();

    public User(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public static User getUser(UUID userId) {
        return USERS.get(userId);
    }

    public static void storeUser(User user) {
        USERS.put(user.getUuid(), user);
    }

    public static void removeFromCache(UUID userId) {
        USERS.remove(userId);
    }
}
