/*
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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.DescribeDomainBpsDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainBpsDataResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String dataInterval;

	private String startTime;

	private String endTime;

	private List<DataModule> bpsDataPerInterval;

	private List<DataModule1> supplyBpsDatas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<DataModule> getBpsDataPerInterval() {
		return this.bpsDataPerInterval;
	}

	public void setBpsDataPerInterval(List<DataModule> bpsDataPerInterval) {
		this.bpsDataPerInterval = bpsDataPerInterval;
	}

	public List<DataModule1> getSupplyBpsDatas() {
		return this.supplyBpsDatas;
	}

	public void setSupplyBpsDatas(List<DataModule1> supplyBpsDatas) {
		this.supplyBpsDatas = supplyBpsDatas;
	}

	public static class DataModule {

		private String timeStamp;

		private String value;

		private String domesticValue;

		private String overseasValue;

		private String l2Value;

		private String domesticL2Value;

		private String overseasL2Value;

		private Long dynamicValue;

		private String dynamicDomesticValue;

		private String dynamicOverseasValue;

		private String staticValue;

		private String staticDomesticValue;

		private String staticOverseasValue;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getDomesticValue() {
			return this.domesticValue;
		}

		public void setDomesticValue(String domesticValue) {
			this.domesticValue = domesticValue;
		}

		public String getOverseasValue() {
			return this.overseasValue;
		}

		public void setOverseasValue(String overseasValue) {
			this.overseasValue = overseasValue;
		}

		public String getL2Value() {
			return this.l2Value;
		}

		public void setL2Value(String l2Value) {
			this.l2Value = l2Value;
		}

		public String getDomesticL2Value() {
			return this.domesticL2Value;
		}

		public void setDomesticL2Value(String domesticL2Value) {
			this.domesticL2Value = domesticL2Value;
		}

		public String getOverseasL2Value() {
			return this.overseasL2Value;
		}

		public void setOverseasL2Value(String overseasL2Value) {
			this.overseasL2Value = overseasL2Value;
		}

		public Long getDynamicValue() {
			return this.dynamicValue;
		}

		public void setDynamicValue(Long dynamicValue) {
			this.dynamicValue = dynamicValue;
		}

		public String getDynamicDomesticValue() {
			return this.dynamicDomesticValue;
		}

		public void setDynamicDomesticValue(String dynamicDomesticValue) {
			this.dynamicDomesticValue = dynamicDomesticValue;
		}

		public String getDynamicOverseasValue() {
			return this.dynamicOverseasValue;
		}

		public void setDynamicOverseasValue(String dynamicOverseasValue) {
			this.dynamicOverseasValue = dynamicOverseasValue;
		}

		public String getStaticValue() {
			return this.staticValue;
		}

		public void setStaticValue(String staticValue) {
			this.staticValue = staticValue;
		}

		public String getStaticDomesticValue() {
			return this.staticDomesticValue;
		}

		public void setStaticDomesticValue(String staticDomesticValue) {
			this.staticDomesticValue = staticDomesticValue;
		}

		public String getStaticOverseasValue() {
			return this.staticOverseasValue;
		}

		public void setStaticOverseasValue(String staticOverseasValue) {
			this.staticOverseasValue = staticOverseasValue;
		}
	}

	public static class DataModule1 {

		private String timeStamp;

		private String value;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public DescribeDomainBpsDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainBpsDataResponseUnmarshaller.unmarshall(this, context);
	}
}
