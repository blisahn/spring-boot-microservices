package com.devblo.accounts.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author blisahn 11.03.2024 <br>
 * Created for applyin simple logic for createdBy and updatedBy. <br>
 * added Component("auditAwareImpl") to turn POJO to the bean
 */

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {

    /**
     * Returns the current auditor of the application.<br>
     * Will update ACCOUNTS_MS after integrated the Spring Security
     * for the username
     *
     * @return the current auditor
     */
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("ACCOUNTS_MS");
    }
}
