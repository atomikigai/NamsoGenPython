package id;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends ed.a {
    public final /* synthetic */ int e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f5293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5294g;
    public final /* synthetic */ List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list) {
        super(str, true);
        this.f5293f = oVar;
        this.f5294g = i;
        this.h = list;
    }

    @Override // ed.a
    public final long a() {
        switch (this.e) {
            case 0:
                this.f5293f.f5306v.getClass();
                try {
                    this.f5293f.H.G(this.f5294g, 9);
                    synchronized (this.f5293f) {
                        this.f5293f.J.remove(Integer.valueOf(this.f5294g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f5293f.f5306v.getClass();
                try {
                    this.f5293f.H.G(this.f5294g, 9);
                    synchronized (this.f5293f) {
                        this.f5293f.J.remove(Integer.valueOf(this.f5294g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list, boolean z4) {
        super(str, true);
        this.f5293f = oVar;
        this.f5294g = i;
        this.h = list;
    }
}
