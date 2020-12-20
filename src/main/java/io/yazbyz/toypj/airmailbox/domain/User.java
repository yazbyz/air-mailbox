package io.yazbyz.toypj.airmailbox.domain;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class User extends AbstractPersistable<Long> {
	private String name;
	private String _id;
	private String pw;
}