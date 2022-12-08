Feature: Automation web tables
Background:
  Given El cliente esta en webtables

  Scenario: Eliminar registro
    When Desea eliminar un registro en especifico
    Then Se valida que el registro se elimino

