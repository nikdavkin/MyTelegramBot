package ru.tinkoff.edu.java.scrapper.controllers;

import org.springframework.web.bind.annotation.*;
import ru.tinkoff.edu.java.scrapper.dto.requests.AddLinkRequest;
import ru.tinkoff.edu.java.scrapper.dto.responses.LinkResponse;
import ru.tinkoff.edu.java.scrapper.dto.responses.ListLinksResponse;
import ru.tinkoff.edu.java.scrapper.dto.requests.RemoveLinkRequest;

@RestController
@RequestMapping("/links")
public class LinksController {
    @GetMapping(produces = "application/json")
    public ListLinksResponse getTrackedLinks(@RequestHeader("Tg-Chat-Id") Long id) {
        return null;
    }

    @PostMapping(produces = "application/json", consumes = "application/json")
    public LinkResponse addTrackOnLink(@RequestHeader("Tg-Chat-Id") Long id,
                                       @RequestBody AddLinkRequest addLinkRequest) {
        return null;
    }

    @DeleteMapping(produces = "application/json", consumes = "application/json")
    public LinkResponse removeTrackOnLink(@RequestHeader("Tg-Chat-Id") Long id,
                                          @RequestBody RemoveLinkRequest removeLinkRequest) {
        return null;
    }
}
