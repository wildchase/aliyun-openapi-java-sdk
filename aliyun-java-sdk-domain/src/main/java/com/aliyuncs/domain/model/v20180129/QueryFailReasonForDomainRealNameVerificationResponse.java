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

package com.aliyuncs.domain.model.v20180129;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180129.QueryFailReasonForDomainRealNameVerificationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryFailReasonForDomainRealNameVerificationResponse extends AcsResponse {

	private String requestId;

	private List<FailRecord> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FailRecord> getData() {
		return this.data;
	}

	public void setData(List<FailRecord> data) {
		this.data = data;
	}

	public static class FailRecord {

		private String date;

		private String failReason;

		private String domainNameVerificationStatus;

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getFailReason() {
			return this.failReason;
		}

		public void setFailReason(String failReason) {
			this.failReason = failReason;
		}

		public String getDomainNameVerificationStatus() {
			return this.domainNameVerificationStatus;
		}

		public void setDomainNameVerificationStatus(String domainNameVerificationStatus) {
			this.domainNameVerificationStatus = domainNameVerificationStatus;
		}
	}

	@Override
	public QueryFailReasonForDomainRealNameVerificationResponse getInstance(UnmarshallerContext context) {
		return	QueryFailReasonForDomainRealNameVerificationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
