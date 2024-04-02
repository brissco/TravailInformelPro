package com.modafa.v1.enum1;

public enum AccountStatus {
    ACTIVE, // The account is active and the user can fully use the system
    INACTIVE, // The account is inactive, possibly due to being new and not yet activated
    SUSPENDED, // The account is suspended, restricting access due to violations or other reasons
    CLOSED // The account has been closed, either by the user or the system administrators
}