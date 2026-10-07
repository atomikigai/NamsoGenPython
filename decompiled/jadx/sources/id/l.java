package id;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends ed.a {
    public final /* synthetic */ o e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ od.f f5292g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, o oVar, int i, od.f fVar, int i10, boolean z4) {
        super(str, true);
        this.e = oVar;
        this.f5291f = i;
        this.f5292g = fVar;
        this.h = i10;
    }

    @Override // ed.a
    public final long a() {
        try {
            z zVar = this.e.f5306v;
            od.f fVar = this.f5292g;
            int i = this.h;
            zVar.getClass();
            fVar.skip(i);
            this.e.H.G(this.f5291f, 9);
            synchronized (this.e) {
                this.e.J.remove(Integer.valueOf(this.f5291f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
