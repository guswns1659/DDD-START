package com.titanic.dddstart.service;

import com.titanic.dddstart.domain.Account;
import com.titanic.dddstart.repository.MockitoRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class MockitoService {

    private MockitoRepository mockitoRepository;

    @Autowired
    public MockitoService(MockitoRepository mockitoRepository) {
        this.mockitoRepository = mockitoRepository;
    }

    public Long findByEmail(String email) {
        Account account = mockitoRepository.findByEmail(email);
        return account.getId();
    }

    public Long returnId() {
        return 100L;
    }
}
