package l3;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jc.o f6531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jc.o f6532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j3.c f6534d;
    public final /* synthetic */ androidx.fragment.app.w e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jc.q f6535f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g.f f6536r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a1 f6537s;

    public c1(jc.o oVar, jc.o oVar2, ArrayList arrayList, j3.c cVar, androidx.fragment.app.w wVar, jc.q qVar, g.f fVar, a1 a1Var) {
        this.f6531a = oVar;
        this.f6532b = oVar2;
        this.f6533c = arrayList;
        this.f6534d = cVar;
        this.e = wVar;
        this.f6535f = qVar;
        this.f6536r = fVar;
        this.f6537s = a1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.f6531a.f5774a || this.f6532b.f5774a) {
            return;
        }
        android.support.v4.media.session.a.F(this.f6533c, this.f6534d, this.e, this.f6535f, this.f6536r, this.f6537s);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
    }
}
