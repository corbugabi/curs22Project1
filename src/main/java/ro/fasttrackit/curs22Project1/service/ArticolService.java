package ro.fasttrackit.curs22Project1.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.curs22Project1.model.entity.Articol;
import ro.fasttrackit.curs22Project1.repository.ArticolRepository;

import java.util.List;
@Service
public class ArticolService {
    private final ArticolRepository repository;

    public ArticolService(ArticolRepository repository) {
        this.repository = repository;
    }

    public List<Articol> getAll() {
        return repository.findAll();
    }
}
