package id;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends ed.a {
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f5287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5288g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, o oVar, int i, int i10, int i11) {
        super(str, true);
        this.e = i11;
        this.f5287f = oVar;
        this.f5288g = i;
        this.h = i10;
    }

    @Override // ed.a
    public final long a() {
        switch (this.e) {
            case 0:
                o oVar = this.f5287f;
                try {
                    oVar.H.E(this.f5288g, this.h, true);
                    return -1L;
                } catch (IOException e) {
                    oVar.c(2, 2, e);
                    return -1L;
                }
            case 1:
                z zVar = this.f5287f.f5306v;
                int i = this.h;
                zVar.getClass();
                da.v.q(i, "errorCode");
                synchronized (this.f5287f) {
                    this.f5287f.J.remove(Integer.valueOf(this.f5288g));
                }
                return -1L;
            default:
                o oVar2 = this.f5287f;
                try {
                    int i10 = this.f5288g;
                    int i11 = this.h;
                    da.v.q(i11, "statusCode");
                    oVar2.H.G(i10, i11);
                    return -1L;
                } catch (IOException e4) {
                    oVar2.c(2, 2, e4);
                    return -1L;
                }
        }
    }
}
