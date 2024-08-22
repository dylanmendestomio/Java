package atividade.art;

import javax.validation.constraints.NotNull;

public class CalculadoraDTO {
    @NotNull(message = "O número 1 não pode ser nulo")
    private Double numero1;

    @NotNull(message = "O número 2 não pode ser nulo")
    private Double numero2;

    // Getters e Setters
    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }
}
