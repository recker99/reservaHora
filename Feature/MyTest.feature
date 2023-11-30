Feature: Agendar una hora clínica
  Como usuario
  Quiero poder iniciar sesión
  Para poder agendar una hora clínica
  
  Scenario: Iniciar sesión y agendar una hora clínica
    Given que estoy en la página de inicio de sesión
    When ingreso mi nombre de usuario y contraseña
    And hago clic en el botón de inicio de sesión
    Then debo ser redirigido a la página de agendar hora
    When lleno el formulario con la información requerida
    And hago clic en el botón de enviar
    Then debo ver un mensaje de confirmación de la hora agendada
