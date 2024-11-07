package task2;

enum PackageSize {
    SMALL(40, 90),
    MEDIUM(90, 140),
    LARGE(140, 250),
    UNKNOWN(0, 0);
    private int minSize;
    private int maxSize;
    PackageSize(int minSize, int maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }
    public static PackageSize getPackageSize(int minSize, int
            maxSize) {
        for (PackageSize packageSize : values()) {
            if (minSize >= packageSize.minSize && maxSize <
                    packageSize.maxSize) {
                return packageSize;
            }
        }
        return UNKNOWN;
    }
}

