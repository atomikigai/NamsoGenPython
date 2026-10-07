package l3;

import android.widget.Toast;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements ic.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.w f6522d;

    public /* synthetic */ b0(int i, androidx.fragment.app.w wVar, c3.j jVar, jc.q qVar) {
        this.f6519a = i;
        this.f6520b = qVar;
        this.f6521c = jVar;
        this.f6522d = wVar;
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        switch (this.f6519a) {
            case 0:
                jc.q qVar = (jc.q) this.f6520b;
                c3.j jVar = (c3.j) this.f6521c;
                androidx.fragment.app.w wVar = this.f6522d;
                n3.c cVar = (n3.c) obj;
                jc.i.e(cVar, "premiumEntry");
                qVar.f5776a = cVar;
                r7.g.E(qVar, jVar, wVar);
                break;
            case 1:
                jc.q qVar2 = (jc.q) this.f6520b;
                c3.j jVar2 = (c3.j) this.f6521c;
                androidx.fragment.app.w wVar2 = this.f6522d;
                n3.c cVar2 = (n3.c) obj;
                jc.i.e(cVar2, "freeEntry");
                qVar2.f5776a = cVar2;
                r7.g.E(qVar2, jVar2, wVar2);
                break;
            default:
                g.f fVar = (g.f) this.f6520b;
                androidx.fragment.app.w wVar3 = this.f6522d;
                ic.l lVar = (ic.l) this.f6521c;
                n3.b bVar = (n3.b) obj;
                jc.i.e(bVar, "pr");
                fVar.dismiss();
                k kVar = qd.b.f8069a;
                boolean zBooleanValue = kVar != null ? ((Boolean) kVar.invoke(bVar)).booleanValue() : false;
                if (!zBooleanValue) {
                    Toast.makeText(wVar3, R.string.profile_open_failed, 0).show();
                }
                lVar.invoke(Boolean.valueOf(zBooleanValue));
                break;
        }
        return ub.k.f9073a;
    }

    public /* synthetic */ b0(g.f fVar, androidx.fragment.app.w wVar, ic.l lVar) {
        this.f6519a = 2;
        this.f6520b = fVar;
        this.f6522d = wVar;
        this.f6521c = lVar;
    }
}
