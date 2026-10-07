package d3;

import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e3.k f2826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f2827c;

    public /* synthetic */ l(m mVar, e3.k kVar, int i) {
        this.f2825a = i;
        this.f2827c = mVar;
        this.f2826b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2825a) {
            case 0:
                this.f2826b.j(this.f2827c.f2832d.getForegroundInfoAsync());
                return;
            default:
                m mVar = this.f2827c;
                e3.k kVar = mVar.f2829a;
                ListenableWorker listenableWorker = mVar.f2832d;
                c3.i iVar = mVar.f2831c;
                try {
                    t2.g gVar = (t2.g) this.f2826b.get();
                    if (gVar == null) {
                        throw new IllegalStateException("Worker was marked important (" + iVar.f1746c + ") but did not provide ForegroundInfo");
                    }
                    t2.m.d().a(m.f2828r, "Updating notification for " + iVar.f1746c, new Throwable[0]);
                    listenableWorker.setRunInForeground(true);
                    o oVar = mVar.e;
                    Context context = mVar.f2830b;
                    UUID id2 = listenableWorker.getId();
                    oVar.getClass();
                    e3.k kVar2 = new e3.k();
                    ((a2.l) oVar.f2839a).m(new n(oVar, kVar2, id2, gVar, context, 0));
                    kVar.j(kVar2);
                    return;
                } catch (Throwable th) {
                    kVar.i(th);
                    return;
                }
        }
    }
}
