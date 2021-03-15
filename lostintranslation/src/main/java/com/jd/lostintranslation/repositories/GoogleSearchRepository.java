package com.jd.lostintranslation.repositories;

import com.jd.lostintranslation.entities.Search;
import org.springframework.data.repository.CrudRepository;

public interface GoogleSearchRepository extends CrudRepository<Search, Long> {}
