package kd;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f6216a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i;
        int iMin;
        jc.i.e(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f6214a;
        String loggerName = logRecord.getLoggerName();
        jc.i.d(loggerName, "record.loggerName");
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            i = 5;
        } else {
            i = logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        String message = logRecord.getMessage();
        jc.i.d(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String strA0 = (String) c.f6215b.get(loggerName);
        if (strA0 == null) {
            strA0 = pc.g.A0(23, loggerName);
        }
        if (Log.isLoggable(strA0, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i10 = 0;
            while (i10 < length) {
                int iJ0 = pc.g.j0(message, '\n', i10, 4);
                if (iJ0 == -1) {
                    iJ0 = length;
                }
                while (true) {
                    iMin = Math.min(iJ0, i10 + 4000);
                    String strSubstring = message.substring(i10, iMin);
                    jc.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, strA0, strSubstring);
                    if (iMin >= iJ0) {
                        break;
                    } else {
                        i10 = iMin;
                    }
                }
                i10 = iMin + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
