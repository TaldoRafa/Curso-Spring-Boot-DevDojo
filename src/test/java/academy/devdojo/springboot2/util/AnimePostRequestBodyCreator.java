package academy.devdojo.springboot2.util;

import academy.devdojo.springboot2.requests.AnimePostRequestBody;

public class AnimePostRequestBodyCreator {
    public static AnimePostRequestBody createAnimePostRequestBodyToBeSave() {
        return AnimePostRequestBody.builder()
                .name(AnimeCreator.createAnimeToBeSave().getName())
                .build();
    }
}
