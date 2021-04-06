package com.jd.lostintranslation.repositories;


import com.jd.lostintranslation.entities.Image;
import com.jd.lostintranslation.entities.Search;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoogleImageRepository extends CrudRepository<Image, Long> {}
