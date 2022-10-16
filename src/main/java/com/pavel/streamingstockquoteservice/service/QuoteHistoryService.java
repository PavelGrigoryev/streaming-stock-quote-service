package com.pavel.streamingstockquoteservice.service;

import com.pavel.streamingstockquoteservice.domain.QuoteHistory;
import com.pavel.streamingstockquoteservice.model.Quote;
import reactor.core.publisher.Mono;

public interface QuoteHistoryService {

    Mono<QuoteHistory> saveQuoteToMongo(Quote quote);

}
