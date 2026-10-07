package b4;

import a4.n;
import a4.u;
import a4.v;
import a4.w;
import a4.x;
import com.bumptech.glide.load.data.l;
import java.util.ArrayDeque;
import u3.h;
import u3.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f1382b = h.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ib.c f1383a;

    public a(ib.c cVar) {
        this.f1383a = cVar;
    }

    @Override // a4.x
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // a4.x
    public final w b(Object obj, int i, int i10, i iVar) {
        n nVar = (n) obj;
        ib.c cVar = this.f1383a;
        if (cVar != null) {
            u uVar = (u) cVar.f5256b;
            v vVarA = v.a(nVar);
            Object objA = uVar.a(vVarA);
            ArrayDeque arrayDeque = v.f178b;
            synchronized (arrayDeque) {
                arrayDeque.offer(vVarA);
            }
            n nVar2 = (n) objA;
            if (nVar2 == null) {
                uVar.d(v.a(nVar), nVar);
            } else {
                nVar = nVar2;
            }
        }
        return new w(nVar, new l(nVar, ((Integer) iVar.c(f1382b)).intValue()));
    }
}
