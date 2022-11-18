package LabTestOnJunit11;


{
@Test
@ParameterizedTest(name = "{index} => message=''{0}''")
@CsvSource(value = {"Level","Radar", "MAAM", "python"})
void shouldPassNonNullMessageAsMethodParameter(String message) {
    assertNotNull(message);
}
}
