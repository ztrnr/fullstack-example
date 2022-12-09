package exceptions;

import javax.ws.rs.core.Response.Status;

public class CustomException extends Exception {

    private static final long serialVersionUID = -7107045897538452928L;

    /**
     * status that is passed to response object
     */
    private int status = 0;

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public CustomException() {
        super();
        this.status = 200;
    }

    /**
     * Constructs a new exception with the specified detail message and
     * cause.  <p>Note that the detail message associated with
     * {@code cause} is <i>not</i> automatically incorporated in
     * this exception's detail message.
     * @param  message the detail message (which is saved for later retrieval
     *         by the {@link #getMessage()} method).
     * @param  statusCode the integer code for the response
     */
    public CustomException(String message, int statusCode) {
        super(message);
        this.status = statusCode;
    }

    /**
     * Constructs a new exception with the specified detail message and
     * cause.  <p>Note that the detail message associated with
     * {@code cause} is <i>not</i> automatically incorporated in
     * this exception's detail message.
     * @param  message the detail message (which is saved for later retrieval
     *         by the {@link #getMessage()} method).
     * @param  statusCode the http code for the response
     */
    public CustomException(String message, Status statusCode) {
        super(message);
        this.status = statusCode.getStatusCode();
    }

    /**
     * Constructs a new exception with the specified detail message and
     * cause.  <p>Note that the detail message associated with
     * {@code cause} is <i>not</i> automatically incorporated in
     * this exception's detail message.
     *
     * @param  message the detail message (which is saved for later retrieval
     *         by the {@link #getMessage()} method).
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link #getCause()} method).  (A {@code null} value is
     *         permitted, and indicates that the cause is nonexistent or
     *         unknown.)
     * @param  statusCode the int code for the response
     */
    public CustomException(String message, Throwable cause, int statusCode) {
        super(message, cause);
        this.status = statusCode;
        
    }

    /**
     * Constructs a new exception with the specified detail message and
     * cause.  <p>Note that the detail message associated with
     * {@code cause} is <i>not</i> automatically incorporated in
     * this exception's detail message.
     *
     * @param  message the detail message (which is saved for later retrieval
     *         by the {@link #getMessage()} method).
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link #getCause()} method).  (A {@code null} value is
     *         permitted, and indicates that the cause is nonexistent or
     *         unknown.)
     * @param  statusCode the http code for the response
     */
    public CustomException(String message, Throwable cause, Status statusCode) {
        super(message, cause);
        this.status = statusCode.getStatusCode();
    }

    /**
     * used when mapping exception to front end response
     * @return
     */
    public int getStatusCode() {
        return this.status;
    }
}
