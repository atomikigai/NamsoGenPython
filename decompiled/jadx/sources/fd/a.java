package fd;

import bd.p;
import bd.s;
import bd.x;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3895a = new a();

    @Override // bd.p
    public final x a(gd.f fVar) throws IOException {
        i iVar = fVar.f4535a;
        synchronized (iVar) {
            try {
                if (!iVar.f3933w) {
                    throw new IllegalStateException("released");
                }
                if (iVar.f3932v) {
                    throw new IllegalStateException("Check failed.");
                }
                if (iVar.f3931u) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar2 = iVar.f3928r;
        jc.i.b(fVar2);
        s sVar = iVar.f3923a;
        try {
            gd.d dVarJ = fVar2.a(fVar.f4539f, fVar.f4540g, fVar.h, sVar.f1658f, !jc.i.a((String) fVar.e.f1681b, "GET")).j(sVar, fVar);
            jc.i.e(fVar2, "finder");
            e eVar = new e();
            eVar.f3912b = iVar;
            eVar.f3913c = fVar2;
            eVar.f3914d = dVarJ;
            eVar.e = dVarJ.e();
            iVar.f3930t = eVar;
            iVar.f3935y = eVar;
            synchronized (iVar) {
                iVar.f3931u = true;
                iVar.f3932v = true;
            }
            if (iVar.f3934x) {
                throw new IOException("Canceled");
            }
            return gd.f.a(fVar, 0, eVar, null, 61).b(fVar.e);
        } catch (m e) {
            fVar2.c(e.f3956b);
            throw e;
        } catch (IOException e4) {
            fVar2.c(e4);
            throw new m(e4);
        }
    }
}
