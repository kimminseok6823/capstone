package capstone.capstone.domain.profile.valid.exception;

import javax.naming.AuthenticationException;

public class NotAuthorizedEditException extends AuthenticationException {
    public NotAuthorizedEditException(String message) {
        super(message);
    }
}
