package task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        Video video = new Video("GOT1", "got1.com",
                VideoType.CLIP);
        Video video1 = new Video("GOT2", "got2.com",
                VideoType.EPISODE);
        Video video2 = new Video("GOT3", "got3.com",
                VideoType.PREVIEW);
        Video video3 = new Video("GOT4", "got4.com",
                VideoType.PREVIEW);
        Video video4 = new Video("GOT5", "got5.com",
                VideoType.CLIP);
        Video video5 = new Video("GOT6", "got6.com",
                VideoType.EPISODE);
        Episode episode = new Episode("got1", 1,
                Arrays.asList(video, video1));
        Episode episode1 = new Episode("got2", 2,
                Arrays.asList(video2, video3));
        Episode episode2 = new Episode("got3", 1,
                Arrays.asList(video4, video5));
        Season season = new Season("GOTS1", 1,
                Arrays.asList(episode, episode1));
        Season season1 = new Season("GOTS1", 2,
                Arrays.asList(episode2));
        List<Season> seasons = Arrays.asList(season, season1);
//list of episodes
        List<Episode> episodes = seasons.stream()
                .flatMap(s -> season.episodes.stream())
                .collect(Collectors.toList());
//list of videos
        List<Video> videos = seasons.stream()
                .flatMap(s -> season.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .collect(Collectors.toList());
//list of seasons names
        List<String> seasonNames = seasons.stream()
                .map(s -> s.seasonName)
                .collect(Collectors.toList());
//list of seasons numbers
        List<Integer> seasonNumbers = seasons.stream()
                .map(s -> s.seasonNumber)
                .collect(Collectors.toList());
//list of episodes names
        List<String> episodeNames = seasons.stream()
                .flatMap(s -> season.episodes.stream())
                .map(e -> e.episodeName)
                .collect(Collectors.toList());
//list of episodes numbers
        List<Integer> episodeNumbers = seasons.stream()
                .flatMap(s -> season.episodes.stream())
                .map(e -> e.episodeNumber)
                .collect(Collectors.toList());
//list of videos names
        List<String> videoNames = seasons.stream()
                .flatMap(s -> season.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .map(v -> v.title)
                .collect(Collectors.toList());
//list of videos urls
        List<String> videoUrls = seasons.stream()
                .flatMap(s -> season.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .map(v -> v.url)
                .collect(Collectors.toList());
//list of even episodes
        List<Episode> evenEpisodes = seasons.stream()
                .flatMap(s -> season.episodes.stream())
                .filter(e -> e.episodeNumber % 2 == 0)
                .collect(Collectors.toList());
//list of even seasons
        List<Season> evenSeasons = seasons.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .collect(Collectors.toList());
//list of even episodes and seasons
        List<Episode> evenEpisodesFromEvenSeasons =
                seasons.stream()
                        .filter(s -> s.seasonNumber % 2 == 0)
                        .flatMap(s -> season.episodes.stream())
                        .filter(e -> e.episodeNumber % 2 == 0)
                        .collect(Collectors.toList());
//list of clips videos from even episodes and odd seasons
        List<Video> clipVideoFromEvenEpisodesFromOddSeasons =
                seasons.stream()
                        .filter(s -> s.seasonNumber % 2 == 0)
                        .flatMap(s -> season.episodes.stream())
                        .filter(e -> e.episodeNumber % 2 != 0)
                        .flatMap(e -> e.videos.stream())
                        .filter(v -> v.videoType == VideoType.CLIP)
                        .collect(Collectors.toList());
//list of preview videos from odd episodes and even seasons
        List<Video> previewVideoFromOddEpisodesFromEvenSeasons =
                seasons.stream()
                        .filter(s -> s.seasonNumber % 2 != 0)
                        .flatMap(s -> season.episodes.stream())
                        .filter(e -> e.episodeNumber % 2 == 0)
                        .flatMap(e -> e.videos.stream())
                        .filter(v -> v.videoType == VideoType.PREVIEW)
                        .collect(Collectors.toList());
    }
}

