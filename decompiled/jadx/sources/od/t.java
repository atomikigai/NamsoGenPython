package od;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public interface t extends Closeable, Flushable {
    x a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void f(long j4, f fVar);

    void flush();
}
