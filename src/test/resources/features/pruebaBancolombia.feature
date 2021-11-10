# Autor: Jahaziel De Salas

@stories
Feature: Reto técnico de Automatización
  un usuario necesita entrar a la pagina de Bancolombia cambiar la tasa de interes

  @scenario
  Scenario: Cambio de tasa de interes
    Given Jahaziel necesita entrar a Bancolombia
    When ingregar a la seccion donde se cambia la tasa de interes
    Then validar que la informacion es correcta

