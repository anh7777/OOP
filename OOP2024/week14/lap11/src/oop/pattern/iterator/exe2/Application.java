package oop.pattern.iterator.exe2;

class Application {
    private SocialNetwork network;
    private SocialSpammer spammer;

    public void config() {
        this.network = new Facebook();
        this.spammer = new SocialSpammer();
    }

    public void sendSpamToFriends(Profile profile) {
        ProfileIterator iterator = network.createFriendsIterator(profile.getId());
        spammer.send(iterator, "Very important message");
    }

    public void sendSpamToCoworkers(Profile profile) {
        ProfileIterator iterator = network.createCoworkersIterator(profile.getId());
        spammer.send(iterator, "Very important message");
    }
}
