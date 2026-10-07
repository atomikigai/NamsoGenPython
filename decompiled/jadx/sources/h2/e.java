package h2;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public interface e extends Closeable {
    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z4);

    b z();
}
