package l;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f6282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f6283b;

    public h(j jVar, f fVar) {
        this.f6283b = jVar;
        this.f6282a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k.j jVar;
        j jVar2 = this.f6283b;
        k.l lVar = jVar2.f6307c;
        if (lVar != null && (jVar = lVar.e) != null) {
            jVar.j(lVar);
        }
        View view = (View) jVar2.f6311s;
        if (view != null && view.getWindowToken() != null) {
            f fVar = this.f6282a;
            if (fVar.b()) {
                jVar2.D = fVar;
            } else if (fVar.e != null) {
                fVar.d(0, 0, false, false);
                jVar2.D = fVar;
            }
        }
        jVar2.F = null;
    }
}
