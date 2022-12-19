/**
 * @author Iurii Golubnichenko
 *
 * This class provides information about JVM installed on your computer.
 */
package corp.siendev.com.jvm;

import java.lang.management.ManagementFactory;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public final class JvmInfo {
    public static String getJvmUptime() {
        long jvmUptime = ManagementFactory.getRuntimeMXBean().getUptime();
        Instant instance = Instant.ofEpochMilli(jvmUptime);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instance, ZoneId.systemDefault());

        return String.format("JVM has been running for %d hours, %d minutes, %d seconds",
                localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond());
    }
}
