package via.doc1.spring_boot_docker_app1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import via.doc1.spring_boot_docker_app1.model.Story;
import via.doc1.spring_boot_docker_app1.services.StoryService;

@RestController
public class StoryController {
private final StoryService storyService;

    public StoryController(@RequestBody StoryService storyService) {
        this.storyService = storyService;
    }

    @PostMapping("/stories")
    public Story addStory(Story story) {
        return storyService.addStory(story);
    }


    @GetMapping("/stories")
    public List<Story> getAllStories() {
        return storyService.getAllStories();
    }
}
