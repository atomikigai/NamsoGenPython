package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f784d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3.j f786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f787c = 0;

    public p(a3.j jVar, int i) {
        this.f786b = jVar;
        this.f785a = i;
    }

    public final int a(int i) {
        f1.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.f3578d;
        int i10 = iA + aVarB.f3575a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i10) + i10 + 4);
    }

    public final f1.a b() {
        ThreadLocal threadLocal = f784d;
        f1.a aVar = (f1.a) threadLocal.get();
        if (aVar == null) {
            aVar = new f1.a();
            threadLocal.set(aVar);
        }
        f1.b bVar = (f1.b) this.f786b.f107a;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i = iA + bVar.f3575a;
            int i10 = (this.f785a * 4) + ((ByteBuffer) bVar.f3578d).getInt(i) + i + 4;
            int i11 = ((ByteBuffer) bVar.f3578d).getInt(i10) + i10;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f3578d;
            aVar.f3578d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f3575a = i11;
                int i12 = i11 - byteBuffer.getInt(i11);
                aVar.f3576b = i12;
                aVar.f3577c = ((ByteBuffer) aVar.f3578d).getShort(i12);
                return aVar;
            }
            aVar.f3575a = 0;
            aVar.f3576b = 0;
            aVar.f3577c = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        f1.a aVarB = b();
        int iA = aVarB.a(4);
        sb2.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarB.f3578d).getInt(iA + aVarB.f3575a) : 0));
        sb2.append(", codepoints:");
        f1.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i10 = iA2 + aVarB2.f3575a;
            i = ((ByteBuffer) aVarB2.f3578d).getInt(((ByteBuffer) aVarB2.f3578d).getInt(i10) + i10);
        } else {
            i = 0;
        }
        for (int i11 = 0; i11 < i; i11++) {
            sb2.append(Integer.toHexString(a(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
