package com.jd.lostintranslation.repositories;

import com.jd.lostintranslation.entities.Translation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @Repository annotates classes at the persistence layer, which will act as a database app.repositories
 *
 * A app.repositories is a mechanism for encapsulating storage, retrieval, and search behavior
 * which emulates a collection of objects.
 *
 * It is a specialization of the @Component annotation allowing for implementation classes
 * to be auto detected through classpath scanning.
 *
 * Spring Repository is very close to DAO pattern
 * where DAO classes are responsible for providing CRUD operations on database tables.
 *
 */

@Repository
public interface TranslationRepository extends CrudRepository<Translation, Long> {}

