package com.pavel.streamingstockquoteservice.repository;

import com.pavel.streamingstockquoteservice.domain.QuoteHistory;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface QuoteHistoryRepository extends ReactiveMongoRepository<QuoteHistory, String> {

}
