package domain;

import java.util.List;

public interface CandidateRepository {

    void save(List<Candidate> candidates);

    List<Candidate> findAll();

    default void save(Candidate candidate){
        save(List.of(candidate));
    }
}
