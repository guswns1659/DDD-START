package com.titanic.dddstart.repository;

import com.titanic.dddstart.domain.Account;
import org.springframework.stereotype.Repository;

@Repository
public class MockitoRepository {
    public Account findByEmail(String email) {
        return null;
    }
}
