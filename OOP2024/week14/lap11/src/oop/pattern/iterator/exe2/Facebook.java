package oop.pattern.iterator.exe2;

import java.util.ArrayList;
import java.util.List;

class Facebook implements SocialNetwork {

    public List<Profile> socialGraphRequest(String profileId, String type) {
        List<Profile> profiles = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            profiles.add(new Profile("Profile_" + i, "profile" + i + "@facebook.com"));
        }

        return profiles;
    }
    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return new FacebookIterator(this, profileId, "friends");
    }
    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return new FacebookIterator(this, profileId, "coworkers");
    }
}