package org.lavega.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Toda la generaci&oacute;n de esta tabla, a partir de la clase dada, se hace
 * mediante anotaciones de jpa jakarta, no con la de hibernate.<br>
 * <br>
 * <b>Entity</b> y name indican que la tabla se llama "users". <br>
 * <b>GeneratedValue</b> y su estrategia (Identity), se usa para indicar llave
 * primaria autoincremental en BD. <br>
 * Los nombres de las columnas se ajustan al nombre que se requiere que se tenga
 * en la BD.
 * 
 * 
 */
//Para la creacion de la tabla, no funciona esta anotacion @Table(value = "users")
@Entity(name = "users")
record User(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id, @Id @Column String name,
		@Column(name = "last_name", updatable = true) String lastName,
		@Column(name = "e_mail", updatable = true) String eMail) {

}
