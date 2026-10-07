package a2;

import h3.a2;
import h3.x2;
import rc.a0;
import y1.l0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f88b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f89c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj, yb.d dVar, int i) {
        super(2, dVar);
        this.f87a = i;
        this.f89c = obj;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        switch (this.f87a) {
            case 0:
                return new x((rc.q) this.f89c, dVar, 0);
            case 1:
                return new x((a2) this.f89c, dVar, 1);
            case 2:
                return new x((x2) this.f89c, dVar, 2);
            case 3:
                return new x((l3.y) this.f89c, dVar, 3);
            case 4:
                return new x((r1.a) this.f89c, dVar, 4);
            case 5:
                return new x((y1.i) this.f89c, dVar, 5);
            default:
                return new x((l0) this.f89c, dVar, 6);
        }
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        yb.d dVar = (yb.d) obj2;
        switch (this.f87a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ((x) create(a0Var, dVar)).invokeSuspend(ub.k.f9073a);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x0204  */
    /* JADX WARN: Code duplicated, block: B:84:0x0222  */
    /* JADX WARN: Code duplicated, block: B:89:0x022f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0232  */
    /* JADX WARN: Code duplicated, block: B:92:0x024a  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f7, code lost:
    
        if (r6 == r8) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x026d, code lost:
    
        if (r3 == r8) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
