package com.gitupscale.jpa.common;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public class BaseEntity<K extends Serializable & Comparable<K>, E extends BaseEntity<K, ?>>
		implements Serializable, Comparable<E> {
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "id", strategy = "com.gitupscale.jpa.common.DefaultIdGenerator")
	@GeneratedValue(generator = "id", strategy = GenerationType.IDENTITY)
	private K id;

	public K getId() {
		return id;
	}

	public void setId(K id) {
		this.id = id;
	}

	@Override
	public int compareTo(E object) {
		/*
		 * if (object == null) { return -1; } if (object == this) { return 0; }
		 * 
		 * // l'objet peut être proxyfié donc on utilise Hibernate.getClass() pour
		 * sortir // la vraie classe if (Hibernate.getClass(object) !=
		 * Hibernate.getClass(this)) { return -1; }
		 * 
		 * @SuppressWarnings("unchecked") BaseEntity<K, E> entity = (BaseEntity<K, E>)
		 * object; // NOSONAR : traité au-dessus mais wrapper Hibernate K id = getId();
		 * 
		 * if (id == null) { return -1; }
		 */

		@SuppressWarnings("unchecked")
		BaseEntity<K, E> entity = (BaseEntity<K, E>) object;

		if (getId().equals(entity.getId()) || object == this) {
			return 0;
		} else
			return -1;
	}

}
