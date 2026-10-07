package rc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x extends yb.a implements yb.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f8333b = new w(yb.e.f10673a, v.f8328a);

    public x() {
        super(yb.e.f10673a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (((yb.g) r3.f8330a.invoke(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (yb.e.f10673a == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        return yb.j.f10674a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [ic.l, jc.j] */
    @Override // yb.a, yb.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yb.i E(yb.h r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            jc.i.e(r3, r0)
            boolean r0 = r3 instanceof rc.w
            if (r0 == 0) goto L20
            rc.w r3 = (rc.w) r3
            yb.h r0 = r2.f10669a
            if (r0 == r3) goto L15
            yb.h r1 = r3.f8331b
            if (r1 != r0) goto L14
            goto L15
        L14:
            return r2
        L15:
            jc.j r3 = r3.f8330a
            java.lang.Object r3 = r3.invoke(r2)
            yb.g r3 = (yb.g) r3
            if (r3 == 0) goto L27
            goto L24
        L20:
            yb.e r0 = yb.e.f10673a
            if (r0 != r3) goto L27
        L24:
            yb.j r3 = yb.j.f10674a
            return r3
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.x.E(yb.h):yb.i");
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [ic.l, jc.j] */
    @Override // yb.a, yb.i
    public final yb.g H(yb.h hVar) {
        yb.g gVar;
        jc.i.e(hVar, "key");
        if (hVar instanceof w) {
            w wVar = (w) hVar;
            yb.h hVar2 = this.f10669a;
            if ((hVar2 == wVar || wVar.f8331b == hVar2) && (gVar = (yb.g) wVar.f8330a.invoke(this)) != null) {
                return gVar;
            }
        } else if (yb.e.f10673a == hVar) {
            return this;
        }
        return null;
    }

    public abstract void S(yb.i iVar, Runnable runnable);

    public boolean T() {
        return !(this instanceof v1);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + b0.l(this);
    }
}
