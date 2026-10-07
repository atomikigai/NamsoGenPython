package androidx.emoji2.text;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends jd.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f761a;

    public e(f fVar) {
        this.f761a = fVar;
    }

    @Override // jd.l
    public final void r(Throwable th) {
        ((l) this.f761a.f763b).d(th);
    }

    @Override // jd.l
    public final void s(a3.j jVar) {
        f fVar = this.f761a;
        fVar.f764c = jVar;
        fVar.f762a = new aa.c((a3.j) fVar.f764c, new wa.d(), ((l) fVar.f763b).h);
        l lVar = (l) fVar.f763b;
        lVar.getClass();
        ArrayList arrayList = new ArrayList();
        lVar.f772a.writeLock().lock();
        try {
            lVar.f774c = 1;
            arrayList.addAll(lVar.f773b);
            lVar.f773b.clear();
            lVar.f772a.writeLock().unlock();
            lVar.f775d.post(new j(arrayList, lVar.f774c, (Throwable) null));
        } catch (Throwable th) {
            lVar.f772a.writeLock().unlock();
            throw th;
        }
    }
}
