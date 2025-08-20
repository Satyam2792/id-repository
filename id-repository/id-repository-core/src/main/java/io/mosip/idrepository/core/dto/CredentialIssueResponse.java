package io.mosip.idrepository.core.dto;

import lombok.Data;

@Data
public class CredentialIssueResponse {

	private String requestId;
	private String id;

    public void setRequestId(String requestId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
