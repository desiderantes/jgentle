/*
 * Copyright 2007-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 * Project: JGentleFramework
 */
package org.jgentleframework.reflection;

import org.jgentleframework.core.JGentleRuntimeException;

/**
 * The Class ReflectException.
 * 
 * @author LE QUOC CHUNG - mailto: <a
 *         href="mailto:skydunkpro@yahoo.com">skydunkpro@yahoo.com</a>
 * @date Jul 17, 2008
 */
public class ReflectException extends JGentleRuntimeException {
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= 8344920636693176696L;

	/**
	 * Instantiates a new reflect exception.
	 */
	public ReflectException() {

		super();
	}

	/**
	 * Instantiates a new reflect exception.
	 * 
	 * @param strEx
	 *            the str ex
	 */
	public ReflectException(String strEx) {

		super(strEx);
	}

	/**
	 * Instantiates a new reflect exception.
	 * 
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public ReflectException(String message, Throwable cause) {

		super(message, cause);
	}

	/**
	 * Instantiates a new reflect exception.
	 * 
	 * @param cause
	 *            the cause
	 */
	public ReflectException(Throwable cause) {

		super(cause);
	}
}
