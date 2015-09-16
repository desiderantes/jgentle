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
package org.jgentleframework.core.intercept;

import net.sf.cglib.core.NamingPolicy;
import net.sf.cglib.core.Predicate;

/**
 * Cglib class naming policy for JGentle.
 * 
 * @author LE QUOC CHUNG - mailto: <a
 *         href="mailto:skydunkpro@yahoo.com">skydunkpro@yahoo.com</a>
 * @date Aug 1, 2008
 */
public class JGentleNamingPolicy implements NamingPolicy {
	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sf.cglib.core.NamingPolicy#getClassName(java.lang.String,
	 *      java.lang.String, java.lang.Object, net.sf.cglib.core.Predicate)
	 */
	@Override
	public String getClassName(String prefix, String source, Object key,
			Predicate names) {

		StringBuffer sb = new StringBuffer();
		sb.append((prefix != null) ? (prefix.startsWith("java") ? "$" + prefix
				: prefix) : "net.sf.cglib.empty.Object");
		sb.append("$$");
		sb.append(source.substring(source.lastIndexOf('.') + 1));
		sb.append("ByJGentle$$");
		sb.append(Integer.toHexString(key.hashCode()));
		String base = sb.toString();
		String attempt = base;
		int index = 2;
		while (names.evaluate(attempt)) {
			attempt = base + "_" + index++;
		}
		return attempt;
	}
}
