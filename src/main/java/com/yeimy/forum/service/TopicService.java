package com.yeimy.forum.service;

import com.yeimy.forum.model.Topic;
import com.yeimy.forum.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public Topic getTopicById(Long id) {
        return topicRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Topic not found with id: " + id));
    }

    public Topic createTopic(Topic topic) {
        return topicRepository.save(topic);
    }

    public Topic updateTopic(Long id, Topic updatedTopic) {
        Topic existingTopic = topicRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Topic not found with id: " + id));

        existingTopic.setTitle(updatedTopic.getTitle());
        existingTopic.setMessage(updatedTopic.getMessage());
    
        return topicRepository.save(existingTopic);
    }

    public void deleteTopic(Long id) {
        if (!topicRepository.existsById(id)) {
            throw new RuntimeException("Topic not found with id: " + id);
        }
        topicRepository.deleteById(id);
    }
}
