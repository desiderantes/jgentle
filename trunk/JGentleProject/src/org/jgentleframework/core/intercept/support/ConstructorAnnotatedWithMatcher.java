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
package org.jgentleframework.core.intercept.support;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

import org.jgentleframework.configure.enums.AND_OR;
import org.jgentleframework.context.aop.ConstructorFilter;
import org.jgentleframework.context.aop.Filter;
import org.jgentleframework.context.aop.PointcutOfConstructorFilter;
import org.jgentleframework.context.aop.support.MethodConstructorMatching;

/**
 * The Class ConstructorAnnotatedWithMatcher.
 * 
 * @author LE QUOC CHUNG - mailto: <a
 *         href="mailto:skydunkpro@yahoo.com">skydunkpro@yahoo.com</a>
 * @date Aug 14, 2008
 * @see AbstractDefinitionMatcherPointcut
 */
public class ConstructorAnnotatedWithMatcher
		extends
		AbstractDefinitionMatcherPointcut<MethodConstructorMatching<Constructor<?>>>
		implements
		PointcutOfConstructorFilter<MethodConstructorMatching<Constructor<?>>> {
	/** The filter. */
	ConstructorFilter	filter	= new DefinitionMatcherConstructorFilterClass();

	/**
	 * The Constructor.
	 * 
	 * @param andor
	 *            the andor
	 * @param classes
	 *            the classes
	 */
	public ConstructorAnnotatedWithMatcher(AND_OR andor,
			Class<? extends Annotation>[] classes) {

		super(andor, classes);
	}

	/*
	 * (non-Javadoc)
	 * @see org.jgentleframework.context.aop.Pointcut#getConstructorFilter()
	 */
	@Override
	public ConstructorFilter getConstructorFilter() {

		/*
		 * Returns a statically constructor filter
		 */
		return this.filter;
	}

	/*
	 * (non-Javadoc)
	 * @see org.jgentleframework.context.aop.Pointcut#getFilter()
	 */
	@Override
	public Filter<MethodConstructorMatching<Constructor<?>>> getFilter() {

		/*
		 * Returns a statically constructor filter
		 */
		return this.filter;
	}
}
