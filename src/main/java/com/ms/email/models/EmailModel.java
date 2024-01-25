package com.ms.email.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ms.email.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A anotação @Data é para realizar todas as contruções da classe com lombok (Getter, Setter, Contrutor)
 * Classe com @Entity e @Table para realizar a criação da tabela automaticamente de acordo com os atribudos da classe
 * @JsonIgnore É para personalizar o retorno da API colocando essa propriedade nos atribudos que voce nao deseja que retorna
 */
@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "email_id", nullable = false)
    private Long emailId;
    @JsonIgnore
    private String ownerRef;
    @JsonIgnore
    private String emailFrom;
    @JsonIgnore
    private String emailTo;
    @JsonIgnore
    private String subject;
    @Column(columnDefinition = "TEXT")
    @JsonIgnore
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
}
