package z0;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ac.i implements ic.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1.c f10870b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b1.c cVar, yb.d dVar) {
        super(1, dVar);
        this.f10870b = cVar;
    }

    @Override // ac.a
    public final yb.d create(yb.d dVar) {
        return new d(this.f10870b, dVar);
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        return ((d) create((yb.d) obj)).invokeSuspend(ub.k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) throws IOException {
        ub.k kVar;
        Context context;
        zb.a aVar = zb.a.f11555a;
        int i = this.f10869a;
        ub.k kVar2 = ub.k.f9073a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r7.g.G(obj);
            return kVar2;
        }
        r7.g.G(obj);
        this.f10869a = 1;
        b1.c cVar = this.f10870b;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) cVar.f1345d.getValue()).edit();
        Set set = cVar.e;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (((SharedPreferences) cVar.f1345d.getValue()).getAll().isEmpty() && (context = cVar.f1344c) != null && !b1.a.a(context, "coins_prefs")) {
            throw new IOException(jc.i.h("coins_prefs", "Unable to delete SharedPreferences: "));
        }
        if (set == null) {
            kVar = null;
        } else {
            set.clear();
            kVar = kVar2;
        }
        if (kVar != zb.a.f11555a) {
            kVar = kVar2;
        }
        return kVar == aVar ? aVar : kVar2;
    }
}
