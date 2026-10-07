package id;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f5289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f5290b;

    public k(o oVar, s sVar) {
        this.f5290b = oVar;
        this.f5289a = sVar;
    }

    @Override // ic.a
    public final Object a() {
        o oVar = this.f5290b;
        s sVar = this.f5289a;
        try {
            if (!sVar.c(true, this)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            while (sVar.c(false, this)) {
            }
            oVar.c(1, 9, null);
            cd.b.d(sVar);
            return ub.k.f9073a;
        } catch (IOException e) {
            oVar.c(2, 2, e);
        } catch (Throwable th) {
            oVar.c(3, 3, null);
            cd.b.d(sVar);
            throw th;
        }
    }
}
