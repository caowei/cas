package org.jasig.cas.support.oauth.ticket.code;

import org.jasig.cas.authentication.Authentication;
import org.jasig.cas.authentication.principal.Service;
import org.jasig.cas.ticket.TicketFactory;

/**
 * Factory to create OAuth codes.
 *
 * @author Jerome Leleu
 * @since 4.3.0
 */
public interface OAuthCodeFactory extends TicketFactory {

    OAuthCode create(Service service, Authentication authentication);
}
