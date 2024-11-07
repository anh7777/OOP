package oop.pattern.iterator.exe2;

import java.util.List;

class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String profileId, type;
    private int currentPosition;
    private List<Profile> cache;

    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }

    private void lazyInit() {
        if (cache == null) {
            cache = facebook.socialGraphRequest(profileId, type);
        }
    }

    public Profile getNext() {
        if (hasMore()) {
            currentPosition++;
            return cache.get(currentPosition);
        }
        return null;
    }

    public boolean hasMore() {
        lazyInit();
        return currentPosition < cache.size() - 1;
    }
}
