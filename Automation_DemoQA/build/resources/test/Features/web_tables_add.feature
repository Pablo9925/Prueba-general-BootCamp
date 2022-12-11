Feature: Automation web tables Add

  Scenario Outline: Agregar registro
    Given El cliente esta en la interfaz webtables
    When Desea agregar un nuevo registro
    And Ingresa nombre de usuario "<name>" "<l-name>", Email "<mail>", Edad "<age>",Salario "<sal>"  y departamento "<dep>"
    Then Se valida que el registro de "<mail>" se agrego
    Examples:
      | name | l-name | mail             | age | sal   | dep   |
      | Juan | Areiza | juan@example.com | 23  | 10000 | Legal |

