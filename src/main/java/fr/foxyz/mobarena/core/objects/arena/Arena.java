package fr.foxyz.mobarena.core.objects.arena;

public class Arena {

    private final int minX;
    private final int minZ;
    private final int maxX;
    private final int maxZ;

    private final int height;

    private final ArenaDoor door;

    public Arena(int minX, int minZ, int maxX, int maxZ, int height, ArenaDoor door) {
        this.minX = minX;
        this.minZ = minZ;
        this.maxX = maxX;
        this.maxZ = maxZ;
        this.height = height;
        this.door = door;
    }

    public int getMinX() {
        return minX;
    }

    public int getMinZ() {
        return minZ;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxZ() {
        return maxZ;
    }

    public int getHeight() {
        return height;
    }

    public ArenaDoor getDoor() {
        return door;
    }
}
