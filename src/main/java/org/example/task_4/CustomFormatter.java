package org.example.task_4;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CustomFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        StringBuilder sb = new StringBuilder();
        sb.append("Sana").append(new java.util.Date(record.getMillis())).append("\n");
        sb.append("Log Level").append(record.getLevel()).append("\n");
        sb.append("Class").append(record.getSourceClassName()).append("\n");
        sb.append("Message").append(record.getMessage()).append("\n");
        if (record.getThrown() != null) {
            sb.append("Xatolik").append(record.getThrown().toString()).append("\n");
            for (StackTraceElement element : record.getThrown().getStackTrace()) {
                sb.append("\t").append(element.toString()).append("\n");
            }
        }
        sb.append("\n");
        return sb.toString();
    }
}
