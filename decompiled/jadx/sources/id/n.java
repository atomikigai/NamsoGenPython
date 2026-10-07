package id;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends ed.a {
    public final /* synthetic */ o e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f5296g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, o oVar, int i, long j4) {
        super(str, true);
        this.e = oVar;
        this.f5295f = i;
        this.f5296g = j4;
    }

    @Override // ed.a
    public final long a() {
        o oVar = this.e;
        try {
            oVar.H.H(this.f5295f, this.f5296g);
            return -1L;
        } catch (IOException e) {
            oVar.c(2, 2, e);
            return -1L;
        }
    }
}
