package com.ms.email.repositorys;

import com.ms.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Os argumentos de JPAReposutory é a Entidade no qual deseja que ele crie as consultas JPA e o tipo de ID
 */
public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
