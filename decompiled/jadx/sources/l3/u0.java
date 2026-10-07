package l3;

import android.content.Context;
import android.content.DialogInterface;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u0 implements ic.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jc.o f6701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.w f6702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jc.q f6704d;
    public final /* synthetic */ jc.o e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jc.o f6705f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a1 f6706r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j3.c f6707s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g.f f6708t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6709u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ jc.q f6710v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f6711w;

    public /* synthetic */ u0(jc.o oVar, androidx.fragment.app.w wVar, ArrayList arrayList, jc.q qVar, jc.o oVar2, jc.o oVar3, a1 a1Var, j3.c cVar, g.f fVar, ArrayList arrayList2, jc.q qVar2, String str) {
        this.f6701a = oVar;
        this.f6702b = wVar;
        this.f6703c = arrayList;
        this.f6704d = qVar;
        this.e = oVar2;
        this.f6705f = oVar3;
        this.f6706r = a1Var;
        this.f6707s = cVar;
        this.f6708t = fVar;
        this.f6709u = arrayList2;
        this.f6710v = qVar2;
        this.f6711w = str;
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        final b1 b1Var = (b1) obj;
        jc.i.e(b1Var, "row");
        n3.c cVar = b1Var.f6523a;
        final jc.o oVar = this.f6701a;
        if (!oVar.f5774a) {
            final androidx.fragment.app.w wVar = this.f6702b;
            ea.j jVar = new ea.j((Context) wVar, R.style.KryptProxyDialog);
            ((g.b) jVar.f3530b).f3971d = cVar.f7247b + ':' + cVar.f7248c;
            jVar.f(R.string.proxy_delete_confirm);
            final ArrayList arrayList = this.f6703c;
            final jc.q qVar = this.f6704d;
            final jc.o oVar2 = this.e;
            final jc.o oVar3 = this.f6705f;
            final a1 a1Var = this.f6706r;
            final j3.c cVar2 = this.f6707s;
            final g.f fVar = this.f6708t;
            final ArrayList arrayList2 = this.f6709u;
            final jc.q qVar2 = this.f6710v;
            final String str = this.f6711w;
            jVar.j(R.string.proxy_delete, new DialogInterface.OnClickListener() { // from class: l3.o0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) throws JSONException {
                    b1 b1Var2 = b1Var;
                    s0 s0Var = new s0(b1Var2, 1);
                    ArrayList arrayList3 = arrayList;
                    vb.o.X(arrayList3, s0Var);
                    jc.q qVar3 = qVar;
                    Iterable iterable = (Iterable) qVar3.f5776a;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : iterable) {
                        if (!jc.i.a(((b1) obj2).a(), b1Var2.a())) {
                            arrayList4.add(obj2);
                        }
                    }
                    qVar3.f5776a = arrayList4;
                    android.support.v4.media.session.a.x(arrayList3);
                    boolean zIsEmpty = arrayList3.isEmpty();
                    jc.o oVar4 = oVar2;
                    jc.o oVar5 = oVar;
                    jc.o oVar6 = oVar3;
                    a1 a1Var2 = a1Var;
                    j3.c cVar3 = cVar2;
                    g.f fVar2 = fVar;
                    androidx.fragment.app.w wVar2 = wVar;
                    ArrayList arrayList5 = arrayList2;
                    jc.q qVar4 = qVar2;
                    if (zIsEmpty) {
                        android.support.v4.media.session.a.C(cVar3, oVar4, oVar5, fVar2, wVar2, oVar6, a1Var2, arrayList5, qVar4);
                    } else {
                        android.support.v4.media.session.a.D(oVar4, oVar5, oVar6, qVar4, arrayList5, arrayList3, cVar3, true, qVar3, wVar2, a1Var2, fVar2, str);
                    }
                }
            });
            jVar.g(R.string.cancel, null);
            jVar.m();
        }
        return ub.k.f9073a;
    }
}
