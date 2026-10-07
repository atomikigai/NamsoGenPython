package rc;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f8309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.l f8310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8311d;
    public final Throwable e;

    public r(Object obj, i iVar, ic.l lVar, Object obj2, Throwable th) {
        this.f8308a = obj;
        this.f8309b = iVar;
        this.f8310c = lVar;
        this.f8311d = obj2;
        this.e = th;
    }

    public static r a(r rVar, i iVar, CancellationException cancellationException, int i) {
        Object obj = rVar.f8308a;
        if ((i & 2) != 0) {
            iVar = rVar.f8309b;
        }
        i iVar2 = iVar;
        ic.l lVar = rVar.f8310c;
        Object obj2 = rVar.f8311d;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = rVar.e;
        }
        return new r(obj, iVar2, lVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return jc.i.a(this.f8308a, rVar.f8308a) && jc.i.a(this.f8309b, rVar.f8309b) && jc.i.a(this.f8310c, rVar.f8310c) && jc.i.a(this.f8311d, rVar.f8311d) && jc.i.a(this.e, rVar.e);
    }

    public final int hashCode() {
        Object obj = this.f8308a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        i iVar = this.f8309b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        ic.l lVar = this.f8310c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f8311d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f8308a + ", cancelHandler=" + this.f8309b + ", onCancellation=" + this.f8310c + ", idempotentResume=" + this.f8311d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ r(Object obj, i iVar, ic.l lVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : iVar, (i & 4) != 0 ? null : lVar, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
