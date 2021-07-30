package com.gitupscale.jpa.common;

import java.io.Serializable;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class DefaultIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

		return UUID.randomUUID().toString();
	}

	public static String get() throws HibernateException {

		return UUID.randomUUID().toString();
	}
}
