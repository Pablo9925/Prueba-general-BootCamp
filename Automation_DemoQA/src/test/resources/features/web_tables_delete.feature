Feature: Automation web tables Delete

  Scenario: Eliminar registro
    Given El cliente esta en webtables
    When Desea eliminar un registro en especifico
    Then Se valida que el registro se elimino


