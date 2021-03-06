/**
 * Copyright 2016 Otto (GmbH & Co KG)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ottogroup.bi.streaming.operator.json.aggregate.functions;

import org.apache.commons.lang3.tuple.MutablePair;

/**
 * @author mnxfst
 * @since Jan 18, 2016
 */
public class StringContentAggregateFunction implements JsonContentAggregateFunction<String> {

	private static final long serialVersionUID = 6265880736555658327L;

	/**
	 * @see com.ottogroup.bi.streaming.operator.json.aggregate.functions.JsonContentAggregateFunction#sum(java.io.Serializable, java.io.Serializable)
	 */
	public String sum(String oldSum, String value) throws Exception {
		throw new UnsupportedOperationException("Method 'sum' is not defined for string fields");
	}

	/**
	 * @see com.ottogroup.bi.streaming.operator.json.aggregate.functions.JsonContentAggregateFunction#min(java.io.Serializable, java.io.Serializable)
	 */
	public String min(String oldMin, String value) throws Exception {
		throw new UnsupportedOperationException("Method 'min' is not defined for string fields");	
	}

	/**
	 * @see com.ottogroup.bi.streaming.operator.json.aggregate.functions.JsonContentAggregateFunction#max(java.io.Serializable, java.io.Serializable)
	 */
	public String max(String oldMax, String value) throws Exception {
		throw new UnsupportedOperationException("Method 'max' is not defined for string fields");
	}

	/**
	 * @see com.ottogroup.bi.streaming.operator.json.aggregate.functions.JsonContentAggregateFunction#count(java.lang.Integer)
	 */
	public Integer count(Integer value) throws Exception {
		if(value == null)
			return Integer.valueOf(1);
		return Integer.valueOf(value.intValue() + 1);
	}

	/**
	 * @see com.ottogroup.bi.streaming.operator.json.aggregate.functions.JsonContentAggregateFunction#average(org.apache.commons.lang3.tuple.MutablePair, java.io.Serializable)
	 */
	public MutablePair<String, Integer> average(MutablePair<String, Integer> sumAndCount, String value)	throws Exception {
		throw new UnsupportedOperationException("Method 'average' is not defined for string fields");
	}

}
