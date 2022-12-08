Feature: Automation web tables
Background:
  Given El cliente esta en webtables

  Scenario: Eliminar registro
    When Desea eliminar un registro en especifico
    Then Se valida que el registro se elimino

  Scenario Outline: Agregar registro
    When Desea agregar un nuevo registro
    And Ingresa nombre de usuario "<name>" "<l-name>", Email "<mail>", Edad "<age>",Salario "<sal>"  y departamento "<dep>"
    Then Se valida que el registro se agrego
    Examples:
      | name | l-name | mail             | age | sal   | dep   |
      | Juan | Areiza | juan@example.com | 23  | 10000 | Legal |

