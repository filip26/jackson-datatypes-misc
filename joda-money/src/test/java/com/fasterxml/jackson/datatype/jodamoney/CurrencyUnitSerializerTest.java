package com.fasterxml.jackson.datatype.jodamoney;

import org.joda.money.CurrencyUnit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class CurrencyUnitSerializerTest extends ModuleTestBase
{
    private final ObjectMapper objectMapper = mapperWithModule();

    public void testShouldSerialize() throws JsonProcessingException {
        final String expectedCurrencyUnit = "EUR";

        final String actual = objectMapper.writeValueAsString(CurrencyUnit.EUR);

        assertEquals('"' + expectedCurrencyUnit + '"', actual);
    }
}
