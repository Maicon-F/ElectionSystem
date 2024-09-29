package me.dio;

import domain.Candidate;
import domain.CandidateRepository;
import domain.CandidateService;
import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;

import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

@QuarkusTest
public class CandidateServiceTest {

    @Inject
    private CandidateService service;

    @InjectMock
    private CandidateRepository repository;

    @Test
    void save() {
        Candidate candidate = Instancio.create(Candidate.class);
        service.save(candidate);
        verify(repository).save(candidate);
        verifyNoMoreInteractions(repository);
    }

    @Test
    void findAll() {
        service.findAll();
    }
}
