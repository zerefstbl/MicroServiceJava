package pdev.com.agenda.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import pdev.com.agenda.domain.entity.Paciente;
import pdev.com.agenda.domain.repository.PacienteRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class PacienteService {

    private final PacienteRepository repository;

    public Paciente save(Paciente paciente) {
        return repository.save(paciente);
    }

    public List<Paciente> listAll() {
        return repository.findAll();
    }

    public Optional<Paciente> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
