package bd;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z implements Closeable {
    public abstract long c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        cd.b.d(g());
    }

    public abstract q d();

    public abstract od.h g();

    public final String o() throws IOException {
        Charset charsetA;
        od.h hVarG = g();
        try {
            q qVarD = d();
            if (qVarD == null || (charsetA = qVarD.a(pc.a.f7846a)) == null) {
                charsetA = pc.a.f7846a;
            }
            String strA = hVarG.A(cd.b.r(hVarG, charsetA));
            hVarG.close();
            return strA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                r7.g.h(hVarG, th);
                throw th2;
            }
        }
    }
}
