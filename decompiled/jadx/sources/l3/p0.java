package l3;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6633a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jc.o f6634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jc.o f6635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j3.c f6636d;
    public final /* synthetic */ g.f e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.w f6637f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ jc.o f6638r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a1 f6639s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6640t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ jc.q f6641u;

    public /* synthetic */ p0(j3.c cVar, jc.o oVar, jc.o oVar2, g.f fVar, androidx.fragment.app.w wVar, jc.o oVar3, a1 a1Var, ArrayList arrayList, jc.q qVar) {
        this.f6636d = cVar;
        this.f6634b = oVar;
        this.f6635c = oVar2;
        this.e = fVar;
        this.f6637f = wVar;
        this.f6638r = oVar3;
        this.f6639s = a1Var;
        this.f6640t = arrayList;
        this.f6641u = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6633a) {
            case 0:
                j3.c cVar = this.f6636d;
                cVar.e.setVisibility(8);
                android.support.v4.media.session.a.z(cVar, this.f6634b, this.f6635c, this.e, this.f6637f, this.f6638r, this.f6639s, this.f6640t, this.f6641u);
                break;
            default:
                jc.o oVar = this.f6634b;
                if (!oVar.f5774a) {
                    android.support.v4.media.session.a.z(this.f6636d, this.f6635c, oVar, this.e, this.f6637f, this.f6638r, this.f6639s, this.f6640t, this.f6641u);
                }
                break;
        }
    }

    public /* synthetic */ p0(jc.o oVar, jc.o oVar2, j3.c cVar, g.f fVar, androidx.fragment.app.w wVar, jc.o oVar3, a1 a1Var, ArrayList arrayList, jc.q qVar) {
        this.f6634b = oVar;
        this.f6635c = oVar2;
        this.f6636d = cVar;
        this.e = fVar;
        this.f6637f = wVar;
        this.f6638r = oVar3;
        this.f6639s = a1Var;
        this.f6640t = arrayList;
        this.f6641u = qVar;
    }
}
