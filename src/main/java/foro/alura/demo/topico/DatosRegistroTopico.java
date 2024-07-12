package foro.alura.demo.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DatosRegistroTopico(@NotBlank String titulo,
                                  @NotBlank @Pattern(regexp = "\\d{4,6}") String mensaje,
                                  @NotBlank String fechaDeCreacion,
                                  @NotBlank String status,
                                  @NotBlank String autor,
                                  @NotBlank String curso) {


}
