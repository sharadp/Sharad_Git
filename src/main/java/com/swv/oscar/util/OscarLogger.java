package com.swv.oscar.util;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.spi.AbstractLogger;
import org.apache.logging.log4j.spi.ExtendedLoggerWrapper;

/**
 * Extended Logger interface with convenience methods for
 * the DIAG, NOTICE and VERBOSE custom log levels.
 * <p>Compatible with Log4j 2.6 or higher.</p>
 */
public final class OscarLogger extends ExtendedLoggerWrapper {
    private static final long serialVersionUID = 173351303429634L;
    private final ExtendedLoggerWrapper logger;

    private static final String FQCN = OscarLogger.class.getName();
    private static final Level DIAG = Level.forName("DIAG", 350);
  

    private OscarLogger(final Logger logger) {
        super((AbstractLogger) logger, logger.getName(), logger.getMessageFactory());
        this.logger = this;
    }

    /**
     * Returns a custom Logger with the name of the calling class.
     * 
     * @return The custom Logger for the calling class.
     */
    public static OscarLogger create() {
        final Logger wrapped = LogManager.getLogger();
        return new OscarLogger(wrapped);
    }

    /**
     * Returns a custom Logger using the fully qualified name of the Class as
     * the Logger name.
     * 
     * @param loggerName The Class whose name should be used as the Logger name.
     *            If null it will default to the calling class.
     * @return The custom Logger.
     */
    public static OscarLogger create(final Class<?> loggerName) {
        final Logger wrapped = LogManager.getLogger(loggerName);
        return new OscarLogger(wrapped);
    }

    /**
     * Returns a custom Logger using the fully qualified name of the Class as
     * the Logger name.
     * 
     * @param loggerName The Class whose name should be used as the Logger name.
     *            If null it will default to the calling class.
     * @param messageFactory The message factory is used only when creating a
     *            logger, subsequent use does not change the logger but will log
     *            a warning if mismatched.
     * @return The custom Logger.
     */
    public static OscarLogger create(final Class<?> loggerName, final MessageFactory messageFactory) {
        final Logger wrapped = LogManager.getLogger(loggerName, messageFactory);
        return new OscarLogger(wrapped);
    }

    /**
     * Returns a custom Logger using the fully qualified class name of the value
     * as the Logger name.
     * 
     * @param value The value whose class name should be used as the Logger
     *            name. If null the name of the calling class will be used as
     *            the logger name.
     * @return The custom Logger.
     */
    public static OscarLogger create(final Object value) {
        final Logger wrapped = LogManager.getLogger(value);
        return new OscarLogger(wrapped);
    }

    /**
     * Returns a custom Logger using the fully qualified class name of the value
     * as the Logger name.
     * 
     * @param value The value whose class name should be used as the Logger
     *            name. If null the name of the calling class will be used as
     *            the logger name.
     * @param messageFactory The message factory is used only when creating a
     *            logger, subsequent use does not change the logger but will log
     *            a warning if mismatched.
     * @return The custom Logger.
     */
    public static OscarLogger create(final Object value, final MessageFactory messageFactory) {
        final Logger wrapped = LogManager.getLogger(value, messageFactory);
        return new OscarLogger(wrapped);
    }

    /**
     * Returns a custom Logger with the specified name.
     * 
     * @param name The logger name. If null the name of the calling class will
     *            be used.
     * @return The custom Logger.
     */
    public static OscarLogger create(final String name) {
        final Logger wrapped = LogManager.getLogger(name);
        return new OscarLogger(wrapped);
    }

    /**
     * Returns a custom Logger with the specified name.
     * 
     * @param name The logger name. If null the name of the calling class will
     *            be used.
     * @param messageFactory The message factory is used only when creating a
     *            logger, subsequent use does not change the logger but will log
     *            a warning if mismatched.
     * @return The custom Logger.
     */
    public static OscarLogger create(final String name, final MessageFactory messageFactory) {
        final Logger wrapped = LogManager.getLogger(name, messageFactory);
        return new OscarLogger(wrapped);
    }

    /**
     * Logs a message with the specific Marker at the {@code DIAG} level.
     * 
     * @param marker the marker data specific to this log statement
     * @param msg the message string to be logged
     */
    public void diag(final Marker marker, final Message msg) {
        logger.logIfEnabled(FQCN, DIAG, marker, msg, (Throwable) null);
    }

    /**
     * Logs a message with the specific Marker at the {@code DIAG} level.
     * 
     * @param marker the marker data specific to this log statement
     * @param msg the message string to be logged
     * @param t A Throwable or null.
     */
    public void diag(final Marker marker, final Message msg, final Throwable t) {
        logger.logIfEnabled(FQCN, DIAG, marker, msg, t);
    }

    /**
     * Logs a message object with the {@code DIAG} level.
     * 
     * @param marker the marker data specific to this log statement
     * @param message the message object to log.
     */
    public void diag(final Marker marker, final Object message) {
        logger.logIfEnabled(FQCN, DIAG, marker, message, (Throwable) null);
    }

    /**
     * Logs a message CharSequence with the {@code DIAG} level.
     * 
     * @param marker the marker data specific to this log statement
     * @param message the message CharSequence to log.
     * @since Log4j-2.6
     */
    public void diag(final Marker marker, final CharSequence message) {
        logger.logIfEnabled(FQCN, DIAG, marker, message, (Throwable) null);
    }

    /**
     * Logs a message at the {@code DIAG} level including the stack trace of
     * the {@link Throwable} {@code t} passed as parameter.
     * 
     * @param marker the marker data specific to this log statement
     * @param message the message to log.
     * @param t the exception to log, including its stack trace.
     */
    public void diag(final Marker marker, final Object message, final Throwable t) {
        logger.logIfEnabled(FQCN, DIAG, marker, message, t);
    }

    /**
     * Logs a message at the {@code DIAG} level including the stack trace of
     * the {@link Throwable} {@code t} passed as parameter.
     * 
     * @param marker the marker data specific to this log statement
     * @param message the CharSequence to log.
     * @param t the exception to log, including its stack trace.
     * @since Log4j-2.6
     */
    public void diag(final Marker marker, final CharSequence message, final Throwable t) {
        logger.logIfEnabled(FQCN, DIAG, marker, message, t);
    }

    /**
     * Logs a message object with the {@code DIAG} level.
     * 
     * @param marker the marker data specific to this log statement
     * @param message the message object to log.
     */
    public void diag(final Marker marker, final String message) {
        logger.logIfEnabled(FQCN, DIAG, marker, message, (Throwable) null);
    }

    
}

