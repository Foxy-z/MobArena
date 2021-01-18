package fr.foxyz.mobarena.core.objects.arena;

public class ArenaDoor {

    private final int minX;
    private final int minZ;
    private final int maxX;
    private final int maxZ;

    private final int height;

    public ArenaDoor(int minX, int minZ, int maxX, int maxZ, int height) {
        this.minX = minX;
        this.minZ = minZ;
        this.maxX = maxX;
        this.maxZ = maxZ;
        this.height = height;
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
}
