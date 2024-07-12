package foro.alura.demo.controller;

import foro.alura.demo.topico.DatosListadoTopico;
import foro.alura.demo.topico.DatosRegistroTopico;
import foro.alura.demo.topico.Topico;
import foro.alura.demo.topico.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/topico")

public class TopicoController {
    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void  resgistraTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico){
        topicoRepository.save(new Topico(datosRegistroTopico));
    }

    @GetMapping
    public Page<DatosListadoTopico> listadoTopico(@PageableDefault(size = 2)Pageable paginacion){
        return topicoRepository.findAll(paginacion).map(DatosListadoTopico::new);
    }
}
