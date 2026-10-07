package gd;

import bd.q;
import bd.z;
import java.util.regex.Pattern;
import od.h;
import od.p;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f4543c;

    public g(String str, long j4, p pVar) {
        this.f4541a = str;
        this.f4542b = j4;
        this.f4543c = pVar;
    }

    @Override // bd.z
    public final long c() {
        return this.f4542b;
    }

    @Override // bd.z
    public final q d() {
        String str = this.f4541a;
        if (str == null) {
            return null;
        }
        Pattern pattern = q.f1632c;
        try {
            return r7.g.q(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // bd.z
    public final h g() {
        return this.f4543c;
    }
}
