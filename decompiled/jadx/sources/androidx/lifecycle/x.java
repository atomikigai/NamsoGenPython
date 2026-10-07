package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f1100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1102c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f1103d;

    public x(y yVar, z zVar) {
        this.f1103d = yVar;
        this.f1100a = zVar;
    }

    public final void b(boolean z4) {
        if (z4 == this.f1101b) {
            return;
        }
        this.f1101b = z4;
        int i = z4 ? 1 : -1;
        y yVar = this.f1103d;
        int i10 = yVar.f1107c;
        yVar.f1107c = i + i10;
        if (!yVar.f1108d) {
            yVar.f1108d = true;
            while (true) {
                try {
                    int i11 = yVar.f1107c;
                    if (i10 == i11) {
                        break;
                    }
                    boolean z10 = i10 == 0 && i11 > 0;
                    boolean z11 = i10 > 0 && i11 == 0;
                    if (z10) {
                        yVar.f();
                    } else if (z11) {
                        yVar.g();
                    }
                    i10 = i11;
                } catch (Throwable th) {
                    yVar.f1108d = false;
                    throw th;
                }
            }
            yVar.f1108d = false;
        }
        if (this.f1101b) {
            yVar.c(this);
        }
    }

    public boolean d(r rVar) {
        return false;
    }

    public abstract boolean e();

    public void c() {
    }
}
