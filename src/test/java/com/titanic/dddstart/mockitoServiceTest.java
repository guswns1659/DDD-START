package com.titanic.dddstart;

import com.titanic.dddstart.service.MockitoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@WebMvcTest
public class mockitoServiceTest {

    @Spy
    MockitoService mockitoService;

    @ParameterizedTest
    @CsvSource({"email,2"})
    public void testMock(String email, int id) {
        MockitoService stubService = mock(MockitoService.class);
//        when(stubService.findByEmail(email)).thenReturn((long) id);
        assertThat(stubService.returnId()).isEqualTo(1L);
    }

    @ParameterizedTest
    @CsvSource({"100"})
    public void testSpy(int expected) {
        assertThat(mockitoService.returnId()).isEqualTo((long) expected);
    }
}
