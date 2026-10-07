package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f720a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f721b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f721b = bArr;
        ByteBuffer.wrap(bArr);
        if (0 + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw x.f();
        } catch (x e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }

    public static t c(Object obj, Object obj2) {
        t tVar = (t) ((a) obj);
        r rVar = (r) tVar.d(5);
        rVar.c();
        r.d(rVar.f708b, tVar);
        a aVar = (a) obj2;
        if (!rVar.f707a.getClass().isInstance(aVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        rVar.c();
        r.d(rVar.f708b, (t) aVar);
        return rVar.b();
    }
}
