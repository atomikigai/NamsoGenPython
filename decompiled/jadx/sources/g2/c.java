package g2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public interface c extends AutoCloseable {
    String F(int i);

    boolean O();

    void b(int i, long j4);

    int getColumnCount();

    String getColumnName(int i);

    long getLong(int i);

    boolean isNull(int i);

    void n();

    void q(int i, String str);

    void reset();
}
