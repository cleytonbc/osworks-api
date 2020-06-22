package c.b.cleyton.osworks.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import c.b.cleyton.osworks.domain.model.OrdemServico;

@Service
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long>{

}
