package org.howard.edu.lsp.exam.problem51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoggerTest {

	@Test
    void testDisplayLog() {
        Logger logger = Logger.getInstance();
        logger.logMessage("Test Message");
        assertEquals("Log:\nTest Message\n", logger.displayLog());
    }

    @Test
    void testLoggerInstances() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        assertSame(logger1, logger2);
    }
}