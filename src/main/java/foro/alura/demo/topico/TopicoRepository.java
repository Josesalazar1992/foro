package foro.alura.demo.topico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;

public interface TopicoRepository extends JpaRepository<Topico, Long> {


}
