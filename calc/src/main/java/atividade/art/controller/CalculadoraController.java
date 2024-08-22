package atividade.art.controller;

import atividade.art.CalculadoraDTO;
import atividade.art.ResultadoDTO;
import atividade.art.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    private final CalculadoraService calculadoraService;

    @Autowired
    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @PostMapping("/soma")
    public ResponseEntity<ResultadoDTO> somar(@RequestBody @Valid CalculadoraDTO calculadoraDTO) {
        double resultado = calculadoraService.somar(calculadoraDTO.getNumero1(), calculadoraDTO.getNumero2());
        ResultadoDTO resultadoDTO = new ResultadoDTO(calculadoraDTO.getNumero1(), calculadoraDTO.getNumero2(), resultado);
        return ResponseEntity.ok(resultadoDTO);
    }

    @PostMapping("/subtracao")
    public ResponseEntity<ResultadoDTO> subtrair(@RequestBody @Valid CalculadoraDTO calculadoraDTO) {
        double resultado = calculadoraService.subtrair(calculadoraDTO.getNumero1(), calculadoraDTO.getNumero2());
        ResultadoDTO resultadoDTO = new ResultadoDTO(calculadoraDTO.getNumero1(), calculadoraDTO.getNumero2(), resultado);
        return ResponseEntity.ok(resultadoDTO);
    }

    @PostMapping("/multiplicacao")
    public ResponseEntity<ResultadoDTO> multiplicar(@RequestBody @Valid CalculadoraDTO calculadoraDTO) {
        double resultado = calculadoraService.multiplicar(calculadoraDTO.getNumero1(), calculadoraDTO.getNumero2());
        ResultadoDTO resultadoDTO = new ResultadoDTO(calculadoraDTO.getNumero1(), calculadoraDTO.getNumero2(), resultado);
        return ResponseEntity.ok(resultadoDTO);
    }

    @PostMapping("/divisao")
    public ResponseEntity<ResultadoDTO> dividir(@RequestBody @Valid CalculadoraDTO calculadoraDTO) {
        double resultado = calculadoraService.dividir(calculadoraDTO.getNumero1(), calculadoraDTO.getNumero2());
        ResultadoDTO resultadoDTO = new ResultadoDTO(calculadoraDTO.getNumero1(), calculadoraDTO.getNumero2(), resultado);
        return ResponseEntity.ok(resultadoDTO);
    }
}
