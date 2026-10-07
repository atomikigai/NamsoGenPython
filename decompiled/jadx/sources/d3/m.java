package d3;

import android.content.Context;
import androidx.work.ListenableWorker;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f2828r = t2.m.f("WorkForegroundRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3.k f2829a = new e3.k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f2830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c3.i f2831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ListenableWorker f2832d;
    public final o e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f3.a f2833f;

    public m(Context context, c3.i iVar, ListenableWorker listenableWorker, o oVar, a2.l lVar) {
        this.f2830b = context;
        this.f2831c = iVar;
        this.f2832d = listenableWorker;
        this.e = oVar;
        this.f2833f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f2831c.f1757q || m0.b.b()) {
            this.f2829a.h(null);
            return;
        }
        e3.k kVar = new e3.k();
        a2.l lVar = (a2.l) this.f2833f;
        ((f3.b) lVar.f45d).execute(new l(this, kVar, 0));
        kVar.addListener(new l(this, kVar, 1), (f3.b) lVar.f45d);
    }
}
