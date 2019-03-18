package hello;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CharacterRepository extends MongoRepository<Character, String> {

    public List<Character> findByName(String name);

}