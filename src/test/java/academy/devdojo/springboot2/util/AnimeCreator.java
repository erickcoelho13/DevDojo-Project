package academy.devdojo.springboot2.util;

import academy.devdojo.springboot2.domain.Anime;

public class AnimeCreator {

    public static Anime createAnimeToBeSaved() {
        return Anime.builder()
                .name("Hakuna matata 2")
                .build();
    }

    public static Anime createValidAnime() {
        return Anime.builder()
                .name("DragonBall")
                .id(1L)
                .build();
    }

    public static Anime createValidUpdatedAnime() {
        return Anime.builder()
                .name("Pokemon")
                .id(1L)
                .build();
    }
}


