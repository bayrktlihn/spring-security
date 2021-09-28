package io.bayrktlihn.repository;

import io.bayrktlihn.model.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {


}
